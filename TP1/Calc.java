import java.util.Scanner;

public class Calc {
  public static void main(String args[]){
    Scanner scanner;
    Scanner test;
    int value;
    int val;
    scanner = new Scanner(System.in);
    value = scanner.nextInt();
    test = new Scanner(System.in);
    val = scanner.nextInt();
    test.close();
    scanner.close();
    System.out.printf("Add : %d\n\bSubstract : %d\n\bMultiply : %d\n\bDivide : %d\n\bModulo : %d\n",value+val,value-val,value*val,value/val,value%val);
  }
}
