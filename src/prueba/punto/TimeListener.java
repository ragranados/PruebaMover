/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.punto;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rau3
 */
public class TimeListener implements ActionListener{
    public Box box;
    @Override
    
    
    public void actionPerformed(ActionEvent e) {
        box.move(4, 0);
        
    }

    public TimeListener(Box box) {
        this.box = box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    
}
