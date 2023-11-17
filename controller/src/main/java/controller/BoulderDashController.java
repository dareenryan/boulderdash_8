package controller;


import contract.IBoulderDashController;
import contract.IBoulderDashModel;
import contract.IBoulderDashView;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.text.View;
import java.io.File;
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
    public static void music(){
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream((new File("Le-Car-Qui-Part-Audio-Officiel.wav")));
            Clip gamemusic = AudioSystem.getClip();
            gamemusic.open(audioInputStream);
            gamemusic.loop(Clip.LOOP_CONTINUOUSLY);
            gamemusic.start();

        } catch (Exception ex){
            ex.printStackTrace();
        }


    }


}

    