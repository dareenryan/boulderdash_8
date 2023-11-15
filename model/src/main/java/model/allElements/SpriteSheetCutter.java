package model.allElements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
    classe permettant le découpage des spritesheets
*/
public class SpriteSheetCutter {
    private static BufferedImage spriteSheet;
    private static final int TILE_SIZE = 16;

    public static BufferedImage loadSprite(String file) {

        BufferedImage sprite = null;

        try {
            sprite = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sprite;
    }

    public static BufferedImage getSprite(int xGrid, int yGrid, String file) {

        if (spriteSheet == null) {
            System.out.println("file : " +file);
            spriteSheet = loadSprite(file);
        }

//il faudrait voir la doc de getSubImage et de ses paramètres

        return spriteSheet.getSubimage(xGrid * TILE_SIZE, yGrid * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }
}
