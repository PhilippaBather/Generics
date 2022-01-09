package domain;

public class Premiership extends Tier {

    public Premiership(String name) {
        super(name, 1, "football");
    }

    @Override
    int ranking() {
        return (this.getWin() * 3) + this.getDraw();
    }

    @Override
    public int compareTo(Tier team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }


}
