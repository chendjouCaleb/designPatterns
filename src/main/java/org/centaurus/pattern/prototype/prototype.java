package org.centaurus.pattern.prototype;

public class prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");
        BasicCar nano_base = new Nano("Green Nano");

        nano_base.price = 10000;

        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price=500000;

        BasicCar basicCar1 = nano_base.clone();
        basicCar1.price = nano_base.price+BasicCar.setPrice();
        System.out.println("Car is: "+ basicCar1.modelname+" and it's price is Rs."+basicCar1.price);

        basicCar1 =ford_basic.clone();
//Price will be more than 500000 for sure
        basicCar1.price = ford_basic.price+BasicCar.setPrice();
        System.out.println("Car is: "+ basicCar1.modelname+" and it's price is Rs."+basicCar1.price);
    }}
