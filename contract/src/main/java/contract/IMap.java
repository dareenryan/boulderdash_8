package contract;

import javax.lang.model.element.Element;
import java.awt.image.BufferedImage;
import java.util.Observable;

/**
 * <h1> The Interface IMap.</h1>
 *
 * @author Group 8
 */
public interface IMap {

    /**
     * Gets the width
     *
     * @return the width
     */

    int getWidth();

    /**
     * Gets the height.
     *
     * @return the height
     */

    int getHeight();

    /**
     * Gets the on the map XY.
     *
     * @param x
     * @param y
     *
     * @return the on the map XY
     */

    Element[][] getOnTheMapXY(int x, int y);

    /**
     * Sets the mobile has changed
     */

    void setMobileHasChanged();

    /**
     * Gets the observable.
     *
     * @return the observable
     */

    Observable getObservable();

    /**
     *
     * @return the symbol on the map
     */
    BufferedImage[][] getSymbolonTheMap();

    /**
     *
     * @returnnthe player
     */
    IMobile getPlayer();
}
