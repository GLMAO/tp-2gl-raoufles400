package com.polytech.tp;

public class CoursEnAnglais extends CoursDecorator {
    
    public CoursEnAnglais(ICours cours) {
        //TODO: Implémenter le reste ...
        super(cours);
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return cours.getDescription() + " (En Anglais)";
    }

    @Override
    public double getDuree() {
        // TODO Auto-generated method stub
        
        return cours.getDuree();
    };
}
