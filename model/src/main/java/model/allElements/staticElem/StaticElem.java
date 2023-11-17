package model.allElements.staticElem;

import model.allElements.Element;
import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

/**
 * <h1>The Class StaticElem</h1>
 *
 * @author Group 8
 */
public class StaticElem extends Element {

    /**
     * Instantiates a new Static Element
     * @param sprites
     *  the sprites
     * @param permeability
     *  the permeability
     */
    public StaticElem(final Sprite sprites, final Permeability permeability) {
        super(sprites, permeability);
    }
}