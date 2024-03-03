package com.random.main;

import java.security.SecureRandom;

public class RandomNumberGenApp {
    public static void main(String[] args) {
        SecureRandom random =new SecureRandom();
        int randomNumber = random.nextInt(9);
        System.out.println(randomNumber);
    }
}
