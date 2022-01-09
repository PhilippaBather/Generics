package domain;

/**
 * Abstract class to create a basic template for sports tiers, i.e.
 * divisions/league levels.
 */
public abstract class Tier {

    private String name;
    private final int tier;
    private final String sport;

    public Tier(String name, int tier, String sport) {
        this.name = name;
        this.tier = tier;
        this.sport = sport;
    }
}
