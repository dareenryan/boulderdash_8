package model.allElements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * <h1> The Class SpriteSheetCutter. </h1>
 *
 * @author Group 8
 */
public class SpriteSheetCutter {

    /** The variable spriteSheet. */
    private static BufferedImage spriteSheet;

    /** The constant TILE_SIZE. */
    private static final int TILE_SIZE = 16;

    /**
     *
     * @param file
     *  the file
     * @return sprite
     */
    public static BufferedImage loadSprite(String file) {

        BufferedImage sprite = null;

        try {
            sprite = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sprite;
    }

    /**
     *
     * @param xGrid
     *  the xGrid
     * @param yGrid
     *  the yGrid
     * @param file
     *  the file
     * @return a sub image
     */
    public static BufferedImage getSprite(int xGrid, int yGrid, String file) {
         spriteSheet = loadSprite(file);

//il faudrait voir la doc de getSubImage et de ses paramètres

        return spriteSheet.getSubimage(xGrid * TILE_SIZE, yGrid * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }
}
