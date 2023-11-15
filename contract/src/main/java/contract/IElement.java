package contract;

import fr.exia.showboard.ISquare;
import model.element.Permeability;
import model.element.Sprite;

import java.awt.Image;

/**
 * <h1> The Interface IElement.</h1>
 *
 * @author Group 8
 * @see ISquare
 */
public interface IElement extends ISquare {

    /**
     * Gets the sprite
     *
     * @return the sprite
     */

    Sprite getSprite();

    /**
     * Gets the permeability.
     *
     * @return the permeability
     */

    Permeability getPermeability();

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.ISquare#getImage()
     */

    @Override
    Image getImage();
}
