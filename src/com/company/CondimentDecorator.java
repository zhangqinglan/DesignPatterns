package com.company;
//首先，必须让Condiment Decorator能够取代Beverage，所以将CondimentDecorator扩展自 Beverage 类。
//所有的调料装饰者都必须重新实现getDescription()方法。
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
