package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Rock extends StaticElem{
    private static final Sprite SpriteRock = new Sprite(3, 0, "mapSprites.png");

    public Rock() {
        super(SpriteRock, Permeability.BLOCKING);
    }
    public BufferedImage getSprite(){
        return SpriteRock.loadSprite();
    }

}
