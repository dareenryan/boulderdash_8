package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

/**
 * <h1>The Class Rock</h1>
 *
 * @author Group 8
 */
public class Rock extends StaticElem{

    /** The variable SpriteRock. */
    private static final Sprite SpriteRock = new Sprite(3, 0, "mapSprites.png");

    /** Instantiates a new Rock. */
    public Rock() {
        super(SpriteRock, Permeability.BLOCKING);
    }

    /**
     * Gets the sprite
     * @return SpriteRock
     */
    public Sprite getSprite(){
        return SpriteRock;
    }

}
