package model.allElements;

import model.allElements.mobileElem.Monster;
import model.allElements.mobileElem.Player;
import model.allElements.staticElem.*;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    pour lire les fichiers de map txt et effectuer les correspondances
*/
public class Map {
    private int width;
    private int height;

    public void setWidth(int width) { this.width = width; }
    public int getWidth() { return width; }
    public void setHeight(int height) { this.height = height; }
    public  int getHeight() { return height; }

    public static BufferedImage[][] loadMap(String fileMap) throws IOException {
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileMap)));
        String line;
        line = buffer.readLine();
        BufferedImage[][] Element = new BufferedImage[line.toCharArray().length][line.toCharArray().length];
        int y = 0;
        while (line != null ) {
            for (int x = 0; x <= line.length()-1; x++) {
                //System.out.println("X = " + x);
                char c = line.toCharArray()[x];
                //System.out.println("y =" + y);
                BufferedImage elem = charToSprite(c);
                Element[x][y] = elem;
            }
            y++;
            line = buffer.readLine();
        }
        buffer.close();
        return Element;
    }
    public static BufferedImage charToSprite(char fchar){
        BufferedImage accSprite = null;
        switch(fchar){
            case 'S', 'B':
                //changer et adapter au sprite des monstres et de la sortie
                accSprite = new Monster().getSprite();
                break;
            case ' ':
                accSprite = new Empty().getSprite();
                break;
            case 'P' :
                accSprite = new Rock().getSprite();
                break;
            case 'D' :
                accSprite = new Diamond().getSprite();
                break;
            case 'M':
                accSprite = new Wall().getSprite();
                break;
            case 'J':
                accSprite = new Player().getSprite();
                break;
            case 'T':
                accSprite = new Sand().getSprite();
                break;
        }
        return accSprite;
    }
}
