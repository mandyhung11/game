package com.company.GameView;

import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;

import javax.swing.*;
import java.util.ArrayList;

public class DisasterView extends GameView{
    private ArrayList<Bug> buds = new ArrayList<>();
    private ArrayList<Frog> frogs = new ArrayList<>();
    private ArrayList<Ice> ices = new ArrayList<>();
    private ArrayList<Tombstone> tombstones = new ArrayList<>();

    public DisasterView(){
        img = new ImageIcon("egypt.jpg");
        elements = new ArrayList<>();
    }
}
