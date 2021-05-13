package com.company;

class Singleton {
    private Singleton() {
    }

    private static class SingletonHelper {

        private static final Singleton s = new Singleton();
    }

    public static Singleton getSingleton() {
    return SingletonHelper.s;
}


}

public class Main {

    public static void main(String[] args) {
        System.out.println("SINGLE PATTERN DEMO");
        System.out.println("Trying to make a singleton for our team");

        Singleton s1 = Singleton.getSingleton();

        Singleton s2 = Singleton.getSingleton();

        if(s1 == s2){
            System.out.println("yes they are equal");
        }
    }
}

//repeating for exercising , nothing more...

class Singleton2{
    private Singleton2(){}
    private int data;
    private static class SingletonHelper2 {
        private static final Singleton2 s2 = new Singleton2();
    }
    private static Singleton2 getSingleton(){
        return SingletonHelper2.s2;
    }

    void setData(int n){
        data = n;
    }

    int getData(){
        return data;
    }
}
