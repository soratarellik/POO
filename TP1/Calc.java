import java.util.Scanner;

public class Calc {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();
    Scanner test = new Scanner(System.in);
    int val = scanner.nextInt();
    test.close();
    scanner.close();
    System.out.printf("Add : %d\n\bSubstract : %d\n\bMultiply : %d\n\bDivide : %d\n\bModulo : %d\n",value+val,value-val,value*val,value/val,value%val);
  }
}
