package model;


import contract.IBoulderDashModel;
import contract.IMap;
import model.allElements.mobileElem.Player;

import java.io.IOException;

/**
 * <h1> The Class Boulder Dash Model</h1>
 *
 * @author Group 8
 */

public class BoulderDashModel implements IBoulderDashModel {

    /** The map. */
    private static Map map;

    /** The myHero. */
    private static Player myHero;

    /**
     * Constructor
     * @param fileName
     *          name of th file
     * @param myHeroStartX
     *
     * @param myHeroStartY
     */
    public BoulderDashModel(final String fileName,final int myHeroStartX, final int myHeroStartY) throws IOException{
        this.setMap(new Map(fileName));
        this.setMyHero(new Player(myHeroStartX, myHeroStartY, this.getMap()));
    }

    public static Map getMap(){
        return map;
    }

    /**
     * Sets the map.
     *
     * @param map
     * the map to set
     */
    private void setMap(final Map map){
        this.map = map;
    }

    public static Player getMyHero(){
        return myHero;
    }

    /**
     * Sets the my hero.
     *
     * @param myHero
     * the myHero to set
     */
    private void setMyHero(final Player myHero){
        this.myHero=myHero;
    }

}
