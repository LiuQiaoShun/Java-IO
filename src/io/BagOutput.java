package io;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class BagOutput {
    public static void main(String[] args) throws Exception  {
        //字节流输入
        OutputStream os=new FileOutputStream(new File("F:"+File.separator+"java.txt"));

        //字符流输入
        Writer writer=new OutputStreamWriter(os,"UTF-8");
        BufferedWriter bw=new BufferedWriter(writer);

        bw.write("不是那明显的加上");
        bw.newLine();
        bw.write("不是那明显的加上");

        bw.flush();
        writer.flush();
        os.flush();

        bw.close();
        writer.close();
        os.close();
        System.out.println("over");

    }
}
