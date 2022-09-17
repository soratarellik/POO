
public record Point(int x, int y) {
	
	double distance(Point B) {
		double x;
		double y;
		x = Math.pow(B.x - this.x,2);
		y = Math.pow(B.y - this.y,2);
		return Math.sqrt(x + y);
	}
	
	public static void main(String args[]) {
		int x,y;
		var origin = new Point(0,0);
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		System.out.printf("x=%d, y=%d\n",x,y);
		var p = new Point(x,y);
		System.out.print(p+"\n");
		System.out.println(p.distance(origin));
	}
}