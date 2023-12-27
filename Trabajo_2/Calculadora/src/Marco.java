import javax.swing.JFrame;

public class Marco extends JFrame {
    public Marco(){
        setTitle("Calculadora de alturas y perimetros");
        setBounds(400, 200, 800, 500);

        add(new Lamina());
    }
}
