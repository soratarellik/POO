

public class Pascal{

    public static int pascal(int nBut, int pBut){
        int[] list = new int[nBut+1];
        int i,n;
        list[0] = 1;
        for(n = 1; n <= nBut; n++){
            list[n] = 1;
            for(i = n-1; i > 0; i--){
                list[i] = list[i-1] + list[i];
            }
        }
        int result = list[pBut];
        return result;
    }


    public static void main(String[] args){
        int x = pascal(30000, 250);
        System.out.println("Cn, p = "+x);
    }
}