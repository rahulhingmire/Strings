package string;

public class Anagramopt {
	public static void main(String[] args) {
		String a="aab";
		String b="aba";
		String d = a.toLowerCase();
		String e= b.toLowerCase();
		boolean isAnagram=true;
		int al[]=new int[256];
		
		for(char c:d.toCharArray()) {
			int index=(int) c;
			al[index]++;
		  }
		for(char c:e.toCharArray()) {
			int index=(int) c;
			al[index]--;
		  }
		for(int i=0;i<256;i++) {
		if(al[i]!=0){
			isAnagram=false;
			break;
		}
		}
		if(isAnagram) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");
		}
				

}
}
