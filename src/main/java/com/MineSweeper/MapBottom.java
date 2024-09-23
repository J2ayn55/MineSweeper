package com.MineSweeper;

import java.awt.*;

/**
 * 底层地图 绘制游戏相关组件
 */
public class MapBottom {

    /**
     * 绘制方法
     */
    void paintSelf(Graphics g){
        g.setColor(Color.red);
        //画竖线
        for (int i = 0; i < GameUtil.MAP_W+1; i++) {
            g.drawLine(GameUtil.OFFSET+i*GameUtil.SQUARE_LENGTH,
                    3*GameUtil.OFFSET,
                    GameUtil.OFFSET+i*GameUtil.SQUARE_LENGTH,
                    3*GameUtil.OFFSET+GameUtil.MAP_H*GameUtil.SQUARE_LENGTH);
        }

        //画横线
        for (int i = 0; i < GameUtil.MAP_H+1; i++) {
            g.drawLine(GameUtil.OFFSET,
                    3 * GameUtil.OFFSET + i * GameUtil.SQUARE_LENGTH,
                    GameUtil.OFFSET + GameUtil.MAP_W * GameUtil.SQUARE_LENGTH,
                    3 * GameUtil.OFFSET + i * GameUtil.SQUARE_LENGTH);
        }
    }


}
