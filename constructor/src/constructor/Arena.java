package constructor;

public class Arena {
    private int level;
    private  int trophiles;

    public Arena() {
    }

    public Arena(int level, int trophiles) {
        this.level = level;
        this.trophiles = trophiles;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTrophiles() {
        return trophiles;
    }

    public void setTrophiles(int trophiles) {
        this.trophiles = trophiles;
    }

}

