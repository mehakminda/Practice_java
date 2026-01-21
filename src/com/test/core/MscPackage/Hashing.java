package com.test.core.MscPackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        String input="mehak";

        //creating an object of abstract class, by using getinstances method
        // Step 1: Create a MessageDigest object for SHA-256
        MessageDigest md=MessageDigest.getInstance("SHA-256");

        //Pass the input as byte array to message digest
        byte[] inputByte=input.getBytes(); //ab in byte array is 9798, utf-8 format
        md.update(inputByte);

        /*for(int i=0;i<digestByte.length;i++){
            System.out.print(digestByte[i]);
        }*/

        //generate the message digest as a byte array
        byte[] digestBytes=md.digest(); //something this like [22, -102, 9, -20, 29, -10, 81, -80, 112, -3, 17, 31, 63, 61, 96, -70, 86, -65, -84, -93, -15, 37, -101, 55, 24, -91, -61, 7, 97, 32, 23, -64]

        /*for(int i=0;i<digestBytes.length;i++){
            System.out.print(digestBytes[i]);
        }*/

        //convert byte array to hexadecimal format
        StringBuilder s=new StringBuilder();
        for(byte b:digestBytes){
            s.append(String.format("%02x",b)); //%02x means 2 digit hexadecimal format, add zero if only one digit is there
        }

        System.out.println("The hashed output is: "+s.toString());


    }
}
