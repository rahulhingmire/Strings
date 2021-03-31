package string;

public class anagram2 {
	public static void main(String[] args) {
		String a="aab";
		String b="aba";
		boolean visited[]=new boolean[b.length()];
		int n=a.length();
		boolean isAnagram=false;
		if(a.length()==b.length()) {
			for(int i=0;i<n;i++) {
				char c=a.charAt(i);
				isAnagram=false;
			for(int j=0;j<n;j++) {
				if(b.charAt(j)==c && !visited[j]) {
					visited[j]=true;
					isAnagram=true;
					break;
				}
				
			}
			if(!isAnagram) {
				break;
			}
		}
		}
		if(isAnagram) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");
		}
	}
	

}
