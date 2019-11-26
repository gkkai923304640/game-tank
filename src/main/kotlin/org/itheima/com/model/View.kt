package org.itheima.com.model

/**
 * 显示的视图，定义显示的规范
 * 抽象出来草坪和墙的共同属性和方法
 */
interface View {
    //可以定义属性让实现类去实现
    //位置
    val x:Int
    val y:Int
    //宽高
    var width:Int
    var height:Int
    //显示
    fun draw()
}