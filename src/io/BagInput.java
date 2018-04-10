package io;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class BagInput {
    public static void main(String[] args) throws Exception  {
//        字节流输入
        InputStream is=new FileInputStream(new File("F:"+File.separator+"java.txt"));

        //包装流输入
        Reader reader=new InputStreamReader(is,"UTF-8");
        //字符缓冲输入流
        BufferedReader br=new BufferedReader(reader);
        String context=null;
        while ((context=br.readLine())!=null){
            System.out.println(context);
        }
        br.close();
        reader.close();
        is.close();
    }
}
