package com.patterns.structural.decorator;

import config.Log4jPropertiesConfiguration;

public class BorderThicknessDecorator extends ShapeDecorator{

    private String thickness;

    public BorderThicknessDecorator(Shape decoratedShape, String thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        // decoro antes
        this.decoratedShape.draw();
        // decoro despues
        Log4jPropertiesConfiguration.logger.debug("Border thickness is:  " + this.thickness);
    }

    @Override
    public void resize() {
        this.decoratedShape.resize();
        // TODO decorar
    }

    @Override
    public String description() {
        return this.decoratedShape.description() + " decorated with border thickness: " + thickness;
    }

    @Override
    public boolean isHide() {
        return this.decoratedShape.isHide();
    }
}