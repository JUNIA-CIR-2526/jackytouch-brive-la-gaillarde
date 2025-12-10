package com.jad;

import com.jad.jackytouch.controller.Controller;
import com.jad.jackytouch.model.Model;
import com.jad.jackytouch.share.IController;
import com.jad.jackytouch.share.IModel;
import com.jad.jackytouch.share.IView;
import com.jad.jackytouch.view.View;

public class Main {
    public static void main(String[] args) {

        IModel model = new Model();
        IView view = new View();
        Controller controller = new Controller(view, model);
        controller.proceed();

    }
}