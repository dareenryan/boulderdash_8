package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;
import model.sprite.SpriteSheetCutter;

/**
 * <h1> The Boulder Class</h1>
 *
 * @author Group 8
 */

public class Boulder extends MotionlessElement{

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('2', SpriteSheetCutter.getSprite(0,0,"wall.png"));

    /**
     * Instantiates a new Boulder.
     */
    Boulder() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
