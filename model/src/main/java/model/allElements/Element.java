package model.allElements;

import java.awt.image.BufferedImage;

import model.allElements.Permeability;

/**
 * <h1> The Class ELement. </h1>
 *
 * @author Group 8
 */
public class Element {

    /** The variable sprite. */
    private Sprite       sprite;

    /** The permeability. */
    private Permeability permeability;

    /**
     * Instantiates a new Element
     * @param sprite
     *  the sprite
     * @param permeability
     *  the permeability
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    /**
     * Gets the sprite
     * @return sprite
     */
    public Sprite getSprite(){
        return this.sprite;
    }

    /**
     * Gets the permeability
     * @return permeability
     */
    public Permeability getPermeability() {
        return permeability;
    }

    /**
     * Sets the sprite
     * @param sprite
     *  the sprite
     */
    protected void setSprite(Sprite sprite){
        this.sprite = sprite;
    }

    /**
     * Sets the permeability
     * @param permeability
     *  the permeability
     */
    protected void setPermeability(Permeability permeability){
        this.permeability = permeability;
    }
}
