/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapunto;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author rau3
 */
public class Contenedor {
    JFrame frame = new JFrame();
    
    public Contenedor(){
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final Box box = new Box();
        frame.add(box);
        frame.setVisible(true);
        ActionListener actionListener = new TimeListener(box);
        
        Timer timer = new Timer(100,actionListener);
        timer.start();
    }
}
