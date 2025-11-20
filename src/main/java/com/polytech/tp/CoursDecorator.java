package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected ICours cours;

    public CoursDecorator(ICours cours) {
        this.cours = cours;
    }
    
    // TODO: Forcer l'implémentation des méthodes de ICours
    
    @Override
    public String getDescription() {
        return cours.getDescription();
    }

    @Override
    public double getDuree() {
        return cours.getDuree();
    }
}