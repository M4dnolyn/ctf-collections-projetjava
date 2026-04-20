/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ctf;

public class Main {
    public static void main(String[] args) {
        CTFManager manager = new CTFManager();

        Joueur j1 = new Joueur("Alice");
        Joueur j2 = new Joueur("Bob");

        manager.ajouterJoueur(j1);
        manager.ajouterJoueur(j2);

        manager.ajouterChallenge(new Challenge("SQL Injection"));
        manager.ajouterChallenge(new Challenge("XSS"));

        manager.ajouterScore(j1, 100);
        manager.ajouterScore(j2, 200);

        manager.afficherScores();
    }
}
