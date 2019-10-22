public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   private double average(int first, int last)
   {
       int sum = 0;
       
      for(int i = first; i<last+1; i++){ 
          sum+=scores[i];
        }
        int average = sum/(last-first+1);
        return average;
       //here so the class compiles
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {
      boolean flag = false;
      int max = scores[0];
      
     
      for (int i = 0; i<scores.length; i++){
          if (scores[i]>=max){
              max=scores[i]
        }
        
       return flag; //here so the class compiles
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      return 0; //here so the class compiles
   } 
}