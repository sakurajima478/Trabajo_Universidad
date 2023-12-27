import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lamina extends JPanel {
    public Lamina() {
        setLayout(new GridLayout(2, 3));
        // Triangulo
        JPanel panel_triangulo = new JPanel();
        panel_triangulo.setLayout(new GridLayout(0, 1));

        JLabel triangulo = new JLabel("Triangulo");
        JLabel per_tri = new JLabel("Perimetro: ");
        JLabel area_tri = new JLabel("Area: ");

        JLabel lb_alt_tr = new JLabel("Altura: ");
        JTextField txt_alt_tri = new JTextField(12);

        JLabel lb_base_tri = new JLabel("Base: ");
        JTextField txt_base_tri = new JTextField(12);

        JLabel lb_ld_tri = new JLabel("Lado: ");
        JTextField txt_ld_tri = new JTextField(12);

        JButton calcular_tri = new JButton("Calcular");

        panel_triangulo.add(triangulo);
        panel_triangulo.add(per_tri);
        panel_triangulo.add(area_tri);

        panel_triangulo.add(lb_alt_tr);
        panel_triangulo.add(txt_alt_tri);
        panel_triangulo.add(lb_base_tri);
        panel_triangulo.add(txt_base_tri);
        panel_triangulo.add(lb_ld_tri);
        panel_triangulo.add(txt_ld_tri);

        panel_triangulo.add(calcular_tri);

        calcular_tri.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double perimetro, area; 
                perimetro = Double.parseDouble(txt_base_tri.getText()) + Double.parseDouble(txt_ld_tri.getText()) + Double.parseDouble(txt_ld_tri.getText());
                area = Double.parseDouble(txt_base_tri.getText()) * Double.parseDouble(txt_alt_tri.getText()) / 2;

                per_tri.setText("Perimetro: "+perimetro);
                area_tri.setText("Area: "+area);
            }
            
        });

        //Rectangulo
        JPanel panel_rectangulo = new JPanel();
        panel_rectangulo.setLayout(new GridLayout(0, 1));

        JLabel rectangulo = new JLabel("Rectangulo");
        JLabel per_rect = new JLabel("Perimetro: ");
        JLabel area_rect = new JLabel("Area: ");

        JLabel lb_alt_rect = new JLabel("Altura: ");
        JTextField txt_alt_rect = new JTextField(12);

        JLabel lb_base_rect = new JLabel("Base: ");
        JTextField txt_base_rect = new JTextField(12);

        JButton calcular_rect = new JButton("Calcular");
        

        panel_rectangulo.add(rectangulo);
        panel_rectangulo.add(per_rect);
        panel_rectangulo.add(area_rect);

        panel_rectangulo.add(lb_alt_rect);
        panel_rectangulo.add(txt_alt_rect);
        panel_rectangulo.add(lb_base_rect);
        panel_rectangulo.add(txt_base_rect);

        panel_rectangulo.add(calcular_rect);

        calcular_rect.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double perimetro, area; 
                perimetro = 2 * ( Double.parseDouble(txt_alt_rect.getText()) + Double.parseDouble(txt_base_rect.getText()));
                area = Double.parseDouble(txt_base_rect.getText()) * Double.parseDouble(txt_alt_rect.getText());

                per_rect.setText("Perimetro: "+perimetro);
                area_rect.setText("Area: "+area);
            }
            
        });

        //Circulo
        JPanel panel_circulo = new JPanel();
        panel_circulo.setLayout(new GridLayout(0, 1));

        JLabel circulo = new JLabel("Circulo");
        JLabel per_circ = new JLabel("Perimetro: ");
        JLabel area_circ = new JLabel("Area: ");

        JLabel lb_radio_circ = new JLabel("Radio: ");
        JTextField txt_radio_circ = new JTextField(12);

        JButton calcular_circ = new JButton("Calcular");

        panel_circulo.add(circulo);
        panel_circulo.add(per_circ);
        panel_circulo.add(area_circ);

        panel_circulo.add(lb_radio_circ);
        panel_circulo.add(txt_radio_circ);

        panel_circulo.add(calcular_circ);

        calcular_circ.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double perimetro, area; 
                perimetro = 2 * Math.PI * Double.parseDouble(txt_radio_circ.getText());
                area = Math.PI * Math.pow(Double.parseDouble(txt_radio_circ.getText()), 2);

                per_circ.setText("Perimetro: "+perimetro);
                area_circ.setText("Area: "+area);
            }
            
        });

        add(panel_triangulo, BorderLayout.NORTH);
        add(panel_rectangulo, BorderLayout.CENTER);
        add(panel_circulo, BorderLayout.SOUTH);

        panel_triangulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Arriba, izquierda, abajo, derecha
        panel_rectangulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_circulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    }
}
