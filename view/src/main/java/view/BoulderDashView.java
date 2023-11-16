package view;

import contract.IBoulderDashView;
import contract.IMap;
import contract.IMobile;
import model.allElements.Element;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BoulderDashView extends JFrame implements IBoulderDashView {

    private int width;

    /** The height. */
    private int height;

    private IMap map;

    private IMobile player;

    /** The on the road. */
    private Element[][] onTheMap;

    public BoulderDashView(IMap map, IMobile player) throws InterruptedException {
        this.setMap(map);
        this.setPlayer(player);
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
        System.out.println("yo");

        for(int y = 0; y <= 21; y++){
            System.out.println("yo2");
            for(int x = 0; x <= 39; x++){
                BufferedImage img = map_arr[x][y];
                if(img != null){
                    System.out.println(img);
                    JLabel tile = new JLabel(new ImageIcon(img));
                    panel.add(tile);
                }else{
                    System.out.println(" cellule érronée - x = " + x + " y = " + y);
                }
            }
        }
        panel.setLayout(new GridLayout(22,40, 0, 0));
        return panel;
    }

    @Override
    public void runView() throws IOException, InterruptedException {
        JFrame window = new JFrame("Boulder dash groupe 8");
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.getContentPane().add(loadMapPanel());
        /*JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel(new ImageIcon(this.getPlayer().getSprite().getSymbol()));
        panel2.add(label2);
        window.getContentPane().add(panel2);*/
        window.pack();
    }


    @Override
    public final int getWidth(){return this.width;}
    private void setWidth(final int width){this.width = width;}
    private void setHeight(final int height){this.height = height;}
    @Override
    public final int getHeight(){return this.height;}



}
