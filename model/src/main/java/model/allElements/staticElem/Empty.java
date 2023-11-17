package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

/** <h1>The Class Empty</h1>
 *
 * @author Group 8
 */
public class Empty extends StaticElem {

    /** The variable SpriteEmpty. */
    private static final Sprite SpriteEmpty = new Sprite(2, 0, "mapSprites.png");

    /** Instantiates a new Empty. */
    public Empty() {
        super(SpriteEmpty, Permeability.BLOCKING);
    }

    /**
     * Gets the sprite
     * @return SpriteEmpty
     */
    public Sprite getSprite(){
        return SpriteEmpty;
    }
}
