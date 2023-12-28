import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        Marco marco = new Marco();

        marco.setResizable(false);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
