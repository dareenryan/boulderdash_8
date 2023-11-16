package model.allElements.mobileElem;

import model.Map;
import model.allElements.Element;
import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.*;

public class MobileElem extends Element {
    private Point position;
    private Map map;
    public MobileElem(final Sprite sprite, final Permeability permeability, final Map map, int x, int y) {
        super(sprite, permeability);
        this.setMap(map);
        this.position = new Point(x,y);
    }

    public void moveUp() {
        this.setY(this.getY() - 1);
        //this.setHasMoved();
    }

    public void moveLeft() {
        this.setX(this.getX() - 1);
        //this.setHasMoved();
    }

    public void moveDown() {
        this.setY(this.getY() + 1);
        //this.setHasMoved();
    }

    public void moveRight() {
        this.setX(this.getX() + 1);
        //this.setHasMoved();
    }

    public void doNothing() {
        this.setHasMoved();
    }

    /**
     * Sets the has moved.
     */
    private void setHasMoved() {
        this.getMap().setMobileHasChanged();
    }

    public final int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    public final void setX(final int x) {
        this.getPosition().x = x;
    }

    public final int getY() {
        return this.getPosition().y;
    }

    public Point getPosition() {
        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Sets the y.
     *
     * @param y
     *            the new y, as the map is an infinite loop, there's a modulo
     *            based on the map height.
     */
    public final void setY(final int y) {
        this.getPosition().y = y;
        //this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
    }

    /**
     * Gets the map.
     *
     * @return the map
     */
    public Map getMap() {
        return this.map;
    }

    /**
     * Sets the map.
     *
     * @param map
     *            the new map
     */
    private void setMap(final Map map) {
        this.map = map;
    }

    /*public Boolean isAlive() {
        return this.alive;
    }*/

    /**
     * Dies.
     */


}
