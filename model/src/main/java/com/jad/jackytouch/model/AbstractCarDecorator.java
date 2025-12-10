package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IDecorationSpecification;
import com.jad.jackytouch.share.IRealCar;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCarDecorator implements IRealCar {
    private IRealCar decoratedCar;
    private final AsciiAsset asciiAsset;
    private IDecorationSpecification specification;
    private final String name;


    public AbstractCarDecorator(String name, String filename, IDecorationSpecification defaultSpec) {
        this.name = name;
        this.asciiAsset = new AsciiAsset(filename);
        this.specification = defaultSpec;
    }

    @Override
    public void setDecoratedCar(IRealCar realCar) {
        this.decoratedCar = realCar;
    }

    @Override
    public char[][] getLooks() {
        return AsciiAsset.merge(this.decoratedCar.getLooks(), this.asciiAsset.getGrid());
    }

    @Override
    public List<String> getReport() {
        List<String> report = new ArrayList<>(this.decoratedCar.getReport());
        report.add("| " + this.specification.getDescription() + " " + this.name);
        return report;
    }

    @Override
    public void decorate(IRealCar decorator) {
    }

    @Override
    public void changeSpecificationOfTo(String name, IDecorationSpecification specification) {
        if (this.name.equals(name)) {
            this.specification = specification;
        } else {
            this.decoratedCar.changeSpecificationOfTo(name, specification);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}