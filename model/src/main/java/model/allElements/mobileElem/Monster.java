package model.allElements.mobileElem;

import model.Map;
import model.allElements.Permeability;
import model.allElements.Sprite;

public class Monster extends MobileElem{
    private static Sprite spriteMonster = new Sprite(10,0,"mapSprites.png");
    public Monster(final int x, final int y) { super(spriteMonster, Permeability.BLOCKING, x, y ); }
    public Sprite getSprite(){
        return spriteMonster;
    }
}
