package com.s2p.services;

import com.s2p.interfaces.Speaker;
import com.s2p.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
public class VehicleServices
{
    private Tyre tyre = null;
    private Speaker speaker = null;

    @Autowired
    public VehicleServices(@Qualifier("bridgeStoneBean") Tyre tyre, Speaker speaker)
    {
        this.tyre = tyre;
        this.speaker = speaker;
        System.out.println("VehicleServices Bean Is Created");
    }

    public String startJourney()
    {
        // Start
        Instant start = Instant.now(); // [Object: current-time and date]
        System.out.println("Function Started At : " + start.toEpochMilli());

        // Simulate
        int x = 0;
        for(int i=0; i < 10000000; i++)
        {
            x++;
            System.out.println(x);
            continue;
        }


        // Actual Operation
        String output1 =  tyre.accelerate();
        String output2 =  speaker.play();
        System.out.println("Tyre : " + output1);
        System.out.println("Speaker : " + output2);

        // End
        Instant end = Instant.now();
        System.out.println("Function Ended At : " + end.toEpochMilli());
        long duration =  Duration.between(start,end).toMillis();
        System.out.println("Function Took : " + duration);

        return "Journey Has Been Started";
    }

}
