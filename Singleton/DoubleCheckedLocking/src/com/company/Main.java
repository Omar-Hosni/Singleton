package com.company;

class Singleton{

    private volatile static Singleton uniqueInstannce = null;

    private int data = 0;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstannce ==null){
            synchronized (Singleton.class){
                if(uniqueInstannce == null){
                    uniqueInstannce = new Singleton();
                }
            }
        }
        return uniqueInstannce;
    }

    void setData(int n){
        data = n;
    }

    int getData(){
        return data;
    }
}

public class Main {

    public static void main(String[] args) {
	Singleton s = Singleton.getInstance();
	s.setData(55);
        System.out.println("First instance: " + s);
        System.out.println("The data value is: " + s.getData());

        s = null;
        System.out.println("\nSecond instance: " + s);
        System.out.println("The data value is: " + s.getData());
    }
}
