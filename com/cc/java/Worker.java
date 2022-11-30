package com.cc.java;

public class Worker extends HoneyBee{
   
    public String doYourJob() {
        return "I'm a worker bee, I work all day!";
    }

    @Override
    public String fly() {
        // TODO Auto-generated method stub
        return "I believe, I can fly at 14mph!";
    }
}
