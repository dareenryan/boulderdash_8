package model.allElements;

import java.awt.image.BufferedImage;


public class Sprite {
    private  int x, y;
    private String file;
    public Sprite(int x, int y, String file){
        this.x = x;
        this.y = y;
        this.file = file;
    }

    public BufferedImage loadSprite(){
        //System.out.println("file : " + this.file);
        return SpriteSheetCutter.getSprite(this.x, this.y, this.file);
    }
}
