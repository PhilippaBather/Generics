package domain;

/**
 * Generic class to create team objects for sports pertaining to a specified
 * tier class.
 * @param <T> extends Tier (division/league)
 */
public class Team<T extends Tier> implements Comparable<Team<T>>  {

    private String name;
    private int drew = 0;
    private int played = 0;
    private int won = 0;
    private int lost = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWin() {
        return won;
    }

    public int getDraw() {
        return drew;
    }


    /**
     * Adds teams and opponent score.
     * @param opponent name
     * @param teamScore number of points/goals
     * @param opponentScore number of points/goals
     */
    public void addResult(Team opponent, int teamScore, int opponentScore) {
        if (teamScore > opponentScore) {
            won++;
        } else if (teamScore == opponentScore) {
            drew++;
        } else {
            lost++;
        }

        played++;

        if (opponent != null) {
            opponent.addResult(null, opponentScore, teamScore);
        }
    }

    /**
     * Returns a team object's ranking dependent on the supplied algorithm.
     * @return
     */
    public int ranking() {
        return (this.getWin() * 3) + this.getDraw();
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}
