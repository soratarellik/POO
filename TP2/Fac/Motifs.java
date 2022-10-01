import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Motifs {
  public static byte[] toIPv4(String ip){
		byte[] tab = new byte[4];
		var pattern = Pattern.compile("([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})");
		var matcher = pattern.matcher(ip);
		if(!(matcher.matches())){
			throw new IllegalArgumentException();
		}
		else{
				for(var i = 1; i <= matcher.groupCount(); i++){
					var groupe = Integer.parseInt(matcher.group(i));
					if(!((0 <= groupe) && (groupe <= 255))){
						throw new IllegalArgumentException("Nombre pas compris entre 0 et 255");
					}
					else{
						tab[i-1] = (byte)groupe;
					}
			}
		}
		return tab;
  }


  public static void main(String[] args){
    /* 
      [0-9]+ pour les chiffees
      [0-9]+||.+[0-9]+ pour les chiffres et les arguments qui finissent par des chiffres
    S*/
    String test = "215.85.150.133";
		var tab = toIPv4(test);
		System.out.println(Arrays.toString(tab));
		/*
    var pattern = Pattern.compile("[0-9]+|.+[0-9]+");
    for(String i : args){
      if(pattern.matcher(i).matches() == true){
        System.out.println(i);
      }
    }
  }*/
}
}