/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.IBoulderDashController;
import contract.IController;
import controller.BoulderDashController;
import model.BoulderDashModel;
import view.BoulderDashView;

import java.io.IOException;

/**
 * The Class Main.
 *
 * @author Group 8
 */
public abstract class Main {

    /** The X starting position */
    private static final int startX = 20;

    /** The Y starting position */
    private static final int startY = 20;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *            Signals that an I/O exception has occurred.
     * @throws InterruptedException
     *            the interrupted exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
        final BoulderDashModel model = new BoulderDashModel("maps_txt/MAP1.txt", startX,startY);
        final BoulderDashView view = new BoulderDashView(BoulderDashModel.getMap(), BoulderDashModel.getMyHero());
        final IBoulderDashController controller = new BoulderDashController(view, model);
        //view.setOrderPerformer(controller.getOrderPerformer());

        view.runView();
    }
}
