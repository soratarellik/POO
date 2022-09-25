public class Test{
  public static void main(String[] args){
    int x,y;
    Point point,origine;
    
    origine = new Point(0,0);
    x = Integer.parseInt(args[0]);
    y = Integer.parseInt(args[1]);
    point = new Point(x,y);
    System.out.printf("x = %d, y = %d\n",x,y);
    System.out.println(point);
    System.out.println("dist = "+p.distance(origine));
  }
}