import javax.swing.*;
public class sample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Serif", Font.BOLD, 15);
        String text = "blah blah blah";
        Color textColor = Color.YELLOW;
        Drawing d = new Drawing(text, font, textColor);

        frame.add(d);
        frame.setSize(100,100);
        frame.setVisible(true);
    }
}