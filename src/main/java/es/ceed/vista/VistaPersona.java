package es.ceed.vista;

import javax.swing.*;
import java.awt.*;

/**
 * Created by carlos on 5/4/16.
 */
public class VistaPersona extends JFrame {

    private JTextField txt_id_persona;
    private JTextField txt_contraseña;
    private JTextField txt_pass;
    private JTextField txt_grupo;
    private JButton btn_entrar;
    private JButton btn_salir;

    public VistaPersona(){
        super("Vista persona");
        init();
    }

    private void init() {
        //completar


        this.setPreferredSize(new Dimension(450,150));
        this.setResizable(false);
        this.setLocationRelativeTo(null); //centrar
        pack();

        throw new RuntimeException("Vista persona no implentado");

    }

    //completar con getters


}
