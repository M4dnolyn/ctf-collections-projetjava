package com.mycompany.ctf;

import java.util.*;

public class CTFManager {

    private List<Joueur> joueurs = new ArrayList<>();
    private Set<Challenge> challenges = new HashSet<>();
    private Map<Joueur, Integer> scores = new HashMap<>();

    public void ajouterJoueur(Joueur j) {
        if (!joueurs.contains(j)) {
            joueurs.add(j);
            scores.put(j, 0);
        }
    }

    public void ajouterChallenge(Challenge c) {
        challenges.add(c);
    }

    public void ajouterScore(Joueur j, int points) {
        if (scores.containsKey(j)) {
            scores.put(j, scores.get(j) + points);
        }
    }

    public void afficherScores() {
        for (Map.Entry<Joueur, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}