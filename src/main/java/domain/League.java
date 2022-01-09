package domain;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Generic class to implement a league table for a sport.
 * Class should allow teams to be added to the list and
 * store a list of teams belonging to the league.
 */
public class League<T extends Team> {

    private final String title;
    private final ArrayList<T> league = new ArrayList<>();

    public League(String title) {
        this.title = title;
    }

    /**
     * Add team to the teams ArrayList unless already present.
     * @param team to be added to league
     * @return boolean
     */
    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " already in " + team.getClass());
        } else {
            league.add(team);
            return true;
        }
        return false;
    }

    /**
     * Sort ArrayList in descending order of rankings and print to console.
     */
    public void sort() {
        Collections.sort(league);
        System.out.println("***\t\t\t " + this.title + " Rankings \t\t\t***");
        for (T team:
                league) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }


}
