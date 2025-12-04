package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IModel;

import java.util.List;

public class Model implements IModel {
    private BaseCar baseCar;

    private Spoiler spoiler;
    private Neon neon;
    private Rims rims;
    private Exhaust exhaust;


    private boolean hasNeon = false;
    private boolean hasRims = false;
    private boolean hasExhaust = false;
    private boolean hasSpoiler = false;

    public Model() {
        this.baseCar = new BaseCar();


        this.spoiler = new Spoiler(null);
        this.neon = new Neon(null);
        this.rims = new Rims(null);
        this.exhaust = new Exhaust(null);
    }


    private Car buildCarChain() {
        Car c = this.baseCar;
        if (hasSpoiler) {
            spoiler.setCar(c);
            c = spoiler;
        }
        if (hasNeon) {
            neon.setCar(c);
            c = neon;
        }
        if (hasRims) {
            rims.setCar(c);
            c = rims;
        }
        if (hasExhaust) {
            exhaust.setCar(c);
            c = exhaust;
        }
        return c;
    }

    @Override
    public char[][] getCarLooks() {
        return this.buildCarChain().getLooks();
    }

    @Override
    public String[] getCarReport() {
        List<String> report = this.buildCarChain().getReport();
        return report.toArray(new String[0]);
    }

    @Override
    public void addSpoiler() {
        this.hasSpoiler = !this.hasSpoiler;
    }

    @Override
    public void addNeon() {
        this.hasNeon = !this.hasNeon;
    }

    @Override
    public void addRims() {
        this.hasRims = !this.hasRims;
    }

    @Override
    public void addExhaust() {
        this.hasExhaust = !this.hasExhaust;
    }

    @Override
    public void toggleSpoilerBehavior() {
        this.spoiler.nextBehavior();
    }

    @Override
    public void toggleNeonBehavior() {
        this.neon.nextBehavior();
    }

    @Override
    public void toggleRimsBehavior() {
        this.rims.nextBehavior();
    }

    @Override
    public void toggleExhaustBehavior() {
        this.exhaust.nextBehavior();
    }
}