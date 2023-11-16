package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * <h1>The Interface IBoulderDashView</h1>
 *
 * @author Group 8
 */
public interface IBoulderDashView {
    IMobile getPlayer();

    IMap getMap();

    int getWidth();

    default void runView() throws IOException, InterruptedException {}
    
}
