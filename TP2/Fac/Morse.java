import java.lang.StringBuilder;

public class Morse {

	static String join(String[] array) {
		var builder = new StringBuilder();
		for(String i : array) {
			builder.append(i).append(" Stop. "); 
		}
		return builder.toString();
	}
	public static void main(String[] args) {
		/* 
		for(String i : args){
			System.out.print(i+" Stop. ");
		}
		*/
		String chaine = join(args);
		System.out.println(chaine);		
	}
}