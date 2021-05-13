package com.company;

class Singleton {


    //an instance attribute
    private int data = 0;

    /**
     * the singelton constructor
     * note that it is private
     * no client can instantiate a singeltone object
     */

    private Singleton(){}

    private static class SingletonHelper{
        //Nested Class is referebced after getUbstance() is called
        private static final Singleton uniqueInstance = new Singleton();


    }
    public static Singleton getInstance(){

        return SingletonHelper.uniqueInstance;
    }

    //add a set data here
    public void setData(int myData){
        data = myData;
    }

    //add a getter for data here
    public int getData(){
        return data;
    }
}

public class Main{
    public static void main(String[] args){
        Singleton s = Singleton.getInstance();

        //set data value
        s.setData(55);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        s = null;
        s = Singleton.getInstance();

        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}

