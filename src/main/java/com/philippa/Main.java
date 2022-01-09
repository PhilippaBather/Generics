package com.philippa;

import domain.*;

public class Main {

    public static void main(String[] args) {

        Premiership astonVilla = new Premiership("Aston Villa F.C.");
        Premiership brighton = new Premiership("Brighton and Hove Albion");
        Premiership brentford = new Premiership("Brentford F.C.");
        Premiership everton = new Premiership("Everton F.C.");
        LeagueOne pompey = new LeagueOne("Portsmouth F.C.");

        brentford.addResult(astonVilla, 2, 1);      // brentford 3; aston 0
        brighton.addResult(brentford, 1, 2);        // brighton: 0; brentford 3
        everton.addResult(brighton, 2, 3);          // brighton: 3; everton 0
        brentford.addResult(brighton, 2, 2);        // brentford 1; brighton 1
        everton.addResult(astonVilla, 2, 1);

        Competition<Premiership> premiership = new Competition<>("Premiership");
        Competition<LeagueOne> leagueOne = new Competition<>("League One");

        premiership.addTeam(brighton);
        premiership.addTeam(brentford);
        premiership.addTeam(astonVilla);
        premiership.addTeam(everton);
        leagueOne.addTeam(pompey);

        premiership.sort();

    }
}
