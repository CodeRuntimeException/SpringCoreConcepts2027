package com.s2p.services.implementations;

import com.s2p.services.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component("boseSpeakerBean")
public class BoseSpeaker implements Speaker
{
    BoseSpeaker()
    {
        System.out.println("BoseSpeaker Bean Created");
    }

    @Override
    public void makeSound()
    {
        System.out.println("BoseSpeaker Playing Music");
    }
}
