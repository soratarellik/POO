public class Test{
    public static void main(String[] args){
        int x,y;
        Point p,origine;
        origine = new Point(0,0);
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        p = new Point(x,y);
        System.out.println(p);
        System.out.println(p.distance(origine));
    }
}