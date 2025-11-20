package com.polytech.tp;

public class CoursMagistralDecorator extends CoursDecorator {
    
    public CoursMagistralDecorator(ICours cours) {
        super(cours);
    }
    
    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (Magistral)";
    }
}