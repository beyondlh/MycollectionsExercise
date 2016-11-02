package com.lh.nio;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by lh on 2016/11/2.
 */
public class CopyFileUtils {

    /**
     * @param sourcePath 原路径
     * @param targetPath 目标路径
     * @param isOverlay  如果目标路径存在，是否覆盖
     * @return 返回
     */
    public static boolean copyDirectory(String sourcePath, String targetPath, boolean isOverlay) throws Exception {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("源文件不存在");
        }
        if (!sourceFile.isDirectory()) {
            throw new FileNotFoundException("源文件不是目录");
        }



     /*   mkdir()
        只能在已经存在的目录中创建创建文件夹。
        mkdirs()
        可以在不存在的目录中创建文件夹。*/
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        } else {
            if (isOverlay) {
                targetFile.delete();
            }
        }
        return true;
    }

    ;


    public static boolean copyFile(String sourcePath, String targetPath, boolean isOverlay) throws Exception {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("源文件不存在");
        }
        if (!targetFile.exists()) {
            targetFile.createNewFile();
        } else {
            if (isOverlay) {
                targetFile.delete();
            }
        }
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
        byte[] bytes = new byte[256];
        int byteread = 0;
        while ((byteread=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,byteread);
        }
        fileOutputStream.flush();
        fileInputStream.close();
        fileOutputStream.close();
        return true;
    }

    private static void nioTransferCopy(File source, File target) {
        FileChannel in = null;
        FileChannel out = null;
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            inStream = new FileInputStream(source);
            outStream = new FileOutputStream(target);
            in = inStream.getChannel();
            out = outStream.getChannel();
            in.transferTo(0, in.size(), out);

            in.close();
            out.close();
            inStream.close();
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }


    static void copy() throws IOException {
        Path path1 = Paths.get("D:" + File.separator + "桌面文件备份\\data50.csv");
        Path path2  = Paths.get("D:\\test333\\data50.csv");
        Files.copy(path1,path2);
    }

    public static void main(String[] args) throws Exception {
        /*File.separator 平台无关*/
/*        File file = Paths.get("D:" + File.separator + "桌面文件备份\\data50.csv").toFile();
        CopyFileUtils.copyFile(file.getPath(), "F:\\路况评定去掉下行数据\\data50.csv", true);*/

        copy();
    }
}
