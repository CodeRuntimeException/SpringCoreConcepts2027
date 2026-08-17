package com.s2p.services.implementations;

import com.s2p.services.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component("sonySpeakerBean")
public class SonySpeaker implements Speaker
{
    SonySpeaker()
    {
        System.out.println("SonySpeaker Bean Created");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Sony Speaker Playing Music");
    }

}
