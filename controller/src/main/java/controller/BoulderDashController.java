package controller;


import contract.IBoulderDashController;
import contract.IBoulderDashModel;
import contract.IBoulderDashView;

import javax.swing.text.View;
import java.io.IOException;

/**
 * <h1>The Class Boulder Dash Controller</h1>
 */
public class BoulderDashController implements IBoulderDashController {

    /** The boulder view */
    private IBoulderDashView boulderDashView;

    /** The boulder model. */
    private IBoulderDashModel boulderDashModel;

    /**
     * Instantiates a new Boulder Dash Controller.
     * @param view
     * the view
     * @param model
     * the model
     */
    public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
        this.setView(view);
        this.setModel(model);
    }

    public IBoulderDashModel getBoulderDashModel() {
        return boulderDashModel;
    }

    /**
     *
     * @param model
     * sets the model
     */
    private void setModel(IBoulderDashModel model) {
        this.boulderDashModel = model;
    }

    public IBoulderDashView getBoulderDashView() {
        return boulderDashView;
    }

    /**
     *
     * @param view
     * sets view
     */
    private void setView(IBoulderDashView view) {
        this.boulderDashView = view;
    }

    public void play() throws IOException, InterruptedException {
        this.boulderDashView.runView();
    }

}

    