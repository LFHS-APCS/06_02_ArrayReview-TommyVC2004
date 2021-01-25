public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] employees)
    {
      String allEmps = "";
      for (int i = 0; i < employees.length; i++) {
        if (employees[i].getYears() > 20)
          allEmps += employees[i].getName() + " ";
      }
        return allEmps;
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
      double count = 0;
      int positives = 0;
      for (double val : nums) {
        if (val >= 0) {
          count += val;
          positives++;
        }
      }
      if (positives != 0)
        return (count / positives);
      else
        return 0;
    }
}
