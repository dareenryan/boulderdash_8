package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

/**
 * <h1> The Class Diamond</h1>
 *
 * @author Group 8
 */
public class Diamond extends StaticElem{

    /** The variable SpriteDiamond. */
    private static final Sprite SpriteDiamond = new Sprite(4, 0, "mapSprites.png");

    /** Instantiates a new Diamond. */
    public Diamond() {
        super(SpriteDiamond, Permeability.BLOCKING);
    }

    /**
     * Gets the sprite
     * @return SpriteDiamond
     */
    public Sprite getSprite(){
        return SpriteDiamond;
    }
}
