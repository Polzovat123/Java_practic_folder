package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        System.out.println(Cup.f);
        Cup l = new Cup();
    }
}

class Cupier{
    Cupier(int x){
        System.out.println(x);
    }
}

class Cup{
    static Cupier f;
    static Cupier w;
    static {
        f = new Cupier(12);
        w = new Cupier(132);
    }
    Cup() {
        System.out.println("1001");
    }
}
