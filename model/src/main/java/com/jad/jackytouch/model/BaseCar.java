package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IDecorationSpecification;
import com.jad.jackytouch.share.IRealCar;
import java.util.Collections;
import java.util.List;

public class BaseCar implements IRealCar {
    private final AsciiAsset asset;

    public BaseCar() {
        this.asset = new AsciiAsset("car_base.txt");
    }

    @Override
    public char[][] getLooks() {
        return this.asset.getGrid();
    }

    @Override
    public List<String> getReport() {
        return Collections.emptyList();
    }

    @Override
    public void decorate(IRealCar decorator) {

    }

    @Override
    public void changeSpecificationOfTo(String name, IDecorationSpecification specification) {

    }

    @Override
    public void setDecoratedCar(IRealCar realCar) {
    }

    @Override
    public String getName() {
        return "BaseCar";
    }
}