package model.allElements.mobileElem;


import model.allElements.Permeability;
import model.allElements.Sprite;
import model.allElements.SpriteSheetCutter;

import java.awt.image.BufferedImage;

public class Player extends MobileElem{

    private static Sprite spritePlayer = new Sprite(6,0,"playerSprites.jpg");
    public Player() { super(spritePlayer, Permeability.BLOCKING); }
    public BufferedImage getSprite(){
        return spritePlayer.loadSprite();
    }
}
