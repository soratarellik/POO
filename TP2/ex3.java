import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ex3 {
    public static void main(String[] args){
        var pattern = Pattern.compile("[0-9]+");
        for(String i : args){
            if(pattern.matcher(i).matches() == true){
                System.out.println("Oui c'est ce qu'il me fallait");
            }
        }
    }
}
