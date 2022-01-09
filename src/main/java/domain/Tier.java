package domain;

public abstract class Tier extends Team implements Comparable<Tier> {

    private int tier;
    private String sport;
    private int points;

    public Tier(String name, int tier, String sport) {
        super(name);
        this.tier = tier;
        this.sport = sport;
    }

    abstract int ranking();


}
