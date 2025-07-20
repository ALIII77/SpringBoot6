package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "baseballCoach")
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "implement dailyWorkout in BaseballCoach class:-)";
    }
}