package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by 8888 on 2018/1/10.
 */
public class OuputFile {
    public static void main(String[] args) throws Exception{
        //write输出一个
//        OutputStream os=new FileOutputStream(new File("F:"+File.separator+"java.txt"),false);
//
//        os.write(87);
//        os.write(99);
//        os.write(77);
//        os.write(66);
//        os.flush();//刷新缓存
//        os.close();
//        System.out.println("over");

        //write输出一推
        OutputStream os1=new FileOutputStream(new File("F:"+File.separator+"java.txt"),false);
        byte []data="hello".getBytes();
        os1.write(data,3,2);
        os1.flush();
        os1.close();
    }

}
