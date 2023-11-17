package model.allElements.mobileElem;


import contract.IMobile;
import model.Map;
import model.allElements.Permeability;
import model.allElements.Sprite;

/**
 * <h1>The Class Player</h1>
 *
 * @author Group 8
 */
public class Player extends MobileElem implements IMobile {

    /** The variable spritePlayer. */
    private static Sprite spritePlayer = new Sprite(3,0,"playerSprites.png");

    /** The variable spritePlayerR. */
    private static Sprite spritePlayerR = new Sprite(1,2,"playerSprites.png");

    /** The variable spritePlayerL. */
    private static Sprite spritePlayerL = new Sprite(1,4,"playerSprites.png");

    /** The variable spritePlayerU. */
    private static Sprite spritePlayerU = new Sprite(0,2,"playerSprites.png");

    /** The variable spritePlayerD. */
    private static Sprite spritePlayerD = new Sprite(0,4,"playerSprites.png");

    /**
     * Instantiates a new Player
     * @param x
     *  the x
     * @param y
     *  the y
     */
    public Player(final int x, final int y) { super(spritePlayer, Permeability.BLOCKING, x, y); }

    /** Instantiates another Player. */
    public Player(){
        super(spritePlayer, Permeability.BLOCKING);
    }

    @Override
    public Sprite getSprite(){
        return spritePlayer;
    }

    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spritePlayerL);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spritePlayerR);
    }

    /** Move up method. */
    public final void moveUp() {
        super.moveUp();
        this.setSprite(spritePlayerR);
    }

    /** Move down method. */
    public final void moveDown() {
        super.moveDown();
        this.setSprite(spritePlayerR);
    }
}
