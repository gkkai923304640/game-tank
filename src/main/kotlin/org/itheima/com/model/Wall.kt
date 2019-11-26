package org.itheima.com.model

import org.itheima.com.Config
import org.itheima.kotlin.game.core.Painter


/**
 * 墙
 */
class Wall:View{


    override val x:Int= 100
     override val y:Int = 100
     override var width: Int =Config.block

    override var height: Int =Config.block
    //绘制
    override fun draw() {
        Painter.drawImage("img/walls.gif",x,y)
    }

    /* //位置
     var x:Int = 200
     var y:Int=200
     //宽高
     var width:Int=Config.block
     var height:Int=Config.block

     //显示属于一种行为
     fun draw(){
         Painter.drawImage("img/walls.gif",x,y)
     }*/


}
