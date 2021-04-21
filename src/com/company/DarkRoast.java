package com.company;

public class DarkRoast extends Beverage{
    //为了要设置饮料的描述，我们写了一个构造器。记住，description实例变量继承自Beverage。
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
