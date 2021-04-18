package com.avp.codewars.md5pin;
/*
Дан хеш md5 пятизначного ПИН-кода. Он представлен в виде строки. Md5 - это функция для хеширования вашего пароля:
"password123" ===> "482c811da5d5b4bc6d497ffa98491e38"
 */

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HackPinInMd5 {

    public String transformHashCodeMd5IntoPassword(String hashCodeMd5) {
        for (int i = 0; i < 100000; i++) {
            String password = String.valueOf(i);
            while (password.length() < 5) {
                password = "0" + password;
            }
            String hashNum = transformPinIntoMd5(password);
            if (hashNum.equalsIgnoreCase(hashCodeMd5)) {
                return password;
            }
        }
        return null;
    }
    public String transformPinIntoMd5(String password) {
        String md5 = null;
        if (null == password)
            return null;
        try {
            // Create MessageDigest object for MD5
            MessageDigest digest = MessageDigest.getInstance("MD5");
            // Update input string in message digest
            digest.update(password.getBytes(), 0, password.length());
            // Converts message digest value in base 16 (hex)
            md5 = new BigInteger(1, digest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.getStackTrace();
        }
        return md5;
    }
}
