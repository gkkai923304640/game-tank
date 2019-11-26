import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.scene.paint.Color
import org.itheima.kotlin.game.core.Composer
import org.itheima.kotlin.game.core.Painter
import org.itheima.kotlin.game.core.Window

/**
 * 窗体
 *继承游戏引擎的窗口
 */
class MyWindow:Window() {
    override fun onCreate() {
            println("onCreate。。。")
    }
    //窗体渲染回调
    override fun onDisplay() {
        //绘制图片
       // Painter.drawImage("enemy3U.gif",200,200)
     Painter.drawColor(Color.WHITE,20,20,100,100)
     Painter.drawText("你好",30,30)
    }
        //按键响应
    override fun onKeyPressed(event: KeyEvent) {
            when(event.code){
                KeyCode.ENTER -> println("点击了回车键")
                KeyCode.L->Composer.play("")
            }
     }
    //刷新，做业务逻辑
    override fun onRefresh() {
     }


}

fun main(args: Array<String>) {
    Application.launch(MyWindow::class.java)
}