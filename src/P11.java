import java.util.ArrayList;

public class P11 implements IP11 {

	@Override
	public void printPattern(int n) {
		// TODO Auto-generated method stub
	    
	    //Precondition: n>0
	    //Postcondition: print a pattern of n+1 lines ( 0 to n ):
	    //line i (i = 0 to n) has i stars ("*"), followed by (n-i) stripes ("-")
//	    if(n > 0) {
//	        System.out.print("");
//	        printPattern(n)
	        //    if current is 1, print 1 and return. //base case
//
//	    }
	  

	}
   

	@Override
	public int convertNum(int[] num) {
	    
		return Integer.valueOf(convertNum(num, 0, num.length - 1, ""));
	}
	
	private String convertNum(int[] num, int atIndex, int lastIndex, String result) {
	    
	    String tempString = result + String.valueOf(num[atIndex]);
	    if(atIndex == lastIndex) {
	        return tempString;
	    }else {
	        return convertNum(num,atIndex +=1 ,lastIndex,tempString);
	    }
	   
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		// TODO Auto-generated method stub
		return null;
	}

}
