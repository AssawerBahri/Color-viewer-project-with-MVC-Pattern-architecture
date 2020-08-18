import java.awt.event.*;
import javax.swing.*;

public class Controleur implements AdjustmentListener{
	
	Modele m;
	Controleur(Modele m)
	{this.m=m;}
	
	
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		JScrollBar s=(JScrollBar) e.getSource();
		
		if (s.getName().equals("rouge"))
		{m.setRouge(s.getValue());
		}
		else if (s.getName().equals("bleu"))
		{m.setbleu(s.getValue());}
		
		else if(s.getName().equals("vert"))
		{m.setvert(s.getValue());}
		
		
		
	} 
	
	

}
