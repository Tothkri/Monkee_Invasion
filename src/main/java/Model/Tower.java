package Model;

/**
 * Parent class of the different tower types that will be added later on, needs to be further discussed
 */

public abstract class Tower extends GameObject {
    protected int damage;

    //will have more stats here, for now only these
    public Tower(int x, int y, String imgSrc, int damage){
        super(x,y,imgSrc);
        this.damage = damage;
    }
}
