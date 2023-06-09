package org.genspark;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    @Qualifier("snapdragon")//This will specify which class to use if you have multiple classes. Ignores primary annotation
    MobileProcessor cpu;
    public void config() {
        System.out.println("Processor:Quad Core | RAM: 64 GB | Cam: 32 Mpx");
        cpu.Processor();
    }

}
