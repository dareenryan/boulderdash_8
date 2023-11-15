package model;

import contract.IBoulderDashModel;
import contract.IMap;
import contract.IMobile;
import model.element.mobile.MyHero;

import java.io.IOException;

/**
 * <h1> The Class Boulder Dash Model</h1>
 *
 * @author Group 8
 */

public class BoulderDashModel implements IBoulderDashModel {

    /** The map. */
    private IMap map;

    /** The myHero. */
    private IMobile myHero;

    /**
     * Instantiates a new insane vehicles model.
     *
     * @param fileName
     * the file name
     * @param myHeroStartX
     * the my hero start X
     * @param myHeroStartY
     * the my hero start Y
     * @throws IOException
     * Signals that an I/O exception has occured.
     */

    public BoulderDashModel(final String fileName,final int myHeroStartX, final int myHeroStartY) throws IOException{
        this.setMap(new Map(fileName));
        this.setMyHero(new MyHero(myHeroStartX, myHeroStartY, this.getMap()));
    }

    @Override
    public final IMap getMap(){
        return this.map;
    }

    /**
     * Sets the map.
     *
     * @param map
     * the map to set
     */
    private void setMap(final IMap map){
        this.map=map;
    }

    @Override
    public final IMobile getMyHero(){
        return this.myHero;
    }

    /**
     * Sets the my hero.
     *
     * @param myHero
     * the myHero to set
     */
    private void setMyHero(final IMobile myHero){
        this.myHero=myHero;
    }

}
