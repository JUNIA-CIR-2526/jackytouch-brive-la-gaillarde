package com.jad.jackytouch.controller;

public class Controller {


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

}
