package com.MineSweeper;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {

    int weight=2*GameUtil.OFFSET+GameUtil.MAP_W*GameUtil.SQUARE_LENGTH;
    int height=4*GameUtil.OFFSET+GameUtil.MAP_H*GameUtil.SQUARE_LENGTH;

    MapBottom mapBottom=new MapBottom();
    /**
     * 创建窗口
     */
    void launch(){
        this.setVisible(true);
        this.setSize(weight,height);
        this.setLocationRelativeTo(null);
        this.setTitle("扫雷");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * 绘制雷区
     */
    public void paint(Graphics g){
       mapBottom.paintSelf(g);
    }

    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.launch();
    }

}
