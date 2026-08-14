package com.s2p.services;

import com.s2p.services.interfaces.Speaker;
import com.s2p.services.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices
{
    private Speaker speaker = null;
    private Tyre tyre = null;

    @Autowired
    VehicleServices(@Qualifier("boseSpeakerBean") Speaker speaker, Tyre tyre)
    {
        System.out.println("Vehicle Services Bean Created");
        this.speaker = speaker;
        this.tyre = tyre;
    }


    public void playMusic()
    {
        speaker.makeSound();
    }

    public void travel()
    {
        tyre.rotateTyre();
    }

}
