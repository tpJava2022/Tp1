package Bibliothéque;

import java.util.Vector;

public class Livre {
	private String _title;
	private Vector<String> _auteurs;
	private String _ISBN;
	private double _prix;
	
	public Livre(String title, Vector <String> auteurs, String code, double prix )
	{
		_title= title;
		_auteurs = auteurs;
		_ISBN = code;
		_prix = prix;
	}
	public String toString() {
		String res="";
		res+=" Affichage des caractèristiques\n";
		res+="Le Titre :" +_title+"\n";
		res+="les auteurs: ";
		for(String crt:_auteurs)
			res+= crt+", ";
		res+="\nLe code :" +_ISBN+"\n";
		res+="Le Prix: "+_prix+"dh\n";
		
		return res;
	}
	
	
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public Vector<String> get_auteurs() {
		return _auteurs;
	}
	public void set_auteurs(Vector<String> _auteurs) {
		this._auteurs = _auteurs;
	}
	public String get_ISBN() {
		return _ISBN;
	}
	public void set_ISBN(String _ISBN) {
		this._ISBN = _ISBN;
	}
	public double get_prix() {
		return _prix;
	}
	public void set_prix(double _prix) {
		this._prix = _prix;
	}
	
	

}
