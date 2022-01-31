package com.example.jenkins1.service;

public class UserIdGeneratorService {

    public static long generateId (){
        return System.currentTimeMillis()*21l;
    }
}
