package org.itheima.com

import javafx.scene.input.KeyEvent
import org.itheima.com.model.Grass
import org.itheima.com.model.Wall
import org.itheima.kotlin.game.core.Painter
import org.itheima.kotlin.game.core.Window

class GameWindow:Window(title = "坦克大战1.0",
        height =Config.gameHeight,
        width = Config.gameWidth){
            override fun onCreate() {
    }
    //定义一歌墙
    var wall =Wall()
    //定义一个草坪
    var grass=Grass()

    //绘制图像
    override fun onDisplay() {
        //画一个砖墙
        wall.draw()
        grass.draw()
     }

    override fun onKeyPressed(event: KeyEvent) {
     }

    override fun onRefresh() {
     }

}