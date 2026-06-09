

public class StringOptimizer
{
	public static void main(String[] args) {
		
		String s = "aabbbccdaaeeffbb";
		String output="";
		int count=1;
		
		System.out.println(s.length());
		
		for(int i=1;i<s.length();i++){
		    
		    if( s.charAt(i) == s.charAt(i-1)){
		        count++;
		    }else{
		        output=output+s.charAt(i-1)+count;
		        count=1;
		    }
		    
		}
		
		output=output+s.charAt(s.length()-1)+count;
		
		System.out.println(output); // Output: a2b3c2d1a2e2f2b2
	}
}