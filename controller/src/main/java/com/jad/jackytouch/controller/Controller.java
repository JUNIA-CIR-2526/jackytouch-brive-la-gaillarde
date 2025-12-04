package com.jad.jackytouch.controller;

import com.jad.jackytouch.share.IController;
import com.jad.jackytouch.share.IModel;
import com.jad.jackytouch.share.IView;

public class Controller implements IController {
    private IView view;
    private IModel model;

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }

    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void proceed() {

        updateView();
    }


    @Override
    public void toggleSpoiler() {
        this.model.addSpoiler();

    }

    @Override
    public void toggleNeon() {
        this.model.addNeon();
    }

    @Override
    public void toggleRims() {
        this.model.addRims();
    }

    @Override
    public void toggleExhaust() {
        this.model.addExhaust();
    }

    @Override
    public void nextSpoilerMode() {
        this.model.toggleSpoilerBehavior();
    }

    @Override
    public void nextNeonMode() {
        this.model.toggleNeonBehavior();
    }

    @Override
    public void nextRimsMode() {
        this.model.toggleRimsBehavior();
    }

    @Override
    public void nextExhaustMode() {
        this.model.toggleExhaustBehavior();
    }


    private void updateView() {

        this.view.display(this.model.getCarLooks(), this.model.getCarReport());

    }
}