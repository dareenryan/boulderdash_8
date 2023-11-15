package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;
import model.sprite.SpriteSheetCutter;

/**
 * <h1> The Obstacle Class</h1>
 *
 * @author Group 8
 */

public class Obstacle extends MotionlessElement{

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('1', SpriteSheetCutter.getSprite(0,0,"wall.png"));

    /**
     * Instantiates a new wall.
     */
    Obstacle() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
