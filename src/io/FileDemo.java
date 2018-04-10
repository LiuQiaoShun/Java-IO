package io;

import java.io.*;

/**
 * Created by 8888 on 2018/1/9.
 */
public class FileDemo {
    public static void main(String[] args) {
        //读取一个
        try {
            InputStream is=new FileInputStream(new File("F:"+File.separator+"java.txt"));
            int data=-1;
            while ((data=is.read())!=-1){
                System.out.print((char)data);
            }
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        //读取一推
        try {
            InputStream is=new FileInputStream(new File("F:"+File.separator+"java.txt"));
            byte[]data=new byte[1024];
            int count=-1;
            while ((count=is.read(data))!=-1){
                for (int i=0;i<count;i++){
                    System.out.print((char)data[i]);
                }
            }
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        //读取一推，带偏移量读取
        try {
            InputStream is=new FileInputStream(new File("F:"+File.separator+"java.txt"));
            int count=-1;
            byte[] data=new byte[1024];
            data[0]=(byte)'a';
            data[1]=(byte)'b';
            data[2]='n';
            while ((count=is.read(data,3,data.length-3))!=-1){
                for (int i=0;i<count+3;i++){
                    System.out.print((char)data[i]);
                }
            }
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


















































































