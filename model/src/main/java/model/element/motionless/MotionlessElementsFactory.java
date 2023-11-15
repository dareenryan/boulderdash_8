package model.element.motionless;

/**
 * <h1>A factory to create MotionlessElements objects</h1>
 *
 * @author Group 8
 */

public abstract class MotionlessElementsFactory {

    /** The Constant Background. */
    private static final BackGround background = new BackGround();

    /** The Constant Boulder. */
    private static final Boulder boulder = new Boulder();

    /**The Constant Diamond. */
    private static final Diamond diamond = new Diamond();

    /**The Constant Ground. */
    private static final Ground ground = new Ground();

    /**The Constant Wall. */
    private static final Obstacle obstacle = new Obstacle();

    /**
     * The motionless elements is an array of all possible MotionlessElement.
     */
    private static MotionlessElement[] motionlessElements = {
            background,
            boulder,
            diamond,
            ground,
            obstacle,};

    /**
     * Creates a new MotionlessElement object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createBackGround(){
        return background;
    }

    /**
     * Creates a new MotionlessElement object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createBoulder(){
        return boulder;
    }

    /**
     * Creates a new MotionlessElement object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createDiamond(){
        return diamond;
    }

    /**
     * Creates a new MotionlessElement object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createGround(){
        return ground;
    }

    /**
     * Creates a new MotionlessElement object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createObstacle(){
        return obstacle;
    }

    /**
     * Gets the good MotionlessElement from file symbol.
     *
     * @param fileSymbol
     *            the file symbol
     * @return the from file symbol
     */
    public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return background;
    }
}