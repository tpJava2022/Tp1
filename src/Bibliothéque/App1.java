package Bibliothéque;

import java.util.Scanner;
import java.util.Vector;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Vector< String> liste_aut = new Vector<String>();
		Vector< String> liste_aut2 = new Vector<String>();
		Vector< Livre> liste_aut3 = new Vector<Livre>();
		liste_aut.add("Fadwa");
		liste_aut.add("Salah");
		liste_aut2.add("Chaimae");
		liste_aut2.add("Fadwa");
		Livre L= new Livre("TITLE1",liste_aut,"1234", 100);
		Livre L1= new Livre("TITLE2",liste_aut2,"1234", 100);
		Livre L2= new Livre("TITLE3",liste_aut,"1234", 100);
		
		System.out.println(L);
		System.out.println("\n---------------------\n");
		Bibliothéque B1 = new Bibliothéque(2);
		B1.Ajouter_livre(L);
		B1.Ajouter_livre(L1);
		B1.Ajouter_livre(L2);
		System.out.println(B1);
		liste_aut3=B1.Chercher("sa");
		  for (Livre L3 : liste_aut3) {
			  System.out.println("Titre : " +L3.get_title());
		  }*/
		Scanner clavier = new Scanner(System.in);
		int choix=0;
		
		 Bibliothéque B1= new Bibliothéque();
		do{
				do
				
		        {
		                System.out.println("\n   ***********************************************************");
		                System.out.println( "\n                    Menu Biblothéque                       ");
		                System.out.println( "\n   ***********************************************************");
		                System.out.println("\n\t1. Implementer la bibliothéque");
		               System.out.println( "\n\t2. Ajouter Un livre" );     
		               System.out.println("\n\t3. Afficher le contenu de la biblothéque");
		               System.out.println("\n\t4. Chercher les livres d'un auteur");
		                
		                        System.out.println( "\nTaper Votre choix: ");
		                       choix = clavier.nextInt();
		                       //clavier.close();
		          //choix ++;
		        }while(choix<0 && choix >5);
		   switch(choix)
		   {
		   
				   case 1:
				   {
					     int n ;
					     System.out.println("\n Donner le nombre maximale de livre: ");
					     n = clavier.nextInt();
					      B1 = new Bibliothéque(n);
					      System.out.println("Bibliothéque crée");
					     break;
				   }
				   case 2:
				   {
					   String code ; 
					   String nom, name;
					   double pri;
					   int i;
						     System.out.println("\n Donner le titre du livre: "); 
						     clavier.nextLine();
						     nom = clavier.nextLine();
						     //clavier.nextLine();
						    
						     System.out.println("\n Donner le prix du livre: ");
							   pri = clavier.nextFloat();
							   clavier.nextLine();
						     System.out.println("\n Donner le code du livre: ");
						    code = clavier.nextLine();
						   // clavier.nextLine();
						   
						   //clavier.nextLine();
						   System.out.println("\n Donner le nombre des auteurs  du livre: ");
						   i=clavier.nextInt();
						   clavier.nextLine();
						   Vector< String> liste_aut = new Vector<String>();
							
						   for(int j=0;j<i;j++)
						   {
							   System.out.println("Donner le nom: ");
							  // clavier.nextLine();
							   name=clavier.nextLine();
							   clavier.nextLine();
							   liste_aut.add(name);
						   }
						 
					   Livre L= new Livre(nom,liste_aut, code , pri);
					   System.out.println("*****************************");
					    System.out.println(L);
					   B1.Ajouter_livre(L);
					  // liste_aut.clear();
				   }
					   break;
				   
				   case 3:
					   System.out.println(B1);
					   break;
				   case 4:{
					   
					   System.out.println("\n Donner le titre du livre: "); 
					    String aut=clavier.nextLine();
					   Vector< Livre> liste_aut3 = new Vector<Livre>();
					   
					   liste_aut3=B1.Chercher(aut);
						  for (Livre L3 : liste_aut3) {
							  System.out.println("Titre : " +L3.get_title());
						  }
					   break;
				   }
					   
				   default:
		           {
		        	   System.out.println("\n---  Choix invalide! ---");
		               break;
		           }
		   }
               
           
			   
			   
	 }while(choix != 5);

	}

}
