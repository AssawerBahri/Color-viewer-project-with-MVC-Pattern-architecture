import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;




public class VisCol extends JFrame implements Observer {
	Canvas c;
	JTextField tt,tt2,tt3;
	Modele m;
	
	VisCol(Modele m){
		super("Visualiseur de couleur");
		this.m=m;
		
		setLayout(new BorderLayout());
		
		c=new Canvas();
		c.setSize(300,300);
		c.setBackground(new Color(0,0,255));
		
		Panel p=new Panel();
		add(p,"West");
		p.add(c);
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(3,1));
		add(p1,"East");
		
		Panel pr=new Panel();
		JLabel l=new JLabel("Rouge");
		pr.add(l);
		
		 tt=new JTextField(8);
		pr.add(tt);
		
		JScrollBar s=new JScrollBar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
		s.setName("rouge");
		pr.add(s);
		
		p1.add(pr);
		
		Panel pv=new Panel();
		
		JLabel l2=new JLabel("Vert");
		pv.add(l2);
		
		 tt2=new JTextField(8);
		pv.add(tt2);
		
		JScrollBar s2=new JScrollBar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
		s2.setName("vert");
		pv.add(s2);
		
		p1.add(pv);
		
		Panel pb=new Panel();
		
		JLabel l3=new JLabel("Bleu");
		pb.add(l3);
		
	    tt3=new JTextField(8);
	    tt3.setText("255");
		pb.add(tt3);
		
		JScrollBar s3=new JScrollBar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
		s3.setName("bleu");
		s3.setValue(255);
		pb.add(s3);
		
		p1.add(pb);
		
		pack();
		setVisible(true);
		
		s.addAdjustmentListener(new Controleur(m));
		s2.addAdjustmentListener(new Controleur(m));
		s3.addAdjustmentListener(new Controleur(m));
	}
		
		public void update(Observable o, Object ob)
		{
			Modele m=(Modele) o;
			Color col=new Color(m.getRouge(),m.getvert(),m.getBleu());
			
			c.setBackground(col);
			
			tt.setText(new Integer(m.getRouge()).toString());
			tt2.setText(new Integer(m.getvert()).toString());
			tt3.setText(new Integer(m.getBleu()).toString());
			
			
			
			
		}
		
		
		
	
	
	 public static void main(String args[]) {
		 Modele m=new Modele();
		 VisCol v=new VisCol(m);
		 m.addObserver(v);
	 }

}
