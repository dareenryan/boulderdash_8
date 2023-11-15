package model.element.motionless;


import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

/**
 * <h1>The MotionLessELement Class.</h1>
 *
 * @author Group 8
 */

public abstract class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
