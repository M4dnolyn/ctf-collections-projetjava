/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ctf;

public class Challenge {
    private String titre;

    public Challenge(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return titre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Challenge)) return false;
        Challenge c = (Challenge) o;
        return titre.equals(c.titre);
    }

    @Override
    public int hashCode() {
        return titre.hashCode();
    }
}