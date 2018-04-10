package io;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class DataInput {
    public static void main(String[] args) throws Exception  {

//        字节流输入
        InputStream is=new FileInputStream(new File("C:\\Users\\8888\\Desktop\\柯南.txt"));

        //数据流输入
        DataInputStream dis=new DataInputStream(is);

        //字节流输出
        OutputStream os=new FileOutputStream(new File("F:\\柯南.txt"));
        //数据流输入
        DataOutputStream dos=new DataOutputStream(os);

        //复制
        int count=-1;
        byte[]data=new byte[1024*10];
        while ((count=dis.read(data))!=-1){
            dos.write(data,0,count);
            System.out.println("正在复制中请稍等........");
        }
        dos.flush();
        os.flush();

        dos.close();
        os.close();
        dis.close();
        is.close();
    }
}
