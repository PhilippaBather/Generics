package com.philippa;

import domain.*;

public class Main {

    public static void main(String[] args) {

        Team<Premiership> astonVilla = new Premiership("Aston Villa");
        Team<Premiership> brentford = new Premiership("Brentford F.C.");
        Team<Premiership> brighton = new Premiership("Brighton and Hove Albion");
        Team<Premiership> everton = new Premiership("Everton F.C.");
        Team<LeagueOne> pompey = new LeagueOne("Portsmouth F.C.");
        Team<LeagueOne> cambridge = new LeagueOne("Cambridge United");

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
