package model.allElements;

import java.awt.image.BufferedImage;

import model.allElements.Permeability;

public class Element {

    private Sprite       sprite;

    /** The permeability. */
    private Permeability permeability;

    public Element(final Sprite sprite, final Permeability permeability) {
        this.setPermeability(permeability);
    }


    public void setSprite(Sprite sprite){
        this.sprite = sprite;
        System.out.println(this.sprite);
    }

    public void setPermeability(Permeability permeability){
        this.permeability = permeability;
    }
}
