/**
 * Created by carlos on 4/21/16.
 */
package es.ceed.vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Vista1 extends JFrame {

    public Vista1() {
        super("Control Acceso");
        init();
    }

    private void init() {
        JPanel pnl_top = new JPanel();
        pnl_top.setLayout(new FlowLayout());
        pnl_top.add(new JLabel("Usuario"));
        pnl_top.add(new JTextField("User", 10));
        pnl_top.add(new JLabel("Contrasena"));
        pnl_top.add(new JPasswordField("Pass", 10));

        this.setLayout(new FlowLayout());
        this.add(pnl_top);

        JPanel pnl_midle = new JPanel();
        pnl_midle.setLayout(new FlowLayout());
        pnl_midle.add(new JButton("Entrar"));
        pnl_midle.add(new JButton("Salir"));

        this.setLayout(new FlowLayout());
        this.add(pnl_midle);

        JPanel pnl_botton = new JPanel();
        pnl_botton.setLayout(new FlowLayout());
        pnl_botton.add(new JLabel("alertas"));

        //this.setSize(200,300);
        this.setPreferredSize(new Dimension(450, 150));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //centrar
        pack();
    }

}
