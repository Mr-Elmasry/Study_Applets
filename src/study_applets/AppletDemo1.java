/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */

package study_applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
/*<applet code ="AppletDemo1"  width="300" height="300">
 </applet>*/

public class AppletDemo1 extends Applet {
    
    @Override
    public void paint(Graphics g) {
        System.out.println("Paint");
        // draw the face
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        // draw the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        // draw the mouth
        g.fillOval(50, 110, 120, 60);
        // "touch up" the mouth into a smile
        g.setColor(Color.red);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
    
    @Override
    public void stop() {
        System.out.println("Stop");
    }
    
    @Override
    public void start() {
        System.out.println("Start");
    }
    
    @Override
    public void init() {
        setSize(600, 100);
        setBackground(Color.lightGray);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setName("Hello Applets");
        System.out.println("init");
    }    
    
    @Override
    public void update(Graphics g) {
        super.update(g); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Update");
    }
    
    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("destroy");
    }
    
}
