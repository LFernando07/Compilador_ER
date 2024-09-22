package org.example.misArchivos.AuxiliarClass;
import java.awt.*;
import javax.swing.*;
public class DegradePane extends JPanel {
    private Color color1;
    private Color color2;

    public DegradePane(){

    }
    public DegradePane(Color color1, Color color2){
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Crear un degradado desde la parte superior izquierda a la inferior derecha
        if(color1 == null && color2==null) {
            color1 = Color.orange;
            color2 = Color.CYAN;
        }
        int width = getWidth();
        int height = getHeight();

        GradientPaint gradient = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
    }
}
