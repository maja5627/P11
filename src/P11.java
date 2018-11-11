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
	// Helper
	// Recursive function that will call itself until base case is reached
	// convertNum
	// atIndex = 0
	// value = 0
	// tempString = 0 
	//convertNum(num,atIndex +=1 ,lastIndex,tempString)
	// atIndex = 1
	// value = 1 
	//tempString = 01
	// convertNum(num,atIndex +=1 ,lastIndex,tempString)
	// convertNum(num,atIndex +=1 ,lastIndex,tempString)
	//convertNum(num,atIndex +=1 ,lastIndex,tempString)
	// lastIndex == atIndex 
	// 
	// [0,1,2,3,4] 
	
	private String convertNum(int[] num, int atIndex, int lastIndex, String result) {
	    
	    String tempString = result + String.valueOf(num[atIndex]);
	    
	    if(atIndex == lastIndex) {
	        return tempString;
	    }else {
	        return convertNum(num,atIndex +=1 ,lastIndex,tempString);
	    }
	   
	}
	
	// Helper
	// [1,2,3,4,5,7]
	// [2,1,3,4,5,6]
	
	// 1,2,3,4,5 

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<String> intersectionHelper(ArrayList<String> AL1, ArrayList<String> AL2,int currentIndex,ArrayList<String> intersection){
	    String currentValue = AL1.get(currentIndex);
	    if(AL1.size() == currentIndex) {
	        
	    }
	    if(AL2.contains(currentValue)){
	        intersection.add(currentValue);
	    }
	    return null;
	}

}
