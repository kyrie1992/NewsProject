package com.newsite.web.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件帮助类
 * Created by nawei on 2018/10/26.
 */
public class FileUtils {
    static int countFiles = 0;// 声明统计文件个数的变量
    static int countFolders = 0;// 声明统计文件夹的变量

    public static File[] searchFile(File folder, final String keyWord) {// 递归查找包含关键字的文件

        File[] subFolders = folder.listFiles(new FileFilter() {// 运用内部匿名类获得文件
            public boolean accept(File pathname) {// 实现FileFilter类的accept方法
                if (pathname.isFile())// 如果是文件
                    countFiles++;
                else
                    // 如果是目录
                    countFolders++;
                if (pathname.isDirectory()
                        || (pathname.isFile() && pathname.getName().toLowerCase().contains(keyWord.toLowerCase())))// 目录或文件包含关键字
                    return true;
                return false;
            }
        });

        List<File> result = new ArrayList<File>();// 声明一个集合
        for (int i = 0; i < subFolders.length; i++) {// 循环显示文件夹或文件
            if (subFolders[i].isFile()) {// 如果是文件则将文件添加到结果列表中
                result.add(subFolders[i]);
            } else {// 如果是文件夹，则递归调用本方法，然后把所有的文件加到结果列表中
                File[] foldResult = searchFile(subFolders[i], keyWord);
                for (int j = 0; j < foldResult.length; j++) {// 循环显示文件
                    result.add(foldResult[j]);// 文件保存到集合中
                }
            }
        }

        File files[] = new File[result.size()];// 声明文件数组，长度为集合的长度
        result.toArray(files);// 集合数组化
        return files;
    }


    /**
     * 读取一个文件的内容，将内容返回
     *
     * @param file
     * @return String
     */
    public static String readFile(File file) {
        StringBuffer retBuffer = new StringBuffer();
        if (file != null && file.exists()) {
            try {
                FileInputStream finputStream = new FileInputStream(file);
                byte[] buffer = new byte[512];
                int i = 1;
                while (finputStream.read(buffer, 0, 512) != -1) {
                    retBuffer.append(new String(buffer, "utf-8"));
                    buffer = new byte[512];// 每次清空缓存保证每次都是新的数据，不会遗留上次缓存的数据。
                }
                finputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return retBuffer.toString();
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
      /*  File file = new File("D:\\周报\\20181022-20181026\\覆盖率测试\\be-nsip-account-master\\clear-settle-core\\src\\main\\java\\com\\netease\\nsip\\settle\\core\\admin\\dao\\impl\\RequestLimitInfoDaoImpl.java");
        System.out.println(readFile(file));*/

        File folder = new File("D:\\周报");// 默认目录
        String keyword = "RequestLimitInfoDaoImpl.java";
        if (!folder.exists()) {// 如果文件夹不存在
            System.out.println("目录不存在：" + folder.getAbsolutePath());
            return;
        }
        File[] result = searchFile(folder, keyword);// 调用方法获得文件数组
        System.out.println("在 " + folder + " 以及所有子文件时查找对象" + keyword);
        System.out.println("查找了" + countFiles + " 个文件，" + countFolders + " 个文件夹，共找到 " + result.length + " 个符合条件的文件：");
        for (int i = 0; i < result.length; i++) {// 循环显示文件
            File file = result[i];
            System.out.println(file.getAbsolutePath() + " ");// 显示文件绝对路径

            File file1 = new File(file.getAbsolutePath());
            System.out.println(readFile(file1));
        }


    }


}
