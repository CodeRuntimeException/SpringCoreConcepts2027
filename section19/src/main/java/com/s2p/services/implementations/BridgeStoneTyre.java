package com.s2p.services.implementations;

import com.s2p.services.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class BridgeStoneTyre implements Tyre
{
    BridgeStoneTyre()
    {
        System.out.println("BridgeStoneTyre Bean Created");
    }

    public void rotateTyre()
    {
        System.out.println("Rotating BridgeStone Tyres");
    }
}
