package Model;

/**
 * The base of the defenders
 */

public class StrongHold extends GameObject{

    private int health = Config.STRONGHOLD_HEALTH;

    public StrongHold(int x, int y, String imgSrc){
        super(x,y,imgSrc);
    }
}
