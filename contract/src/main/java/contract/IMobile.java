package contract;


public interface IMobile {

    /**
     * Move up.
     */
    void moveUp();

    /**
     * Move left.
     */
    void moveLeft();

    /**
     * Move down.
     */
    void moveDown();

    /**
     * Move right
     */
    void moveRight();

    /**
     * Do nothing.
     */
    void doNothing();

    ISprite getSprite();
}
