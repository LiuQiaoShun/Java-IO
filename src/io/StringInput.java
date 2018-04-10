package io;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class StringInput {
    public static void main(String[] args) throws Exception  {
        //字节流输入
        InputStream is=new FileInputStream(new File("F:"+File.separator+"java.txt"));

        //字符流输入
        Reader reader=new InputStreamReader(is,"UTF-8");
        int count=-1;
        char[]data=new char[1024];
        while ((count=reader.read(data,2,8))!=-1){
            for (int i=0;i<count;i++){
                System.out.print(data[i]);
           }

        }
        reader.close();
    }
}
