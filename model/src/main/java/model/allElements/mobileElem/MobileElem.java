package model.allElements.mobileElem;

import model.Map;
import model.allElements.Element;
import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.*;

/**
 * <h1>The Class Mobile Element</h1>
 *
 * @author Group 8
 */
public class MobileElem extends Element {

    /** The variable position. */
    private Point position;

    /**
     * Instantiates a new MobileElem
     * @param sprite
     *  the sprite
     * @param permeability
     *  the permeability
     * @param x
     *  the x
     * @param y
     *  the y
     */
    public MobileElem(final Sprite sprite, final Permeability permeability, int x, int y) {
        super(sprite, permeability);
        this.position = new Point(x,y);
    }

    /**
     * Instantiates another MobileElem
     * @param sprite
     *  the sprite
     * @param permeability
     *  the permeability
     */
    public MobileElem(final Sprite sprite, final Permeability permeability){
        super(sprite, permeability);
    }
    /** Player moves up*/
    public void moveUp() {
        System.out.println("okTest");
        this.setY(this.getY() - 1);
    }

    /** Player moves left. */
    public void moveLeft() {
        System.out.println("okTest");
        this.setX(this.getX() - 1);
        System.out.println(this.getX());
    }

    /** Player moves down. */
    public void moveDown() {
        System.out.println("okTest");
        this.setY(this.getY() + 1);
    }

    /** Player moves right. */
    public void moveRight() {
        System.out.println("okTest");
        this.setX(this.getX() + 1);
        System.out.println(this.getX());

    }

    /**
     * Gets the X position
     * @return getPosition().x
     */
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

    /**
     * Gets the Y position
     * @return getPosition().y
     */
    public final int getY() {
        return this.getPosition().y;
    }

    /**
     * Gets the position
     * @return position
     */
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
}
