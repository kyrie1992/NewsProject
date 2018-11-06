package com.newsite.web.service;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;
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

    public static void main(String[] args) throws Exception{
        String gitFilePath = "D:\\git\\NewsProject";
        /*cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider("usernmae","password"));*/
        String currentBranch = getCurrentBranch(gitFilePath);
        System.out.println(currentBranch);
        String parentBranch = "f_coverReportShow";
        String childBranch = "f_coverReportShow1";
        try {
            Git git=Git.open(new File(gitFilePath));
            diffMethod(git,childBranch,parentBranch);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
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
