package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Diamond extends StaticElem{
    private static final Sprite SpriteDiamond = new Sprite(4, 0, "mapSprites.png");

    public Diamond() {
        super(SpriteDiamond, Permeability.BLOCKING);
    }
    public BufferedImage getSprite(){
        return SpriteDiamond.loadSprite();
    }
}
