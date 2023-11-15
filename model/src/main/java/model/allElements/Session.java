package model.allElements;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Session extends JFrame {
    public Session() throws InterruptedException {
        super("test anim");
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        JFrame frame = new Session();
        JPanel panel = new JPanel();

        BufferedImage[][] map_arr = Map.loadMap("maps_txt/MAP4.txt");

        for(int y = 0; y <= 21; y++){
            for(int x = 0; x <= 39; x++){
                BufferedImage img = map_arr[x][y];
                if(img != null){
                    //System.out.println(img);
                    JLabel tile = new JLabel(new ImageIcon(img));
                    panel.add(tile);
                }else{
                    System.out.println("x = " + x + " y = " + y);
                }
            }
        }
        panel.setLayout(new GridLayout(22,40, 0, 0));
        frame.getContentPane().add(panel);
        frame.setSize(640,352);



    }

}
