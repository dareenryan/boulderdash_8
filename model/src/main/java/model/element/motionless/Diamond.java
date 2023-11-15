package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;
import model.sprite.SpriteSheetCutter;

/**
 * <h1> The Diamond Class</h1>
 *
 * @author Group 8
 */

public class Diamond extends MotionlessElement{

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('3', SpriteSheetCutter.getSprite(0,0,"diamond.png"));

    /**
     * Instantiates a new Diamond.
     */
    Diamond() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
