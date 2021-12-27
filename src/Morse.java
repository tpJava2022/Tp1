
public class Morse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var = ""; 
		for(int i=0; i<args.length; i++ )
		{
			args[i]+= " Stop ";
			var+= args[i];
		}
		System.out.println(var);
		
	}

}
