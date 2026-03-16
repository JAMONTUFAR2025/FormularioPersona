package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class ImagenFondo extends javax.swing.JPanel {
    private java.awt.Image imagen;

    @Override
    public void paint(java.awt.Graphics g) {
        // Carga la imagen desde la ruta de tu proyecto
        imagen = new javax.swing.ImageIcon(getClass().getResource("../assets/3.png")).getImage();
        
        // Dibuja la imagen para que ocupe todo el panel
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
        // Hace que el panel sea transparente para ver los componentes
        setOpaque(false);
        super.paint(g);
    }
}
