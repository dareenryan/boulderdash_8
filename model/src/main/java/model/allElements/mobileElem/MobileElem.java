package model.allElements.mobileElem;

import model.Map;
import model.allElements.Element;
import model.allElements.Permeability;
import model.allElements.Sprite;

import java.awt.*;

public class MobileElem extends Element {
    private Point position;
    public MobileElem(final Sprite sprite, final Permeability permeability, int x, int y) {
        super(sprite, permeability);
        this.position = new Point(x,y);
    }

    public MobileElem(final Sprite sprite, final Permeability permeability){
        super(sprite, permeability);
    }

    public void moveUp() {
        System.out.println("okTest");
        this.setY(this.getY() - 1);
    }

    public void moveLeft() {
        System.out.println("okTest");
        this.setX(this.getX() - 1);
        System.out.println(this.getX());
    }

    public void moveDown() {
        System.out.println("okTest");
        this.setY(this.getY() + 1);
    }

    public void moveRight() {
        System.out.println("okTest");
        this.setX(this.getX() + 1);
        System.out.println(this.getX());

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
}
