package model.allElements.staticElem;

import model.allElements.Element;
import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class StaticElem extends Element {
    public StaticElem(final Sprite sprites, final Permeability permeability) {
        super(sprites, permeability);
    }
}