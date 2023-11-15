/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.IBoulderDashModel;
import contract.IController;
import contract.UserOrder;
import controller.Controller;
import model.BoulderDashModel;
import view.View;

import java.io.IOException;

/**
 * The Class Main.
 *
 * @author Group 8
 */
public abstract class Main {

    /** The X starting position */
    private static final int startX = 4;

    /** The Y starting position */
    private static final int startY = 6;

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
        final IBoulderDashModel model = new BoulderDashModel("Map.txt", startX,startY);
        final View view = new View(model.getMap(), model.getMyHero());
        final IController controller = new Controller(view, model);
        view.setOrderPerformer(controller.getOrderPerformer());

        controller.play();
    }
}
