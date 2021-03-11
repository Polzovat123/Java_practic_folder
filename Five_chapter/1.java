package com.company;

import java.util.*;

public class Main<T> {

    public static void main(String[] args) {
        Function.show_info();
        Function y = new Function(1 , "sosi");
    }
}

class Function{
    int x;
    String h;
    Function(int x){
        System.out.println("Construct-1");
        this.x = x;
    }
    Function(String h){
        System.out.println("Construct-2");
        this.h = h;
    }
    Function(int x, String h){
        this(x);
        System.out.println("Construct-3");
        this.h = h;
    }
    public static void show_info(){
        System.out.println("We alive!!!");
    }
}
