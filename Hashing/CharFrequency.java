<<<<<<< HEAD
package Hashing;
import java.util.*;
public class CharFrequency {
	
	public static void main(String[]args) {
		String s = new String("HelloHello");
		int n = s.length();
		s = s.toLowerCase();
		char[] s1 = new char[n];
		s1 = s.toCharArray();
		
		int[] hash = new int[25];
		for(int i=0;i<s1.length;i++) {
			hash[s1[i]-'a']++;
		}
		System.out.println("enter char");
		Scanner sc = new Scanner(System.in);
		char h = sc.next().charAt(0);
		System.out.println(hash[h-'a']);
		sc.close();
	}
}	
=======
package Hashing;
import java.util.*;
public class CharFrequency {
	
	public static void main(String[]args) {
		String s = new String("HelloHello");
		int n = s.length();
		s = s.toLowerCase();
		char[] s1 = new char[n];
		s1 = s.toCharArray();
		
		int[] hash = new int[25];
		for(int i=0;i<s1.length;i++) {
			hash[s1[i]-'a']++;
		}
		System.out.println("enter char");
		Scanner sc = new Scanner(System.in);
		char h = sc.next().charAt(0);
		System.out.println(hash[h-'a']);
		sc.close();
	}
}	
>>>>>>> 82cb8b4d335fa3969bfff93c48ea6c1f9cd593ae
