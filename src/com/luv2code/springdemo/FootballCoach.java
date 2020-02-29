package com.luv2code.springdemo;

public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Throw the football";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
