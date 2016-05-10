/**
 * Created by carlos on 4/21/16.
 */
package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

public class Vista2 extends JFrame {

    public Vista2() {
        super("Examen");
        init();
    }

    private void init() {

        JPanel pnl_top = new JPanel();
        pnl_top.setLayout(new FlowLayout());
        pnl_top.add(new JLabel("Id Examen"));
        pnl_top.add(new JTextField("e1", 10));

        this.setLayout(new FlowLayout());
        this.add(pnl_top);

        JPanel pnl_midle = new JPanel();
        pnl_midle.setLayout(new FlowLayout());
        pnl_midle.add(new JLabel("Nombre examen"));
        pnl_midle.add(new JTextField("Exament1", 10));

        this.setLayout(new FlowLayout());
        this.add(pnl_midle);

        JPanel pnl_midle2 = new JPanel();
        pnl_midle2.setLayout(new FlowLayout());
        pnl_midle2.add(new JLabel("Id curso"));
        pnl_midle2.add(new JTextField("c1", 10));

        this.setLayout(new FlowLayout());
        this.add(pnl_midle2);

        JPanel pnl_botton = new JPanel();
        pnl_botton.setLayout(new FlowLayout());
        pnl_botton.add(new JButton("Grabar"));
        pnl_botton.add(new JButton("Salir"));
        pnl_botton.add(new JLabel(""));

        this.setLayout(new FlowLayout());
        this.add(pnl_botton);

        //this.setSize(200,300);
        this.setPreferredSize(new Dimension(250, 250));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //centrar
        pack();
    }

}

