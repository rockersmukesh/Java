import java.awt.event.*;
import javax.swing.*;
class Arith implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	Arith()
	{
		f=new JFrame("Arithmetic Operation");
		l1=new JLabel("Enter Number1");
		l1.setBounds(30,50,100,40);
		t1=new JTextField();
		t1.setBounds(130,50,100,40);
		l2=new JLabel("Enter Number2");
		l2.setBounds(30,100,100,40);
		t2=new JTextField();
		t2.setBounds(130,100,100,40);
		b1=new JButton("+");
		b1.setBounds(30,150,50,40);
		b2=new JButton("-");
		b2.setBounds(100,150,50,40);
		b3=new JButton("*");
		b3.setBounds(170,150,50,40);
		b4=new JButton("/");
		b4.setBounds(240,150,50,40);
		l3=new JLabel("Result:");
		l3.setBounds(30,200,80,50);
		l4=new JLabel();
		l4.setBounds(100,200,100,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l3);
		f.add(l4);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int a,b,c;
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a+b;
			String s3=String.valueOf(c);
			l4.setText(s3);
		}
		else if(e.getSource()==b2)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int a,b,c;
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a-b;
			String s3=String.valueOf(c);
			l4.setText(s3);
		}
		else if(e.getSource()==b3)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int a,b,c;
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a*b;
			String s3=String.valueOf(c);
			l4.setText(s3);
		}
		else if(e.getSource()==b4)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int a,b,c;
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a/b;
			String s3=String.valueOf(c);
			l4.setText(s3);
		}
		else
		{
			l4.setText("Click any Button");
		}
	}
	public static void main(String[] args)
	{
		Arith ob=new Arith();
	}
}
