import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ex3 {

    public String adresse(String ip){
        String p1 = "[0-2][0-5]{2}\.){3}[0-2][0-5]{2}";
        var pattern = Pattern.compile(p1);
        if(pattern.matcher(ip).matches() == true){
            return ip;
        }
        return "pas une ip";
    }

    public static void main(String[] args){
        /* 
         [0-9]+ pour les chiffees
         [0-9]+||.+[0-9]+ pour les chiffres et les arguments qui finissent par des chiffres
        S*/
        String test = "172.16.254.4";

        var pattern = Pattern.compile("[0-9]+||.+[0-9]+");
        for(String i : args){
            if(pattern.matcher(i).matches() == true){
                System.out.println(i);
            }
        }
    }
}
