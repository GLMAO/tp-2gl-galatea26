package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String message = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(message);
        notifyObservers(message);
    }

    public void modifierCours(ICours cours, String message) {
        String fullMessage = "Cours modifié : " + cours.getDescription() + " - " + message;
        System.out.println("Cours modifié : " + message);
        notifyObservers(fullMessage);
    }

    public void annulerCours(ICours cours, String raison) {
        this.listeCours.remove(cours);
        String message = "Cours annulé : " + cours.getDescription() + " - Raison: " + raison;
        System.out.println("Cours annulé : " + cours.getDescription());
        notifyObservers(message);
    }

    public void setChangement(String changement) {
        notifyObservers(changement);
    }

    public List<Observer> getObservers() {
        return new ArrayList<>(observers);
    }
}