package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("trackCoach")
public class TrackCoach implements Coach{

    public TrackCoach () {
        System.out.println(" In Constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return  "implement dailyWorkout in TrackCoach class:-)";
    }


}
