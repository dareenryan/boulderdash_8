package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;
import model.allElements.staticElem.StaticElem;

import java.awt.image.BufferedImage;

/**
 * <h1> THe Class Sand</h1>
 *
 * @author Group 8
 */
public class Sand extends StaticElem {

    /** The variable SpriteSand. */

    private static final Sprite SpriteSand = new Sprite(1, 0, "mapSprites.png");

    /** Instantiates a new Sand. */
    public Sand() {
        super(SpriteSand, Permeability.BLOCKING);
    }

    /**
     * Gets the sprite
     * @return SpriteSand
     */
    public Sprite getSprite(){
        return SpriteSand;
    }
}