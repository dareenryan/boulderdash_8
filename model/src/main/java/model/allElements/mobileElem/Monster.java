package model.allElements.mobileElem;

import model.Map;
import model.allElements.Permeability;
import model.allElements.Sprite;

/**
 * <h1> THe class Monster. </h1>
 *
 * @author Group 8
 */
public class Monster extends MobileElem{

    /** The variable spriteMonster. */
    private static Sprite spriteMonster = new Sprite(10,0,"mapSprites.png");

    /**
     * Instantiates a new Monster
     * @param x
     *  the x
     * @param y
     *  the y
     * @param map
     *  the map
     */
    public Monster(final int x, final int y, final Map map) { super(spriteMonster, Permeability.BLOCKING, x, y ); }

    /**
     * Gets sprite
     * @return spriteMonster
     */
    public Sprite getSprite(){
        return spriteMonster;
    }
}
