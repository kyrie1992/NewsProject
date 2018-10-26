package com.newsite.web.service;

import com.alibaba.fastjson.JSON;
import com.newsite.web.model.TreeNode;
import org.jacoco.core.analysis.*;
import org.jacoco.core.internal.analysis.BundleCoverageImpl;
import org.jacoco.core.tools.ExecFileLoader;
import org.jacoco.report.DirectorySourceFileLocator;
import org.jacoco.report.FileMultiReportOutput;
import org.jacoco.report.IReportVisitor;
import org.jacoco.report.html.HTMLFormatter;

import java.io.File;
import java.io.IOException;
import java.util.*;


/**
 * This example creates a HTML report for eclipse like projects based on a
 * single execution data store called jacoco.exec. The report contains no
 * grouping information.
 *
 * The class files under test must be compiled with debug information, otherwise
 * source highlighting will not work.
 */
public class ReportGenerator {

    private final String title;

    private final File executionDataFile;
    private final File classesDirectory;
    private final File sourceDirectory;
    private final File reportDirectory;
    private IBundleCoverage resultBundleCoverage;
    private ExecFileLoader execFileLoader;

    public IBundleCoverage getResultBundleCoverage() {
        return resultBundleCoverage;
    }

    public void setResultBundleCoverage(IBundleCoverage resultBundleCoverage) {
        this.resultBundleCoverage = resultBundleCoverage;
    }

    /**
     * Create a new generator based for the given project.
     *
     * @param projectDirectory
     */
    public ReportGenerator(final File projectDirectory) {
        this.title = projectDirectory.getName();
        this.executionDataFile = new File(projectDirectory, "account.exec");//覆盖率的exec文件地址
        this.classesDirectory = new File(projectDirectory, "classes\\");//目录下必须包含源码编译过的class文件,用来统计覆盖率。所以这里用server打出的jar包地址即可
        this.sourceDirectory = new File(projectDirectory, "be-nsip-account-master\\");//源码的/src/main/java,只有写了源码地址覆盖率报告才能打开到代码层。使用jar只有数据结果
        this.reportDirectory = new File(projectDirectory, "coveragereport\\");//要保存报告的地址
    }

    /**
     * Create the report.
     *
     * @throws IOException
     */
    public void create() throws IOException {

        // Read the jacoco.exec file. Multiple data files could be merged
        // at this point
        loadExecutionData();

        // Run the structure analyzer on a single class folder to build up
        // the coverage model. The process would be similar if your classes
        // were in a jar file. Typically you would create a bundle for each
        // class folder and each jar you want in your report. If you have
        // more than one bundle you will need to add a grouping node to your
        // report
        final IBundleCoverage bundleCoverage = analyzeStructure();
        setResultBundleCoverage(bundleCoverage);
        //createReport(bundleCoverage);

    }

    private void createReport(final IBundleCoverage bundleCoverage)
            throws IOException {

        // Create a concrete report visitor based on some supplied
        // configuration. In this case we use the defaults
        final HTMLFormatter htmlFormatter = new HTMLFormatter();
        final IReportVisitor visitor = htmlFormatter
                .createVisitor(new FileMultiReportOutput(reportDirectory));

        // Initialize the report with all of the execution and session
        // information. At this point the report doesn't know about the
        // structure of the report being created
        visitor.visitInfo(execFileLoader.getSessionInfoStore().getInfos(),
                execFileLoader.getExecutionDataStore().getContents());

        // Populate the report structure with the bundle coverage information.
        // Call visitGroup if you need groups in your report.
        visitor.visitBundle(bundleCoverage, new DirectorySourceFileLocator(
                sourceDirectory, "utf-8", 4));

        // Signal end of structure information to allow report to write all
        // information out
        visitor.visitEnd();

    }

    private void loadExecutionData() throws IOException {
        execFileLoader = new ExecFileLoader();
        execFileLoader.load(executionDataFile);
    }

    private IBundleCoverage analyzeStructure() throws IOException {
        final CoverageBuilder coverageBuilder = new CoverageBuilder();
        final Analyzer analyzer = new Analyzer(
                execFileLoader.getExecutionDataStore(), coverageBuilder);

        analyzer.analyzeAll(classesDirectory);

        return coverageBuilder.getBundle(title);
    }

    /**
     * 封装结果为树形结构
     * @param bundleCoverage
     * @return
     */
    public static List<TreeNode> getResultTreeData(IBundleCoverage bundleCoverage){
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        if(bundleCoverage == null){
            return treeNodeList;
        }
        for(int i=0;i<bundleCoverage.getPackages().size();i++){
            Object packageObject = ((ArrayList) ((BundleCoverageImpl) bundleCoverage).getPackages()).get(i);
            if(packageObject==null){
                continue;
            }
            TreeNode treeNode = new TreeNode();
            treeNode.setText(((IPackageCoverage)packageObject).getName().replace("/","."));
            treeNode.setHref("node-"+i);
            treeNode.setTags(((IPackageCoverage)packageObject).getSourceFiles().size());

            List<TreeNode> treeNodeList2 = new ArrayList<TreeNode>();
            for(int j=0;j<((IPackageCoverage) packageObject).getSourceFiles().size();j++){
                Object packageObject2 = ((ArrayList)((IPackageCoverage) packageObject).getClasses()).get(j);
                if(packageObject2 == null){
                    continue;
                }
                TreeNode treeNode2 = new TreeNode();
                treeNode2.setText(((IClassCoverage)packageObject2).getSourceFileName());
                treeNode2.setHref("node-"+i+"-"+j);
                treeNode2.setTags(((IClassCoverage)packageObject2).getMethods().size());
                treeNodeList2.add(treeNode2);
            }
            treeNode.setNodes(treeNodeList2);
            treeNodeList.add(treeNode);
        }
        return treeNodeList;
    }
    /**
     * Starts the report generation process
     *
     * @param args
     *            Arguments to the application. This will be the location of the
     *            eclipse projects that will be used to generate reports for
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
        final ReportGenerator generator = new ReportGenerator(new File("D:\\周报\\20181022-20181026\\覆盖率测试\\"));
        generator.create();
        System.err.println(JSON.toJSONString(generator));
    }

    public static IBundleCoverage getBundleCoverage() throws IOException{
        final ReportGenerator generator = new ReportGenerator(new File("D:\\周报\\20181022-20181026\\覆盖率测试\\"));
        generator.create();
        return generator.getResultBundleCoverage();
    }

}

