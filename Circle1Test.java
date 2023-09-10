/***
* Example JUnit testing class for Circle1 (and Circle)
***/

// Import all assertions and all annotations
// - see docs for lists and descriptions
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.text.DecimalFormat;

import org.junit.jupiter.api.*;

/**
 * Implements a class that is consisted of test cases for Circle1
 * The test cases should fully test the functions in Circle and Circle1
 */
public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   private Circle1 otherCircle;
   
   /**
    * @BeforeEach
    * Set up before every test case
    * Indicates that test start
    * Create new circle1 with center of (1, 2) and radius of 3
    */
    @BeforeEach
   public void setup()
   {
      System.out.println("\nTest starting...");
      circle1 = new Circle1(1,2,3);
   }

   /**
    * @AfterEach
    * Tear down after every test case
    * Indicates that test start
    */
    @AfterEach
   public void teardown()
   {
      System.out.println("\nTest finished.");
   }

   // ================================================== Move ==================================================

   /**
    * @Test
    * This test case tests the moveBy() method in Circle 
    * By giving two same positive parameters
    * Indicates that simpleMove() test starts
    * Create a point is 1 unit away from center at x coordinate 
    * And 1 unit away from center at y coordinate
    * If result point's position is at (2, 3), then test is successful
    */
    @Test
   public void simpleMove()
   {
      Point p;
      System.out.println("Running test simpleMove.");
      p = circle1.moveBy(1,1);
      assertTrue(p.x == 2 && p.y == 3);
   }
   
   /**
    * @Test
    * This test case tests the moveBy() method in Circle 
    * By giving two same negative parameters
    * Indicates that simpleMoveN() test starts
    * Create a point is -1 unit away from center at x coordinate 
    * And -1 unit away from center at y coordinate
    * If result point's position is at (0, 1), then test is successful
    */
    @Test
   public void simpleMoveN()
   {
      Point p;
      System.out.println("Running test simpleMoveN.");
      p = circle1.moveBy(-1,-1);
      assertTrue(p.x == 0 && p.y == 1);
   }

   
   /**
    * @Test
    * This test case tests the moveBy() method in Circle 
    * By giving two different positive parameters
    * Indicates that simpleMoveDP() test starts
    * Create a point is 1 unit away from center at x coordinate 
    * And 2 unit away from center at y coordinate
    * If result point's position is at (2, 4), then test is successful
    */
    @Test
   public void simpleMoveDP()
   {
      Point p;
      System.out.println("Running test simpleMoveDP.");
      p = circle1.moveBy(1,2);
      assertTrue(p.x == 2 && p.y == 4);
   }

   /**
    * Found error in moveBy() method of Circle.java
    * @Test
    * This test case tests the moveBy() method in Circle 
    * By giving two different negative parameters
    * Indicates that simpleMoveNP() test starts
    * Create a point is -1 unit away from center at x coordinate 
    * And -2 unit away from center at y coordinate
    * If result point's position is at (0, 0), then test is successful
    */
    @Test
   public void simpleMoveDN()
   {
      Point p;
      System.out.println("Running test simpleMoveDN.");
      p = circle1.moveBy(-1,-2);
      assertTrue(p.x == 0 && p.y == 0);
   }

   // ================================================== Scales ==================================================

   /**
    * Found error in scale() method of Circle.java
    * @Test
    * This test case tests the scale() method in Circle 
    * By giving a negative factor
    * Indicates that simpleScaleN() test starts
    * Create a radius that is -1 times of the original radius
    * If result radius is 3, then test is successful
    */
    @Test
   public void simpleScalesN() {
      double r;
      System.out.println("Running test simpleScaleN.");
      r = circle1.scale(-1);
      assertTrue(r==3);
   }

   /**
    * @Test
    * This test case tests the scale() method in Circle 
    * By giving a decimal factor
    * Indicates that simpleScaleD() test starts
    * Create a radius that is 0.5 times of the original radius
    * If result radius is 1.5, then test is successful
    */
    @Test
   public void simpleScalesD() {
      double r;
      System.out.println("Running test simpleScaleD.");
      r = circle1.scale(0.5);
      assertTrue(r==1.5);
   }

   
   /**
    * @Test
    * This test case tests the scale() method in Circle 
    * By giving a integer factor
    * Indicates that simpleScaleI() test starts
    * Create a radius that is 3 times of the original radius
    * If result radius is 9, then test is successful
    */
    @Test
   public void simpleScalesI() {
      double r;
      System.out.println("Running test simpleScaleI.");
      r = circle1.scale(3);
      assertTrue(r==9);
   }

   // ================================================== Intersects ==================================================

   /**
    * Found error in intersects(Circle other) method of Circle1.java
    * @Test
    * This test case tests the intersects() method in Circle1
    * By given a circle with set of positive parameters 
    * The result of this test case should be true
    * Indicates that intersectsTP() test starts
    * Create a circle that has center at (4, 5) and radius of 4
    * If result radius is true, then test is successful
    */
    @Test
   public void intersectsTP()
   {
      boolean b;
      System.out.println("Running test intersectsTC.");
      otherCircle = new Circle1(4, 5, 4);
      b = circle1.intersects(otherCircle);
      assertTrue(b==true);
   }

   
   /**
    * @Test
    * This test case tests the intersects() method in Circle1
    * By given a circle with set of negative parameters 
    * The result of this test case should be true
    * Indicates that intersectsTP() test starts
    * Create a circle that has center at (-1.9, -0.9) and radius of 7
    * If result radius is true, then test is successful
    */
    @Test
   public void intersectsTN()
   {
      boolean b;
      System.out.println("Running test intersectsTF.");
      otherCircle = new Circle1(-1.9, -0.9, 7);
      b = circle1.intersects(otherCircle);
      assertTrue(b==true);
   }

   /**
    * @Test
    * This test case tests the intersects() method in Circle1
    * By given a circle with set of positive parameters 
    * The result of this test case should be false
    * Indicates that intersectsTP() test starts
    * Create a circle that has center at (10, 10) and radius of 4
    * If result radius is false, then test is successful
    */
    @Test
   public void intersectsF()
   {
      boolean b;
      System.out.println("Running test intersectsTF.");
      otherCircle = new Circle1(10, 10, 4);
      b = circle1.intersects(otherCircle);
      assertTrue(b==false);
   }
}

