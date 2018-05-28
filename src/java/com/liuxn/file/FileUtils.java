package com.liuxn.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018/4/9.
 */
public class FileUtils {

    public static void copyFolderByJgp(String oldPath, String newPath) {

        try {
            (new File(newPath)).mkdirs();  //如果文件夹不存在  则建立新文件夹    
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }

                String name = temp.getName();
                String suffix = name.substring(name.indexOf(".") + 1);
                if (temp.isFile() && "JPG".equals(suffix)) {
                    String newcanonicalPath = temp.getCanonicalPath();
                    System.out.println("原路径：" + newcanonicalPath);
                    System.out.println("新路径：" + newPath + File.separator + temp.getName());
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newPath + File.separator + name.toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();

                }
                if (temp.isDirectory()) {//如果是子文件夹    
                    copyFolderByJgp(oldPath + File.separator + file[i], newPath + File.separator + file[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("复制整个文件夹内容操作出错");
            e.printStackTrace();

        }

    }

    /**
     * 拷贝nef 后缀 的文件
     * @param oldPath 从一个文件夹
     * @param newNefPath 新的文件夹
     */
    public static void copyFolderByNef(String oldPath, String newNefPath) {

        try {
            (new File(newNefPath)).mkdirs();  //如果文件夹不存在  则建立新文件夹
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }
                String name = temp.getName();
                String suffix = name.substring(name.indexOf(".") + 1);
                if (temp.isFile() && "NEF".equals(suffix)) {
                    String newcanonicalPath = temp.getCanonicalPath();
                    System.out.println("原路径：" + newcanonicalPath);
                    System.out.println("新路径：" + newNefPath + File.separator + temp.getName());
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newNefPath + "/" + name.toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (temp.isDirectory()) {//如果是子文件夹
                    copyFolderByNef(oldPath + "/" + file[i], newNefPath + File.separator + file[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("复制整个文件夹内容操作出错");
            e.printStackTrace();

        }

    }


    public static void main(String[] args) {
        System.out.println("开始移动");
        String oldPath = "C:\\Users\\Administrator\\Desktop\\扬州";
        String newPath = "C:\\Users\\Administrator\\Desktop\\temp1";
        String newNefPath = "C:\\Users\\Administrator\\Desktop\\temp1\\nef";
        System.out.println("开始移动");
        copyFolderByJgp(oldPath, newPath);
        copyFolderByNef(oldPath,newNefPath);
        System.out.println("移动完毕");
    }
}
