package model.allElements;

import contract.ISprite;

import java.awt.image.BufferedImage;


public class Sprite implements ISprite {
    private  int x, y;
    private String file;

    private  BufferedImage Symbol;
    public Sprite(int x, int y, String file){
        this.x = x;
        this.y = y;
        this.file = file;
        this.Symbol = loadSprite();
    }

    public BufferedImage loadSprite(){
        //System.out.println("file : " + this.file);
        return SpriteSheetCutter.getSprite(this.x, this.y, this.file);
    }

    public BufferedImage getSymbol() {
        return Symbol;
    }
}
