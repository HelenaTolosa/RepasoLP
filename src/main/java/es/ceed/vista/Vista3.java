/**
 * Created by carlos on 4/21/16.
 */
package es.ceed.vista;

import javax.swing.*;
import java.awt.*;



    public class Vista3 extends JFrame {

        private JPanel jpPanel1;
        private JPanel jpPanel2;
        private JLabel jlbInforma;
        private JButton jbtGrMysql;
        private JButton jbtGrDB4o;
        private JButton jbtSalir;

        public Vista3() {
            super("Examen"); //Título del marco
            initComponents();
        }

        public void initComponents() {
            jlbInforma = new JLabel("Pulse para guardar los datos");

            jbtGrMysql = new JButton();
            jbtGrDB4o = new JButton();
            jbtSalir = new JButton();

            int filas = 1;
            int columnas = 3;
            int espacioFilas = 5;
            jpPanel1 = new JPanel(new FlowLayout());
            jpPanel2 = new JPanel(new FlowLayout(filas, columnas, espacioFilas));

            jpPanel1.add(jlbInforma);
            jpPanel2.add(jbtGrMysql);
            jpPanel2.add(jbtGrDB4o);
            jpPanel2.add(jbtSalir);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(400, 200));

            //añadimos el jpPanel al JFrame
            this.setLayout(new FlowLayout());
            add(jpPanel1);
            add(jpPanel2);

            jlbInforma.setVisible(true);
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            setResizable(true);
            setLocationRelativeTo(null); //centrar en pantalla
            pack();
        }//fin de initComponents

        public JButton getBotonMysql() {
            return jbtGrMysql;
        }

        public JButton getBotonDB4o() {
            return jbtGrDB4o;
        }

        public JButton getBotonSalir() {
            return jbtSalir;
        }

    }
