package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//You can customize the name of your class for calling if you put the name next to the @Component
@Component ("myCar")
public class Car implements Vehicle {
    // Using autowired binds this Tyre variable to the xml file but for this case it isn't used because
    // we are using property


    @Autowired
    public Tyre ty;


    //This is for Constructor Injection
    public Car(){

    }
    public Car(Tyre ty){
       this.ty = ty;
    }

   //This is for Setter Injection
//   public Tyre getTy() {
//       return ty;
//   }
//
//   public void setTy(Tyre ty) {
//       this.ty = ty;
//   }

//    public void init(){
//        System.out.println("I am in init Method");
//    }
//    public void theEnd(){
//        System.out.println("I am in destroy method");
//    }

    public void drive(){
        System.out.println("I am driving a car "+ty);
    }
}
