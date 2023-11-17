/**
 * The Class Main.
 *
 * @author Group 8
 * @version 1.0
 */
package main;

import contract.IBoulderDashController;
import contract.IController;
import controller.BoulderDashController;
import model.BoulderDashModel;
import model.dao.DBConnection;
import view.BoulderDashView;

import java.io.IOException;

/**
 * The Class Main.
 *
 * @author Group 8
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
        final BoulderDashModel model = new BoulderDashModel("maps_txt/MAP1.txt");
        final BoulderDashView view = new BoulderDashView(BoulderDashModel.getMap());
        //final IBoulderDashController controller = new BoulderDashController(view, model);
        //view.setOrderPerformer(controller.getOrderPerformer());

        //DBConnection db = new DBConnection();
        //db.insertEntity();

        view.runView();
    }
}