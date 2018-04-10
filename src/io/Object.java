package io;

import user.User;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class Object {
    public static void main(String[] args) throws Exception  {
//        字节流输入
        OutputStream is=new FileOutputStream("F://user.jpg");
        ObjectOutput oos=new ObjectOutputStream(is);
        oos.writeObject(new User(1L,"ajk",20));

        oos.flush();
        is.flush();

        oos.close();
        is.close();
        System.out.println("序列化成功！");
    }
}
