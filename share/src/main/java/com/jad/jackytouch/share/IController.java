package com.jad.jackytouch.share;

public interface IController {
    void setModel(IModel model);

    void setView(IView view);


    void proceed();

    void toggleSpoiler();

    void toggleNeon();

    void toggleRims();

    void toggleExhaust();

    void nextSpoilerMode();

    void nextNeonMode();

    void nextRimsMode();

    void nextExhaustMode();
}