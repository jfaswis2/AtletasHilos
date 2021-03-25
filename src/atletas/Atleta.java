/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atletas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author jfasw
 */
public class Atleta extends Thread {
    
    private int Numero;
    private JProgressBar ProgressBar;
    private JLabel Label;
    
    public Atleta(int Numero, JProgressBar ProgressBar, JLabel Label) {
        this.Numero = Numero;
        this.ProgressBar = ProgressBar;
        this.Label = Label;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i <= 100; i++) {
            try {
                
                this.ProgressBar.setValue(i);
                this.Label.setText(i + "%");
                i = i + this.Numero - 1;
                Thread.sleep(1000);
                if (i > 100) {
                    this.ProgressBar.setValue(100);
                    this.Label.setText("100%");
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }    
}
