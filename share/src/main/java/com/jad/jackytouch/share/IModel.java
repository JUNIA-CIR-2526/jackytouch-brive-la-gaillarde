package com.jad.jackytouch.share;

public interface IModel {

    char[][] getCarLooks();


    String[] getCarReport();

    void addSpoiler();

    void addNeon();

    void addRims();

    void addExhaust();


    void toggleSpoilerBehavior();

    void toggleNeonBehavior();

    void toggleRimsBehavior();

    void toggleExhaustBehavior();
}