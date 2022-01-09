package com.philippa;

import domain.*;

public class Main {

    public static void main(String[] args) {

        Team<Premiership> astonVilla = new Team<>("Aston Villa");
        Team<Premiership> brentford = new Team<>("Brentford F.C.");
        Team<Premiership> brighton = new Team<>("Brighton and Hove Albion");
        Team<Premiership> everton = new Team<>("Everton F.C.");
        Team<LeagueOne> pompey = new Team<>("Portsmouth F.C.");
        Team<LeagueOne> cambridge = new Team<>("Cambridge United");

        League<Team<Premiership>> premiership = new League<>("Premiership");
        League<Team<LeagueOne>> leagueOne = new League<>("League One");

        brighton.addResult(brentford, 5, 4);
        pompey.addResult(cambridge, 0, 0);

        premiership.addTeam(astonVilla);
        premiership.addTeam(brighton);
        premiership.addTeam(brentford);
        premiership.addTeam(everton);
        // premiership.addTeam(pompey);     // doesn't work as expected; wrong type (LeagueOne not Premiership)
        premiership.sort();

        leagueOne.addTeam(pompey);
        leagueOne.addTeam(cambridge);
        leagueOne.sort();
    }
}
