package com.s2p.services.implementations;

import com.s2p.services.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component("michelinTyreBean")
public class MichelinTyre implements Tyre
{
    MichelinTyre()
    {
        System.out.println("MichelinTyre Bean Created");
    }

    @Override
    public void rotateTyre()
    {
        System.out.println("Rotating Michelin Tyres");
    }
}
