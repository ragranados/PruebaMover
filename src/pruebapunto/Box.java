/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapunto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author rau3
 */
public class Box extends JComponent{
    public Rectangle rec;
    
    public Box(){
        rec = new Rectangle(10,10,25,25);
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(rec); 
    }
    
    @Override
    public void move(int x, int y){
        rec.translate(x, y);
        repaint();
    }
    
}
