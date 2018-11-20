package com.newsite.web.service;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.PullResult;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.diff.Edit;
import org.eclipse.jgit.diff.EditList;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.patch.FileHeader;
import org.eclipse.jgit.patch.HunkHeader;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by nawei on 2018/11/6.
 */
public class GitHelper {

    private static String remotePath = "https://github.com/kyrie1992/NewsProject.git";
    private static String localPath = "D:\\git\\NewsProject";
    private static String userName = "";
    private static String passWord = "";

    public static void main(String[] args) throws Exception{


        String testStr = "/fund-core/src/test/java/fund_core/HHBindTest.java";

       /* int startStrIndex = testStr.indexOf("com/");
        int strLength = testStr.length();
        String classPackageName = testStr.substring(startStrIndex,strLength);
        System.out.println(classPackageName);*/
       String type = "1";
       if(type.equals(Integer.valueOf("1").toString())){
           System.out.println("ok");
       }else{
           System.out.println("Error");
       }

        /*String gitFilePath = "D:\\git\\NewsProject";
        String currentBranch = getCurrentBranch(gitFilePath);
        System.out.println(currentBranch);
        diffMethod(Git.open(new File(localPath)),"master","f_coverReportShow");*/
        //gitCloneRemoteBranch();
        //checkoutBranch("f_coverReportShow");
        /*String parentBranch = "f_coverReportShow";
        String childBranch = "f_coverReportShow1";
        try {
            Git git=Git.open(new File(gitFilePath));
            diffMethod(git,childBranch,parentBranch);
        } catch (IOException e1) {
            e1.printStackTrace();
        }*/
    }

    public static void log(String localPath){
        try {
            Git git = Git.open(new File(localPath));
            LogCommand logCommand=git.log();
            Iterable<RevCommit> list=logCommand.call();
            for (RevCommit revCommit : list) {
                System.out.println(revCommit.getFullMessage());
                System.out.println(revCommit.getName());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    //切换分支
    public static void checkoutBranch(String branchName){
        String projectURL = localPath + "\\.git";

        Git git = null;
        try {
            git = Git.open(new File(projectURL));
            git.checkout().setCreateBranch(true).setName(branchName).call();
            git.pull().call();
            System.out.println("切换分支成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("切换分支失败");
        } finally{
            if (git != null) {
                git.close();
            }
        }
    }



    public static String gitCloneRemoteBranch() throws Exception{
        //设置远程服务器上的用户名和密码
        UsernamePasswordCredentialsProvider usernamePasswordCredentialsProvider =new
                UsernamePasswordCredentialsProvider(userName,passWord);
        Git git = Git.open(new File(localPath));
        PullResult pullResult = git.pull().setCredentialsProvider(usernamePasswordCredentialsProvider).call();
        System.out.print(git.tag());
        return "";
    }
    /**
     * 拿到当前本地分支名
     * @param localPath 主仓
     * @return
     * @throws IOException
     */
    public static String getCurrentBranch(String localPath) throws IOException{
        Git git = Git.open(new File(localPath));
        return git.getRepository().getBranch();
    }

    /**
     * 拿到当前远程分支名
     * @param localPath 主仓
     * @return
     * @throws IOException
     */
    public static String getCurrentRemoteBranch(String localPath) throws IOException {
        Git git = Git.open(new File(localPath));
        StoredConfig storedConfig = git.getRepository().getConfig();
        String currentRemote=storedConfig.getString("branch",getCurrentBranch(localPath), "remote");
        return currentRemote;
    }

    public static void diffMethod(Git git, String Child, String Parent){
        Repository repository = git.getRepository();
        ObjectReader reader = repository.newObjectReader();
        CanonicalTreeParser oldTreeIter = new CanonicalTreeParser();

        try {
            ObjectId old = repository.resolve(Child + "^{tree}");
            ObjectId head = repository.resolve(Parent+"^{tree}");
            oldTreeIter.reset(reader, old);
            CanonicalTreeParser newTreeIter = new CanonicalTreeParser();
            newTreeIter.reset(reader, head);
            List<DiffEntry> diffs= git.diff()
                    .setNewTree(newTreeIter)
                    .setOldTree(oldTreeIter)
                    .call();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            DiffFormatter df = new DiffFormatter(out);
            df.setRepository(git.getRepository());

            for (DiffEntry diffEntry : diffs) {
                df.format(diffEntry);
                String diffText = out.toString("UTF-8");
                System.out.println(diffText);

                FileHeader fileHeader = df.toFileHeader(diffEntry);
                List<HunkHeader> hunks = (List<HunkHeader>) fileHeader.getHunks();
                int addSize = 0;
                int subSize = 0;
                for(HunkHeader hunkHeader:hunks){
                    EditList editList = hunkHeader.toEditList();
                    for(Edit edit : editList){
                        subSize += edit.getEndA()-edit.getBeginA();
                        addSize += edit.getEndB()-edit.getBeginB();
                    }
                }
                //  out.reset();
            }
        } catch (IncorrectObjectTypeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e) {
            e.printStackTrace();
        }
    }





}
