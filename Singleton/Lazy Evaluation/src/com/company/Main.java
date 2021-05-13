package com.company;

class Singleton {

//the private reference to the one and only instance
    private static Singleton uniqueInstance = null; //default value

    //an instance attribute
    private int data = 0;

    /**
     * the singelton constructor
     * note that it is private
     * no client can instantiate a singeltone object
     */

    private Singleton(){}

    public static Singleton getInstance(){

        if(uniqueInstance == null) {
           uniqueInstance = new Singleton();
        }

        return uniqueInstance;
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

