package com.lh.io;

import java.io.*;

/**
 * Created by lh on 2016/10/31.
 * 文件流：顾名思义，提供了更加便利和强大的文件流操作。
 * 缓冲流：增加了缓冲功能，提高了读写效率 但是注意一定要是使用flush()方法来处理缓冲区。
 * 转换流：将字节流转换成字符流。
 * 管道流：处理线程之间的通讯。
 */
public class IoTest {
    public static void main(String[] args) throws Exception {
        writeDataToFile();
        System.out.println("-------------------------");
        readDataFromFile();
        System.out.println("-------------------------");
        copyFile("D:" + File.separator, "test.txt", "D:" + File.separator, "test复制.txt");
    }

    /**
     * 写数据到文件 站在内存角度 将内存输出到文件，所以应该用输出流
     *
     * @throws Exception
     */
    public static void writeDataToFile() throws Exception {
        String filePath = "E:/test.txt";
        File file = new File(filePath);
        if (!file.exists()) {
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

    /**
     * 从文件读取数据
     *
     * @throws Exception
     */
    public static void readDataFromFile() throws Exception {
        String filePath = "D:/test.txt";
        File f = new File(filePath);
        if (!f.exists()) {
            f.createNewFile();
        }
        InputStream inputStream = new FileInputStream(f);
        byte[] buffer = new byte[(int) f.length()];
        int len = inputStream.read(buffer);
        inputStream.close();
        System.out.println(new String(buffer, 0, len));
    }

    /**
     * 文件拷贝 字节流 (通用)
     * 字节流的方式和这个类似，只不过使用的是(FileReader和FileWriter)，
     * 但是他只能拷贝字符文件，字节文件 会出现文件丢失数据的情况。
     * 所以为了通用 这里只展示通用的字节流方式
     */
    public static void copyFile(String fromPath, String fromFileName, String toPath, String tofileName) throws Exception {
        long st = System.currentTimeMillis();
        File f1 = new File(fromPath + File.separator + fromFileName);
        File f2 = new File(toPath + File.separator + tofileName);

        if (!f1.exists()) {
            System.out.println("源文件不存在!");
            return;
        }

        if (!f2.exists()) {
            f2.createNewFile();
        }
        //装饰器
        //new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(f2))));
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(f1));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(f2));

        //水桶打水的方式
        byte[] temp=new byte[256]; //“数据桶”，这个桶的大小视数据大小情况而定
        int read=0;
        while((read=br.read(temp))!=-1)
        {
            bw.write(temp,0,read);
        }
        bw.flush();
        //关闭操作应该放到finally块中，这里简单演示
        bw.close();
        br.close();
        long et=System.currentTimeMillis();
        System.out.println("拷贝完成，耗时:"+(et-st));

        BufferedReader bufferedReader = new BufferedReader(new FileReader(""));
    }
}
