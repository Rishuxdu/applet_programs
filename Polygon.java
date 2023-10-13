import java.applet.*;
import java.awt.*;
public class  Polygon extends Applet{
    public void paint(Graphics g){
    int x[]={20,40,60};  int y[]={80,20,80};
    g.drawPolygon(x,y,3);
    

    }
}