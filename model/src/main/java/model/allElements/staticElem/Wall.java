package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Wall extends StaticElem {

    private static final Sprite SpriteWall = new Sprite(0, 0, "mapSprites.png");

    public Wall() {
        super(SpriteWall, Permeability.BLOCKING);
    }
    public BufferedImage getSprite(){
        return SpriteWall.loadSprite();
    }
}