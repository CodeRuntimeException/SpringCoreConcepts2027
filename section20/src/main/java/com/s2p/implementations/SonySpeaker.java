package com.s2p.implementations;

import com.s2p.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("sonySpeakerBean")
public class SonySpeaker implements Speaker
{
    public SonySpeaker()
    {
        System.out.println("SonySpeaker Bean Is Created");
    }

    @Override
    public String play() {
        return "Playing Music With Sony Speaker";
    }

    @Override
    public String stop() {
        return "Music Stopped With Sony Speaker";
    }

    @Override
    public String pause() {
        return "Music Paused With Sony Speaker";
    }
}
