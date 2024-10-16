public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(((a.getX() - b.getX()) * (a.getX() - b.getX())) + ((a.getY() - b.getY()) * (a.getY() - b.getY())));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point trianglepoint1 = new Point(0,0);
    Point trianglepoint2 = new Point(1,0);
    Point trianglepoint3 = new Point(0.5,Math.sqrt(3) / 2);

    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println(p2.distanceTo(p3));
    System.out.println(Point.distance(p1, p3));
    System.out.println("Side length from triangle point 1 to 2: " + distance(trianglepoint1,trianglepoint2));
    System.out.println("Side length from triangle point 2 to 3: " + Point.distance(trianglepoint2,trianglepoint3));
    System.out.println("Side length from triangle point 1 to 3: " + trianglepoint1.distanceTo(trianglepoint3));
  }
}
