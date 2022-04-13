package com.tal.jwt.util;

import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;

public class DataEnc {



    public static String setEncryptor(String data){
        StrongTextEncryptor encryptor = new StrongTextEncryptor();
        encryptor.setPassword("this is my key");
        return encryptor.encrypt(data);
    }

    public static String getEncryptor(String data){
        StrongTextEncryptor encryptor = new StrongTextEncryptor();
        encryptor.setPassword("this is my key");
        return encryptor.decrypt(data);
    }

}
