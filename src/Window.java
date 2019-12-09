import javax.swing.*;

public class Window extends JFrame {
    int width=800;
    int height=600;
    public Window(){
        this.setTitle("Minecraft");
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
