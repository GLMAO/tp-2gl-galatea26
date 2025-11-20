package com.polytech.tp;

public class CoursEnAnglaisDecorator extends CoursDecorator {
    
    public CoursEnAnglaisDecorator(ICours cours) {
        super(cours);
    }
    
    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En anglais)";
    }
}