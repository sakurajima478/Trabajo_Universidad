import javax.swing.JFrame;

public class Marco extends JFrame {
    public Marco(){
        setTitle("Calculadora de alturas y perimetros");
        setBounds(340, 220, 600, 680);

        add(new Lamina());
    }
}
