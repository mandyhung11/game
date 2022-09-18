package com.company.GameView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import com.company.Sprite.*;

public abstract class GameView {
    protected ArrayList<Sprite> elements;
    protected Door door;
    protected ImageIcon img; //background

    public void drawView(Graphics g){  //each game view needs to draw itself again
        img.paintIcon(null, g, 0, 0); //null=itself use g to paint itself
        for(Sprite s : elements){
            s.draw(g);  //each element can draw
        }
    }

}
