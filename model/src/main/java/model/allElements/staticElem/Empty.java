package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Empty extends StaticElem {
    private static final Sprite SpriteEmpty = new Sprite(2, 0, "mapSprites.png");

    public Empty() {
        super(SpriteEmpty, Permeability.BLOCKING);
    }

    public Sprite getSprite(){
        return SpriteEmpty;
    }
}
