package org.itheima.com.model

import org.itheima.com.Config
import org.itheima.kotlin.game.core.Painter

/**
 * 草坪
 */
class Grass:View{
    override val x: Int=200
     override val y: Int=200
     override var width: Int=Config.block

    override var height: Int=Config.block

    override fun draw() {
        Painter.drawImage("img/grass.png",x,y)
     }

}