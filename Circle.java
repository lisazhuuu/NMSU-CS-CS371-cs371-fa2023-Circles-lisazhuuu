import java.text.DecimalFormat;

/**
* Implements a base abstract class for a circle. Everything except 
* a intersects() method is implemented here. Subclass must implement
* the intersects() method.
**/
public abstract class Circle
{
   protected Point center;
   protected double radius;

/**
* Create new circle
* @param x is the x coordinate of the center
* @param y is the y coordinate of the center
* @param radius is the radius (assume non-negative)
**/
public Circle(double x, double y, double radius)
{
   center = new Point();
   center.x = x;
   center.y = y;
   this.radius = radius;
}

/**
* Change size of circle
* @param factor is the scaling factor (0.8
*        make it 80% as big, 2.0 doubles its size)
*        (if negative, return without scaling)
* @return the new radius
**/
public double scale(double factor)
{
   // Original code: 
   // radius = radius + factor; ERROR
   // return radius;
   // New code:
   if (factor > 0) { // It can't be negative
      radius = radius * factor; // Radius的倍数
   } 
   return radius;
}

/**
* Change position of circle relative to current position
* @param xOffset is amount to change x coordinate
* @param yOffset is amount to change y coordinate
* @return the new center coordinate
**/
public Point moveBy(double xOffset, double yOffset)
{
   // Has to add with center
   center.x = center.x + xOffset; // 横向距离
   // Original code:
   // center.y = center.y + xOffset; ERROR
   // New code: 
   center.y = center.y + yOffset; // 纵向距离
   return center;
}

/**
* Test if this circle intersects another circle.
* @param other is the other circle
* @return True if the circles' outer edges intersect
*         at all, False otherwise
**/
public abstract boolean intersects(Circle other);

}

