import java.util.*;

public class VectorDemo {

   public static void main(String args[]) {

      Vector<String> vec = new Vector<String>(2);

      vec.addElement("R");
      vec.addElement("Q");
      vec.addElement("M");
      vec.addElement("F");

      System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());

      vec.addElement("alphabate1");
      vec.addElement("alphabate2");
      vec.addElement("alphabate3");

      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());

      Enumeration en = vec.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }
}