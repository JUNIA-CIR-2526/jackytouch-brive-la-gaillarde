package com.jad.jackytouch.controller;

import com.jad.jackytouch.share.IController;
import com.jad.jackytouch.share.IModel;
import com.jad.jackytouch.share.IView;

public class Controller implements IController {


    private IView view;
    private IModel model;

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }

    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void proceed(){
        this.view.displayCar(this.model.getCar());
    }

}
