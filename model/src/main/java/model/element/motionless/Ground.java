package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;
import model.sprite.SpriteSheetCutter;

/**
 * <h1> The Ground Class</h1>
 *
 * @author Group 8
 */

public class Ground extends MotionlessElement{

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('0', SpriteSheetCutter.getSprite(0,0,"ground.png"));

    /**
     * Instantiates a new Ground.
     */
    Ground() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
