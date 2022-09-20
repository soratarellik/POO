import java.lang.*;

public record Point(int x, int y){
  
  public int sqr(int x){
    return x * x;
  }

  public double distance(Point b){
        return Math.sqrt(sqr(b.x - x)+sqr(b.y-y));
    }
}