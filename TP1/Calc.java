import java.util.Scanner;

public class Calc {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();
    int val = scanner.nextInt();
    scanner.close();
    System.out.printf("Add : %d\n\bSubstract : %d\n\bMultiply : %d\n\bDivide : %d\n\bModulo : %d\n",value+val,value-val,value*val,value/val,value%val);
  }
}
