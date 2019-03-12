package com.step.assignments.oop_part_1.generic_excersise_league;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CricketTeam indXiC = new CricketTeam("IND XI C", 1, 2, 3);
        CricketTeam ausXiC = new CricketTeam("AUS XI C", 2, 2, 0);
        CricketTeam rsaXiC = new CricketTeam("RSA XI C", 1, 1, 1);


        League<CricketTeam> cricketTeamLeauge = new League<CricketTeam>("Cricket Team", Arrays.asList(indXiC, ausXiC, rsaXiC));
        cricketTeamLeauge.printAllTeams();

        System.out.println("***************************");
        FootballTeam indXiF = new FootballTeam("IND XI F", 1, 2, 3);
        FootballTeam ausXiF = new FootballTeam("AUS XI F", 2, 2, 0);
        FootballTeam rsaXiF = new FootballTeam("RSA XI F", 1, 1, 1);


        League<FootballTeam> footballTeamLeauge = new League<FootballTeam>("Football Team", Arrays.asList(indXiF,ausXiF,rsaXiF));
        footballTeamLeauge.printAllTeams();
    }
}
