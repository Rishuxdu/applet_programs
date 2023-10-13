import java.applet.*;
import java.awt.*;
public class oval extends Applet {
    public void paint(Graphics g){
    //  the paint methods takes first point and width and height and draws an oval possible within the given rectangle
        g.drawOval(40,50,70,90);
    }
}
/* <APPLET code ="oval.class" width ="300" height = "300"></APPLET>
*/