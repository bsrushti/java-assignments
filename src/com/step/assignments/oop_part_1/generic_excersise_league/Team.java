package com.step.assignments.oop_part_1.generic_excersise_league;


public class Team<T extends Team> {

    private String name;
    private int won;
    private int lost;
    private int draw;

    public Team(String name, int won, int lost, int draw) {
        this.name = name;
        this.won = won;
        this.lost = lost;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public int calculateTotal() {
        return this.won + this.draw;
    }

    public int compareTo(T otherTeam) {
        int myTeamScore = this.calculateTotal();
        int otherTeamScore = otherTeam.calculateTotal();
        return myTeamScore - otherTeamScore;
    }
}
