import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=sc.nextLine();
		str=str.replaceAll("","").toLowerCase();
		String s="";
		for(char i='a';i<='z';i++){
			if(str.indexOf(i)!=-1){
				s=s+i;
			}
		}				
		if(s.length()==26){
			System.out.println("it,s a Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
	}

}
