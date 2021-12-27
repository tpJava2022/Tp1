package Exo2;
//import java.lang.Exception
public class Somme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double somme = 0;
        for (String cour : args)
        {
        	try {
        	somme+= Double.parseDouble(cour);
        	}
        	catch (NumberFormatException ex) {
        		System.out.println("Excaptioon levée");
        		
        	}
        }
        System.out.println(somme);
	}

}
