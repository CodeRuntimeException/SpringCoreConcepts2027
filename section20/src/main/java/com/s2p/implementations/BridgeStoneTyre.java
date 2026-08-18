package com.s2p.implementations;

import com.s2p.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component("bridgeStoneBean")
public class BridgeStoneTyre implements Tyre
{
    public BridgeStoneTyre()
    {
        System.out.println("BridgeStoneTyre Bean Is Created");
    }

    @Override
    public String accelerate() {
        return "Accelerating Using BridgeStone Tyre";
    }

    @Override
    public String brake() {
        return "Braking Using BridgeStone Tyre";
    }
}
