
public class PrintDuplicates {

	public static void main(String[] args) {
		String s="hellowrold";
		char[] ch=s.toCharArray();
		System.out.println("Duplicate characters in string");
		 for (int i=0;i<ch.length;i++) 
		 {
			 for(int j = i+1;j<ch.length;j++) 
			 {
				if(ch[i]==ch[j]) 
				{
					System.out.print(ch[i]+" ");
				} 
				
			 }
		 }	

	}

}
