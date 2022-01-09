package domain;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Generic class to implement a league table for a sport.
 * Class should allow teams to be added to the list and
 * store a list of teams belonging to the league.
 */
public class Competition<T extends Tier> {

    private final String title;
    private final ArrayList<T> teams = new ArrayList<>();

    public Competition(String title) {
        this.title = title;
    }

    /**
     * Add team to the teams ArrayList.
     * @param team
     * @return
     */
    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " already in " + team.getClass());
        } else {
            teams.add(team);
            return true;
        }
        return false;
    }

    public void sort() {
        Collections.sort(teams);
        System.out.println("***\t\t\t " + this.title + " Rankings \t\t\t***");
        for (T team:
             teams) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
