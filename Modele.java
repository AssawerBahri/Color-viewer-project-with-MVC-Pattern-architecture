import java.util.*;


public class Modele extends Observable {

	private int rouge,bleu,vert;
	
	Modele(){bleu=255;}
	
	int getRouge() {return rouge;}
	int getBleu() {return bleu;}
	int getvert() {return vert;}
	
	void setRouge(int r)
	{
		rouge=r;
		setChanged();
		notifyObservers();
	}
	
	void setbleu(int b)
	{
		bleu=b;
		setChanged();
		notifyObservers();
	}
	
	void setvert(int v)
	{
		vert=v;
		setChanged();
		notifyObservers();
	}
	
	
}
