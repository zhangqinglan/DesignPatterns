package com.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing"+name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce. J");
    }
}
