
/**
 * Implements a subclass that inherits from class circle. 
 * The intersects() method is implemented here. 
 */
public class Circle1 extends Circle
{
   /**
    * Create new circle
    * @param x is the x coordinate of the center
    * @param y is the y coordinate of the center
    * @param radius is the radius (assume non-negative)
    */
   public Circle1(double x, double y, double radius)
   {
      // Constructor that is used to create a circle
      super(x,y,radius);
   }

   /**
    * Determines if two circles are intersecting
    * There's an error in it and I should modify it
    * @param other is the other circle 
    *        This method should determine if it
    *        intersects with original circle
    * @return The boolean result that indicates
    *         wether two circle intersect
    */
   public boolean intersects(Circle other)
   {
      // Original code: 
      // if (Math.abs(center.x - other.center.x) < radius &&
      //  Math.abs(center.y - other.center.y) < radius)
      //    return true;
      // return false; ERROR
      
      // New code: 
      double d; // Create an interger variable to store the distance
      // Get distance between 2 centers using the x and y positions
      d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                  Math.pow(center.y - other.center.y, 2));
      // If distance is between sum and absolute value of difference of two circles' radius
      if (d < radius + other.radius && d > Math.abs(radius - other.radius)) {
         return true; // They are intersecting
      } else { // If distance is not within this range
         return false; // They are not intersecting
      }

   }

}

