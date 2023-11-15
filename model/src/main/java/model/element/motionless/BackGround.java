package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;
import model.sprite.SpriteSheetCutter;

/**
 * <h1> The BackGround Class</h1>
 *
 * @author Group 8
 */

public class BackGround extends MotionlessElement{

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('5',SpriteSheetCutter.getSprite(2,0,"element.png") );

    /**
     * Instantiates a new BackGround.
     */
    BackGround() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
