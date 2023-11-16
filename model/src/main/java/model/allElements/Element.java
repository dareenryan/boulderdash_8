package model.allElements;

import java.awt.image.BufferedImage;

import model.allElements.Permeability;

public class Element {

    private Sprite       sprite;

    /** The permeability. */
    private Permeability permeability;

    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    public Sprite getSprite(){
        return this.sprite;
    }
    public Permeability getPermeability() {
        return permeability;
    }

    protected void setSprite(Sprite sprite){
        this.sprite = sprite;
    }

    protected void setPermeability(Permeability permeability){
        this.permeability = permeability;
    }
}
