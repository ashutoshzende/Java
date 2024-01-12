
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class student1 extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bc,ba,bs,bm,bd,be;
    JTextField t1;
    double v1,v2,r;
    int op;
    Panel p = new Panel();
    GridLayout g = new GridLayout(4,4,10,20);
    JFrame fm = new JFrame("Calculator");
    public student1()
    {
        t1 = new JTextField("0.0",20);
        fm.setLayout(new FlowLayout());
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bc = new JButton("clr");
        ba = new JButton("+");
        bs = new JButton("-");
        bm = new JButton("*");
        bd = new JButton("/");
        be = new JButton("=");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        bc.addActionListener(this);
        fm.add(t1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(ba);
        p.add(bs);
        p.add(bm);
        p.add(bd);
        p.add(be);
        p.add(bc);
        p.setLayout(g);
        fm.add(p);
        fm.setVisible(true);
        fm.setSize(400,400);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t1.setText(t1.getText()+"1");
        }
        if(e.getSource()==b2)
        {
            t1.setText(t1.getText()+"2");
        }
        if(e.getSource()==b3)
        {
            t1.setText(t1.getText()+"3");
        }
        if(e.getSource()==b4)
        {
            t1.setText(t1.getText()+"4");
        }
        if(e.getSource()==b5)
        {
            t1.setText(t1.getText()+"5");
        }
        if(e.getSource()==b6)
        {
            t1.setText(t1.getText()+"6");
        }
        if(e.getSource()==b7)
        {
            t1.setText(t1.getText()+"7");
        }
        if(e.getSource()==b9)
        {
            t1.setText(t1.getText()+"8");
        }
        if(e.getSource()==b9)
        {
            t1.setText(t1.getText()+"9");
        }
        if(e.getSource()==b0)
        {
            t1.setText(t1.getText()+"0");
        }
        if(e.getSource()==bc)
        {
            t1.setText(" ");
        }
        if(e.getSource()==ba)
        {
            v1 = Double.parseDouble(t1.getText());
            op = 1;
            t1.setText("");
        }
        if(e.getSource()==bs)
        {
            v1 = Double.parseDouble(t1.getText());
            op = 2;
            t1.setText("");
        }
        if(e.getSource()==bm)
        {
            v1 = Double.parseDouble(t1.getText());
            op = 3;
            t1.setText("");
        }
        if(e.getSource()==bd)
        {
            v1 = Double.parseDouble(t1.getText());
            op = 4;
            t1.setText("");
        }
        try
        {
            if(e.getSource()==be)
            {
                v2 = Double.parseDouble(t1.getText());
                switch(op)
                {
                    case 1:
                        r = v1+v2;
                        t1.setText(""+r);
                        break;

                    case 2:
                        r = v1-v2;
                        t1.setText(""+r);
                        break;

                    case 3:
                        r = v1*v2;
                        t1.setText(""+r);
                        break;

                    case 4:
                        r = v1/v2;
                        t1.setText(""+r);
                        break;
                    default:
                        System.out.println("\n\t No operation selected .....\n");
                        break;
                }
            }
        }
        catch(NumberFormatException ne)
        {
            System.out.println(ne);
        }

    }
    public static void main(String args[])
    {
        student ob= new student();
    }
}

