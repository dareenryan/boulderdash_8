package controller;


import contract.IBoulderDashController;
import contract.IBoulderDashModel;
import contract.IBoulderDashView;

import javax.swing.text.View;
import java.io.IOException;

public class BoulderDashController implements IBoulderDashController {
    private IBoulderDashView boulderDashView;
    private IBoulderDashModel boulderDashModel;



    public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
        this.setView(view);
        this.setModel(model);
    }

    public IBoulderDashModel getBoulderDashModel() {
        return boulderDashModel;
    }

    private void setModel(IBoulderDashModel model) {
        this.boulderDashModel = model;
    }

    public IBoulderDashView getBoulderDashView() {
        return boulderDashView;
    }

    private void setView(IBoulderDashView view) {
        this.boulderDashView = view;
    }

    public void play() throws IOException, InterruptedException {
        this.boulderDashView.runView();
    }

}

    