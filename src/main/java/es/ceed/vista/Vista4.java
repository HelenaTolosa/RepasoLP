/**
 * Created by carlos on 4/21/16.
 */

package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

public class Vista4 extends JFrame {
    
    JTextField op1;
    JTextField op2;
    JTextField res;
    JButton suma;
            
    public Vista4() {
        super("ex31gui");
        init();
    }

    private void init() {
        
        this.setLayout(new GridLayout(3,2));
        this.add(new JLabel("Operando1"));
        op1 = new JTextField("2",10);
        this.add(op1);
        this.add(new JLabel("Operando2"));
        op2 = new JTextField("2",10);
        this.add(op2);
        
        suma = new JButton("Sumar");
        this.add(suma);
        res = new JTextField("2",10);
        this.add(res);
        
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });    
        
        setResizable(true);
        setLocationRelativeTo(null); //centrar en pantalla
        pack();
    }
    
    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {
        ObtenerSuma();
    }
    
    public void ObtenerSuma() throws NumberFormatException {
        ////
        String sop1 = this.op1.getText();
        Integer iop1 = Integer.parseInt(sop1);
        
        String sop2 = this.op2.getText();
        Integer iop2 = Integer.parseInt(sop2);
        
        Integer ires = iop1 + iop2;
        
        String sres = ires.toString();
        
        this.res.setText(sres);      
    }
 }    