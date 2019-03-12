package com.step.assignments.oop_part_1.generic_excersise_league;

import java.util.Comparator;
import java.util.List;

public class League<T extends Team> {

    String type;
    List<T> teams;

    public League(String type, List<T> teams) {
        this.type = type;
        this.teams = teams;
    }

    public void addTeam(T team) {
        teams.add(team);
    }

    public void sortTeams() {
        teams.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void printAllTeams() {
        this.sortTeams();
        for(T team:teams) {
            System.out.println(team.getName());
        }
    }
}
