package io;

import user.User;

import java.io.*;

/**
 * Created by 8888 on 2018/1/10.
 */
public class ObjectInput {
    public static void main(String[] args) throws Exception{
        //write输出一个
         InputStream is=new FileInputStream("F://user.jpg");

        ObjectInputStream osi=new ObjectInputStream(is);
        User user=(User)osi.readObject();
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());

        osi.close();
        is.close();

    }

}
