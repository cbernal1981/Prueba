// prueba git


package tarea;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author CRISTIAN
 */
public class Main
extends JFrame {
    public Main() {
        JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer ejemplo");
        add(lblSaludo);
        this.setSize(400,200);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}