package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * <h1>The Interface IBoulderDashView</h1>
 *
 * @author Group 8
 */
public interface IBoulderDashView {

    /**
     *
     * @return the player
     */
    IMobile getPlayer();

    /**
     *
     * @return the map
     */
    IMap getMap();

    /**
     *
     * @return the width
     */
    int getWidth();

    /**
     *
     * @throws IOException
     * @throws InterruptedException
     */
    default void runView() throws IOException, InterruptedException {}
    
}
