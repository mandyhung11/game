package com.company.Sprite;

import javax.swing.*;
import java.awt.*;
import com.company.Main;

public abstract class Sprite {
    protected ImageIcon img;
    protected Point relativePosition; //(x,y)
    protected Point absolutPosition;

    public void draw(Graphics g){
        img.paintIcon(null, g, absolutPosition.x, absolutPosition.y);
    }

    public void setPosition(Point p){     //overload
        setPosition(p.x, p.y);
    }
    public void setPosition(int x, int y){             //set relative & absolute position
        relativePosition = new Point(x, y);
        absolutPosition = new Point((x - 1) * Main.CELL, (y - 1) * Main.CELL);  //-1 draw from the top-left corner

    }
    public void setnullPosition(){
        relativePosition = null;
        absolutPosition = null;
    }

    public Point getRelativePosition(){
        if(relativePosition == null){
            return null;
        }else{
            return new Point(relativePosition);   //return this.relativePosition => copied by reference
        }
    }
    public abstract String overlap(int x , int y);
}
