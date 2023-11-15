package model.allElements.mobileElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

public class Monster extends MobileElem{
    private static Sprite spriteMonster = new Sprite(10,0,"mapSprites.png");
    public Monster() { super(spriteMonster, Permeability.BLOCKING); }
    public BufferedImage getSprite(){
        return spriteMonster.loadSprite();
    }
}
