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
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("selectionnez un niveau entre 1 et 5 : ");

        while(!scanner.hasNext()){
            System.out.println("choisissez un niveau valide...");
            scanner.next();
            System.out.println("selectionnez un niveau entre 1 et 5 : ");
        }
        int niv = scanner.nextInt();
        final BoulderDashModel model = new BoulderDashModel("maps_txt/MAP" +niv+".txt");
        final BoulderDashView view = new BoulderDashView(BoulderDashModel.getMap());
        final IBoulderDashController controller = new BoulderDashController(view, model);
        ((BoulderDashController) controller).play();
        //DBConnection db = new DBConnection();
        //db.insertEntity();
        BoulderDashController.music();

    }
}