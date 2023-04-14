package com.genspark;

import java.util.ArrayList;

public class tempClass {


    public static void main(String[]args){

        ArrayList<Integer> list = new ArrayList<>();
        int i=0;

        while(list.size()<19){

            if(isDisarium(i)){
                list.add(i);
            }
            i++;
        }

        for(Integer g : list){
            System.out.print(g+" : ");
        }
    }
    public static boolean isDisarium(int input){

        int temp = input;
        int count=0;
        int disarium=0;

        //Finding the number of digits in the input
        do{
            temp/=10;
            count++;
        }while(temp!=0);

        //reset temp number back to the input
        temp =input;

        //Pick the right most digit and raise to the power base on its position and add it to the sum of disarium
        // ex: 98 = 9^2 + 8^1 = 81 + 8
        for(int i=count;i>0;i--){
            int digit = temp%10;
            temp/=10;

            disarium +=Math.pow(digit,i);
        }

        if(disarium == input){
            return true;
        }
        return false;
    }
}
