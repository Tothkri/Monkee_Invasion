package Model;

/**
 * Parent class of the different enemy types that will be added later on, needs to be further discussed
 */

public class Enemy extends GameObject{
    protected int health;
    protected int damage;
    protected int speed;

    public Enemy(int x, int y, String imgSrc, int health, int damage, int speed){
        super(x,y,imgSrc);
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }
}
