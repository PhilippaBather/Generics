package domain;

public class Team  {

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


}
