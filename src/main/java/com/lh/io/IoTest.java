package com.lh.io;

import java.io.*;

/**
 * Created by lh on 2016/10/31.
 */
public class IoTest {
    public static void main(String[] args) throws Exception
    {
        writeDataToFile();
        System.out.println("-------------------------");
     /*  readDataFromFile();
        System.out.println("-------------------------");
        copyFile("D:"+File.separator, "cxyapi.txt", "D:"+File.separator, "cxyapi复制.txt");*/
    }

    /**写数据到文件 站在内存角度 将内存输出到文件，所以应该用输出流
     * @throws Exception
     */
    public static void writeDataToFile() throws Exception
    {
        String filePath="E:/test.txt";
        File file=new File(filePath);
        if(!file.exists()){
           file.createNewFile();
        }
        String s = "测试文字";
       /* OutputStream outputStream = new FileOutputStream(file);
        byte[] data = s.getBytes();
        outputStream.write(data);
        outputStream.flush();
        outputStream.close();*/



        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(s);
        fileWriter.flush();
        fileWriter.close();
    }

    /**从文件读取数据
     * @throws Exception
     */
    public static void readDataFromFile() throws Exception
    {
        String filePath="D:/test.txt";
        File f=new File(filePath);
        if(!f.exists())
        {
            f.createNewFile();
        }
       InputStream inputStream = new FileInputStream(f);
        byte[] buffer = new byte[(int)f.length()];
        int len = inputStream.read(buffer);
        inputStream.close();
        System.out.println(new String(buffer,0,len));
    }

    /** 文件拷贝 字节流 (通用)
     * 字节流的方式和这个类似，只不过使用的是(FileReader和FileWriter)，
     * 但是他只能拷贝字符文件，字节文件 会出现文件丢失数据的情况。
     * 所以为了通用 这里只展示通用的字节流方式
     */
    public static void copyFile(String fromPath,String fromFileName,String toPath,String tofileName) throws Exception
    {

    }
}
