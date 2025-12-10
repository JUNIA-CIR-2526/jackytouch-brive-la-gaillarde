package com.jad.jackytouch.controller;

import com.jad.jackytouch.share.ICar;
import com.jad.jackytouch.share.IController;
import com.jad.jackytouch.share.IModel;
import com.jad.jackytouch.share.IView;

public class Controller implements IController {
    private IView view;
    private IModel model;

    public Controller(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void proceed() {
        ICar car = this.model.makeCar();
        this.view.displayCar(car);
        this.addAllTuning(car);
        this.changeSpecification(car);
    }

    private void addAllTuning(ICar car) {
      String[] tunings ={"Neon", "Rims", "Exhaust", "Spoiler"};
      for (String tuning : tunings) {
          this.model.addDecorator(car, tuning);
          this.view.displayCar(car);
      }

    }
    private void changeSpecification(final ICar car) {
        car.changeSpecificationOfTo("Neon", this.model.getSpecification("RandomLight"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Exhaust", this.model.getSpecification("Sport"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Rims", this.model.getSpecification("Improved Acceleration"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Spoiler", this.model.getSpecification("ReducedMaxSpeed"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Spoiler", this.model.getSpecification("Stability increased"));
        this.view.displayCar(car);


    }
}