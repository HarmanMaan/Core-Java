package java_Interview_2;

public class Anagrams_Strings {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "avaj";

		System.out.println(check_anagrams(str1, str2));

	}

	public static boolean check_anagrams(String str1, String str2) {

		char[] str1Ar = str1.toCharArray();

		StringBuilder sb = new StringBuilder(str2);

		for (char c : str1Ar) {

			int index = sb.indexOf(String.valueOf(c));

			if (index != -1) {

				sb.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return sb.length() == 0;
	}

}
