package Model;

/**
 * Parent of all GameObjects that are displayed
 */

public abstract class GameObject {
    protected int x, y;
    protected String imgSrc;

    public GameObject(int x, int y, String imgSrc){
        this.x = x;
        this.y = y;
        this.imgSrc = imgSrc;
    }
}
