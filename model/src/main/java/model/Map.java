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

/*
    pour lire les fichiers de map txt et effectuer les correspondances
*/
public class Map extends Observable implements IMap {
    private int width;
    private int height;

    private String FileMap;

    private BufferedImage[][] SymbolonTheMap;

    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setWidth(int width) { this.width = width; }
    public int getWidth() { return width; }
    public void setHeight(int height) { this.height = height; }
    public  int getHeight() { return height; }

    @Override
    public Element[][] getOnTheMapXY(int x, int y) {
        return new Element[0][];
    }

    public BufferedImage[][] getSymbolonTheMap(){
        return SymbolonTheMap;
    }

    public Map(String file) throws IOException {
        this.FileMap = file;
        this.SymbolonTheMap = loadMap(this.FileMap);
    }

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
