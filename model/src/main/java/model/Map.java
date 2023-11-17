package model;

import contract.IMap;
import model.allElements.mobileElem.Monster;
import model.allElements.mobileElem.Player;
import model.allElements.staticElem.*;

import javax.lang.model.element.Element;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 * <h1> The Class Map</h1>
 *
 * @author Group 8
 */
public class Map extends Observable implements IMap {

    /** The width. */
    private int width;

    /** The height. */
    private int height;

    /** The map file. */
    private String FileMap;

    /** The symbols on the map. */
    private BufferedImage[][] SymbolonTheMap;

    /** The player. */
    private Player player;

    /**
     * Gets the player
     * @return player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the width
     * @param width
     *  the width
     */
    public void setWidth(int width) { this.width = width; }

    /**
     * Gets the width
     * @return width
     */
    public int getWidth() { return width; }

    /**
     * Sets the height
     * @param height
     *  the height
     */
    public void setHeight(int height) { this.height = height; }

    /**
     * Gets the height
     * @return height
     */
    public  int getHeight() { return height; }

    /**
     *
     * @param x
     *  the x
     * @param y
     *  the y
     *
     * @return Element[][]
     */
    @Override
    public Element[][] getOnTheMapXY(int x, int y) {
        return new Element[0][];
    }

    /**
     * Gets each unique icon on the map
     * @return SymbolonTheMap
     */
    public BufferedImage[][] getSymbolonTheMap(){
        return SymbolonTheMap;
    }

    /**
     * Instantiates a new Map
     * @param file
     * the file
     * @throws IOException
     * Signals that an I/O exception has occurred.
     */
    public Map(String file) throws IOException {
        this.FileMap = file;
        this.SymbolonTheMap = loadMap(this.FileMap);
    }

    /**
     *
     * @param file
     * the file
     * @return Element
     * @throws IOException
     * Signals that an I/O exception has occurred.
     */
    public BufferedImage[][] loadMap(String file) throws IOException {
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        line = buffer.readLine();
        this.setWidth(line.length());
        this.setWidth(line.length());
        BufferedImage[][] Element = new BufferedImage[line.toCharArray().length][line.toCharArray().length];
        int y = 0;
        while (line != null ) {
            for (int x = 0; x <= line.length()-1; x++) {
                System.out.println("X = " + x);
                char c = line.toCharArray()[x];
                System.out.println("y =" + y);
                BufferedImage elem = charToSprite(c, x, y);
                Element[x][y] = elem;
            }
            y++;
            line = buffer.readLine();
        }
        buffer.close();
        return Element;
    }

    /**
     *
     * @param fchar
     *  the fchar
     * @param x
     *  the x
     * @param y
     *  the y
     * @return accSprite
     */
    public BufferedImage charToSprite(char fchar, int x, int y){
        BufferedImage accSprite = null;
        switch(fchar){
            case 'B':
                //changer et adapter au sprite des monstres et de la sortie
                accSprite = new Wall().getSprite().getSymbol();
                break;
            case ' ':
                accSprite = new Empty().getSprite().getSymbol();
                break;
            case 'P' :
                accSprite = new Rock().getSprite().getSymbol();
                break;
            case 'D' :
                accSprite = new Diamond().getSprite().getSymbol();
                break;
            case 'M':
                accSprite = new Wall().getSprite().getSymbol();
                break;
            case 'T':
                accSprite = new Sand().getSprite().getSymbol();
                break;
            case 'J':
                this.player = new Player(0,0);
                accSprite = this.player.getSprite().getSymbol();
                this.player.setX(x);
                this.player.setY(y);
        }
        return accSprite;
    }
    @Override
    public final void setMobileHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public Observable getObservable() {
        return null;
    }
}
