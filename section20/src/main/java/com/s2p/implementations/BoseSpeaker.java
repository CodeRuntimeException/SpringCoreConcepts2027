package com.s2p.implementations;

import com.s2p.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component("boseSpeakerBean")
public class BoseSpeaker implements Speaker
{

    public BoseSpeaker()
    {
        System.out.println("BoseSpeaker Bean Is Created");
    }

    @Override
    public String play() {
        return "Playing Music With Bose Speaker";
    }

    @Override
    public String stop() {
        return "Music Stopped With Bose Speaker";
    }

    @Override
    public String pause() {
        return "Music Paused With Bose Speaker";
    }
}
