package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
