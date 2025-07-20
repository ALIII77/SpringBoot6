package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "baseballCoach")
public class BaseballCoach implements Coach {


    public BaseballCoach () {
        System.out.println(" In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "implement dailyWorkout in BaseballCoach class:-)";
    }


}