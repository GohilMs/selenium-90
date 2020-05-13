package daily90;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="malayalam";
String rev="";
for (int i = str.length()-1; i >=0; i--) {
	rev +=str.charAt(i);
	
}
System.out.println(str.equals(rev)?"Yes,Palindrome":"No,Not a Palindrome");

	}

}
