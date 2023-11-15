package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;
import model.allElements.staticElem.StaticElem;

import java.awt.image.BufferedImage;

public class Sand extends StaticElem {

    private static final Sprite SpriteSand = new Sprite(1, 0, "mapSprites.png");

    public Sand() {
        super(SpriteSand, Permeability.BLOCKING);
    }
    public BufferedImage getSprite(){
        return SpriteSand.loadSprite();
    }
}