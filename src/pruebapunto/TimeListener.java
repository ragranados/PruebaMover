/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapunto;

import java.awt.event.*;
/*import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;*/

/**
 *
 * @author rau3
 */
public class TimeListener implements ActionListener, KeyListener {

    public Box box;
    int x = 0, y = 0,velx=1,vely=0;

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if (box.getLocation().x >= 0 && box.getLocation().x < 100) {
            if (box.getLocation().y >= 0 && box.getLocation().y < 100) {
                box.move(0, 4);
            }
        }*/
        box.move(velx, vely);
        
        //System.out.println("("+box.getY().);
        //KeyTyped(e);

    }

    public TimeListener(Box box) {
        this.box = box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void up() {
        vely = -1;
    
    }
    
    public void down(){
        vely = 1;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            up();
        }
        else if(code == KeyEvent.VK_DOWN){
            down();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            vely = 0;

        }
        
    }

}
