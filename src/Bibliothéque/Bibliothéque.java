package Bibliothéque;

import java.util.Vector;

public class Bibliothéque {
	private int nbr_max;
	private Vector<Livre> Liste_livre;
	
	public Bibliothéque() {
		
	}
	public Bibliothéque(int nbr_max) {
		
		this.nbr_max = nbr_max;
		Liste_livre = new Vector<Livre>();
	}
	
	public boolean Ajouter_livre(Livre L1) {
		
		if(Liste_livre.size() < nbr_max)
			return	Liste_livre.add(L1);
		else 
			return false;
	}
	
	public int size()
	{
		return Liste_livre.size();
	}

	public String toString() {
		String res = "--------Bibliothéque-----\n";
		res += "Max size: "+nbr_max+ "\n";
		res += "Les livres :\n";
		for (Livre L : Liste_livre)
			res += L.toString()+ "\n";
		res += "\n --------------\n";
		return res;
				
	}
	public Vector<Livre> Chercher(String aut)
	{
		Vector <Livre> Lres= new Vector <Livre>();
		for (Livre L1: Liste_livre)
		{
			for (String aut1 : L1.get_auteurs()) {
				if (aut1.toLowerCase().contains(aut.toLowerCase()))
					Lres.add(L1);
			}
		}
		return Lres;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
