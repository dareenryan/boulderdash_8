package model.element.mobile;

import contract.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.sprite.SpriteSheetCutter;

import java.io.IOException;


/**
 * <h1>THe MyHero Class.</h1>
 *
 * @author Group 8
 */
public class MyHero extends Mobile{

    public static String filename = "perso.png";
    /** The Constant SPRITE. */
    private static final Sprite sprite          = new Sprite('H',SpriteSheetCutter.getSprite(0,0,filename));

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteTurnLeft  = new Sprite('H',SpriteSheetCutter.getSprite(0,1,filename));

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteTurnRight = new Sprite('H',SpriteSheetCutter.getSprite(0,3,filename));

    /** The Constant spriteTurnDown. */
    private static final Sprite spriteTurnDown = new Sprite('H',SpriteSheetCutter.getSprite(4,1,filename));

    /** THe Constant spriteTurnUp. */
    private static final Sprite spriteTurnUp = new Sprite('H',SpriteSheetCutter.getSprite(2,5,filename));

    /** The Constant spriteExplode. */
    private static final Sprite spriteDie   = new Sprite('H',SpriteSheetCutter.getSprite(2,0,filename));

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param map
     *            the map
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public MyHero(final int x, final int y, final IMap map) throws IOException {
        super(x, y, sprite, map, Permeability.BLOCKING);
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteTurnUp.loadImage();
        spriteTurnDown.loadImage();
        spriteDie.loadImage();
    }

    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteTurnLeft);
    }

    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteTurnRight);
    }

    @Override
    public final void moveUp(){
        super.moveUp();
        this.setSprite(spriteTurnUp);
    }

    @Override
    public final void moveDown(){
        super.moveDown();
        this.setSprite(spriteTurnDown);
    }

    @Override
    protected final void die() {
        super.die();
        this.setSprite(spriteDie);
    }

    @Override
    public final void doNothing() {
        super.doNothing();
        this.setSprite(sprite);
    }
}
