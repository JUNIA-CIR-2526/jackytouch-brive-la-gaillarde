package com.jad.jackytouch.model;

import com.jad.jackytouch.share.ICar;
import com.jad.jackytouch.share.IDecorationSpecification;
import com.jad.jackytouch.share.IRealCar;
import java.util.List;

public class Car implements ICar {
    private IRealCar head;

    public Car() {
        this.head = new BaseCar();
    }

    @Override
    public char[][] getLooks() {
        return this.head.getLooks();
    }

    @Override
    public List<String> getReport() {
        return this.head.getReport();
    }

    @Override
    public void decorate(IRealCar decorator) {
        decorator.setDecoratedCar(this.head);
        this.head = decorator;
    }

    @Override
    public void changeSpecificationOfTo(String name, IDecorationSpecification specification) {
        this.head.changeSpecificationOfTo(name, specification);
    }
}