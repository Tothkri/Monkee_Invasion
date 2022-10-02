package Model;

/**
 * Group of classes that appear as different fields, where enemies move or towers take place
 * Different fields will act in a certain way when an enemy or tower is interacting with them (i.e. enemy might only be
 * able to swim, or a tower can only be placed on a mountain)
 * Might add more later on
 */

class Water extends GameObject {
    public Water(int x, int y, String imgSrc){
        super(x,y,imgSrc);
    }
}

class Mountain extends GameObject {
    public Mountain(int x, int y, String imgSrc){
        super(x,y,imgSrc);
    }
}

class Plain extends GameObject {
    public Plain(int x, int y, String imgSrc){
        super(x,y,imgSrc);
    }
}
