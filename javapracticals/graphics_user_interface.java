import java.awt.Color;

import javax.swing.*;

import java.awt.event.*;

public class graphics_user_interface extends JFrame implements ActionListner {
    public static void main(String[] args) {

    }

    // Container c;
    JButton btng, btnr;

    void mycontent() {
        JFrame Frame = new JFrame("Frame");
        Container c = Frame.getContentPane();
        Frame.setVisible(true);
        FrameSetBounds(100, 100, 1000, 500);
        btng = new JButton("Button 1");
        btnr = new JButton("Button 2");
        btngActionListener(this);
        btnrActionListner(this);

    }

    void ActionPerformed(ActionEvent e) {
        if (e.getSource() == btng) {
            btng.setBackground(Color.green);

        }
        if (e.getSource() == btnr) {
            btnr.setBackground(Color.RED);
        }
    }

}
