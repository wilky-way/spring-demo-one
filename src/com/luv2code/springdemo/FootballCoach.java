package com.luv2code.springdemo;

public class FootballCoach implements Coach{
    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the football";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
