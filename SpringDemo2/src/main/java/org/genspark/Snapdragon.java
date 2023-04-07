package org.genspark;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor{
    @Override
    public void Processor(){
        System.out.println("Snapdragon: World's best processor");
    }
}
