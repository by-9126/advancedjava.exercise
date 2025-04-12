package Bai7_2;

import java.util.*;
public class PolyLine {
   private List<Point> points;  
   
   public PolyLine() {  
      points = new ArrayList<Point>();  
   }
   
   public PolyLine(List<Point> points) {
      this.points = points;
   }
 
   public void appendPoint(int x, int y) {
      Point newPoint = new Point(x, y);
      points.add(newPoint);
   }
 
   public void appendPoint(Point point) {
      points.add(point);
   }
 
   public String toString() {
      StringBuilder sb = new StringBuilder("{");
      for (Point aPoint : points) {
          sb.append(aPoint.toString());
      }
      sb.append("}");
      return sb.toString();
   }

   public double getLength() {
      double length = 0.0;
      for (int i = 0; i < points.size() - 1; i++) {
         length += points.get(i).distance(points.get(i + 1));
      }
      return length;
   }
}