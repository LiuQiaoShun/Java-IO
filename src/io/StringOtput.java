package io;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class StringOtput {
    public static void main(String[] args) throws Exception  {
        //字节流输入
        OutputStream os=new FileOutputStream(new File("F:"+File.separator+"java.txt"));

        //字符流输入
        Writer writer=new OutputStreamWriter(os,"UTF-8");
        writer.write("无聊的流");

        writer.flush();
        os.flush();

        writer.close();
        os.close();
        System.out.println("over");

    }
}
