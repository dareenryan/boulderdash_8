package contract;

import java.awt.*;


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

    ISprite getSprite();

    Point getPosition();
}
