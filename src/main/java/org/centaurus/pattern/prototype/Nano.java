package org.centaurus.pattern.prototype;

public class Nano extends BasicCar{
    public Nano(String m)
    {
        modelname = m;
    }

    public BasicCar clone() throws CloneNotSupportedException
    {
        return (Nano)super.clone();
    }
}
