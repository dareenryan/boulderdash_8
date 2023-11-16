package view;

import contract.IBoulderDashView;
import contract.IMap;
import contract.IMobile;
import model.allElements.Element;
import model.allElements.mobileElem.Player;
import model.allElements.staticElem.Empty;
import model.allElements.staticElem.Sand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BoulderDashView extends JFrame implements IBoulderDashView, KeyListener {

    private int width;

    /** The height. */
    private int height;

    private IMap map;

    private IMobile player;

    /** The on the road. */
    private Element[][] onTheMap;

    private JLabel[][] labels;

    public BoulderDashView(IMap map) throws InterruptedException {
        this.setMap(map);
        this.player = this.map.getPlayer();
    }

    public void setMap(IMap map) {
        this.map = map;
    }

    public void setPlayer(IMobile player) {
        this.player = player;
    }


    @Override
    public IMobile getPlayer() {
        return player;
    }

    @Override
    public IMap getMap() {
        return map;
    }

    public JPanel loadMapPanel() throws InterruptedException, IOException {
        JPanel panel = new JPanel();
        BufferedImage[][] map_arr = this.map.getSymbolonTheMap();
        labels = new JLabel[40][22];
        System.out.println("yo");

        for(int y = 0; y <= 21; y++){
            System.out.println("yo2");
            for(int x = 0; x <= 39; x++){
                BufferedImage img = map_arr[x][y];
                if(img != null){
                    System.out.println(x + " " + y);
                    JLabel tile = new JLabel(new ImageIcon(img));
                    labels[x][y] = tile;
                    panel.add(labels[x][y]);
                }else{
                    System.out.println(" cellule érronée - x = " + x + " y = " + y);
                }
            }
        }
        panel.setLayout(new GridLayout(22,40, 0, 0));
        BufferedImage icon = this.getPlayer().getSprite().getSymbol();
        JLabel iconLabel = new JLabel(new ImageIcon(icon));

        return panel;
    }

    @Override
    public void runView() throws IOException, InterruptedException {
        JFrame window = new JFrame("Boulder dash groupe 8");
        window.setVisible(true);
        window.setResizable(false);
        window.addKeyListener(this);
        window.setFocusable(true);
        window.setLocationRelativeTo(null);
        window.getContentPane().add(loadMapPanel());
        window.pack();
    }

    private void handleKeyPressed(KeyEvent e) {
        // Gérez les actions en fonction de la touche enfoncée
        int keyCode = e.getKeyCode();
        ImageIcon pi = new ImageIcon(this.player.getSprite().getSymbol());
        ImageIcon ti = new ImageIcon(new Empty().getSprite().getSymbol());
        int newX;
        int newY;
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                // Déplacement vers la gauche
                newX = this.player.getPosition().x -1;
                newY = this.player.getPosition().y;
                labels[newX+1][newY].setIcon(ti);
                labels[newX][newY].setIcon(pi);
                this.player.getPosition().setLocation(newX, newY);
                break;
            case KeyEvent.VK_RIGHT:
                // Déplacement vers la droite
                newX = this.player.getPosition().x +1;
                newY = this.player.getPosition().y;
                labels[newX-1][newY].setIcon(ti);
                labels[newX][newY].setIcon(pi);
                this.player.getPosition().setLocation(newX, newY);
                break;
            case KeyEvent.VK_UP:
                // Déplacement vers le haut
                newX = this.player.getPosition().x;
                newY = this.player.getPosition().y - 1;
                labels[newX][newY+1].setIcon(ti);
                labels[newX][newY].setIcon(pi);
                this.player.getPosition().setLocation(newX, newY);
                break;
            case KeyEvent.VK_DOWN:
                // Déplacement vers le bas
                newX = this.player.getPosition().x;
                newY = this.player.getPosition().y + 1;
                labels[newX][newY-1].setIcon(ti);
                labels[newX][newY].setIcon(pi);
                this.player.getPosition().setLocation(newX, newY);
                break;
            // Ajoutez d'autres cas pour d'autres touches si nécessaire
        }
    }


    @Override
    public final int getWidth(){return this.width;}
    private void setWidth(final int width){this.width = width;}
    private void setHeight(final int height){this.height = height;}
    @Override
    public final int getHeight(){return this.height;}


    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
        handleKeyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
        //handleKeyPressed(e);
    }
}
