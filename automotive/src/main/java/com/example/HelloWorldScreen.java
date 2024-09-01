package com.example;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;

public class HelloWorldScreen extends Screen {
    public HelloWorldScreen(CarContext carContext) {
        super(carContext);
    }

    @NonNull
    @Override
    public Template onGetTemplate() {
        Row row = new Row.Builder().setTitle(" this is the test row hello").addText("example text").build();

        return new PaneTemplate.Builder(new Pane.Builder().addRow(row).build()).setTitle("Pane title").build();
    }
}