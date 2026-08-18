package com.s2p.implementations;

import com.s2p.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component("michelinTyre")
public class MichelinTyre implements Tyre
{
    public MichelinTyre()
    {
        System.out.println("MichelinTyre Bean Is Created");
    }

    @Override
    public String accelerate() {
        return "Accelerating Using Michelin Tyre";
    }

    @Override
    public String brake() {
        return "Braking Using Michelin Tyre";
    }
}
