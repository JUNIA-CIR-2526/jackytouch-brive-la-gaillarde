package com.jad.jackytouch.share;

import java.util.List;

public interface ICar {
    char[][] getLooks();
    List<String> getReport();
    void decorate(IRealCar decorator);
    void changeSpecificationOfTo(String name, IDecorationSpecification specification);
}