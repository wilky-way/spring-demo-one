package com.luv2code.springdemo;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the football";
    }

    @Override
    public String getDailyFortune() {
        return "We Must Protect This House " + fortuneService.getFortune();
    }
}
