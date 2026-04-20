/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ctf;

public class Joueur {
    private String nom;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Joueur)) return false;
        Joueur j = (Joueur) o;
        return nom.equals(j.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}