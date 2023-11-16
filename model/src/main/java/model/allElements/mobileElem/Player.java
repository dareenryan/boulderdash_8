package model.allElements.mobileElem;


import contract.IMobile;
import model.Map;
import model.allElements.Permeability;
import model.allElements.Sprite;

public class Player extends MobileElem implements IMobile {

    private static Sprite spritePlayer = new Sprite(3,0,"playerSprites.png");

    private static Sprite spritePlayerR = new Sprite(1,2,"playerSprites.png");

    private static Sprite spritePlayerL = new Sprite(1,4,"playerSprites.png");
    private static Sprite spritePlayerU = new Sprite(0,2,"playerSprites.png");
    private static Sprite spritePlayerD = new Sprite(0,4,"playerSprites.png");


    public Player(final int x, final int y) { super(spritePlayer, Permeability.BLOCKING, x, y); }

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

    public final void moveUp() {
        super.moveUp();
        this.setSprite(spritePlayerR);
    }

    public final void moveDown() {
        super.moveDown();
        this.setSprite(spritePlayerR);
    }
}
