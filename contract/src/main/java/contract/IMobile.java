package contract;

import java.awt.*;

/**
 * The Interface IMobile
 */

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
     *
     * @return the sprite
     */
    ISprite getSprite();

    /**
     *
     * @return the position
     */
    Point getPosition();
}
