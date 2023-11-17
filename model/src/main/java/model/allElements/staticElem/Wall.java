package model.allElements.staticElem;

import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.image.BufferedImage;

/**
 * <h1>The Class Wall</h1>
 *
 * @author Group 8
 */
public class Wall extends StaticElem {

    /** The variable SpriteWall. */
    private static final Sprite SpriteWall = new Sprite(0, 0, "mapSprites.png");

    /** Instantiates a new Wall. */
    public Wall() {
        super(SpriteWall, Permeability.BLOCKING);
    }

    /**
     * Gets the sprite
     * @return SpriteWall
     */
    public Sprite getSprite(){
        return SpriteWall;
    }
}