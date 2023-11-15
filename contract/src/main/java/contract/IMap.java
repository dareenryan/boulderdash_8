package contract;

import java.util.Observable;

import contract.IElement;

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

    IElement getOnTheMapXY(int x, int y);

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
}
