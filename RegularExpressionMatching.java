//Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
//
//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.
//The matching should cover the entire input string (not partial).
//
//Note:
//
//s could be empty and contains only lowercase letters a-z.
//p could be empty and contains only lowercase letters a-z, and characters like . or *.
public class RegularExpressionMatching {

	public static boolean isMatch(String text, String pattern) {
		if (pattern.isEmpty())
			return text.isEmpty();
		boolean firstMatch = !text.isEmpty() && ((text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.'));
		if (pattern.length() >= 2 && pattern.charAt(1) == '*')
			return (firstMatch && isMatch(text.substring(1), pattern)) || isMatch(text, pattern.substring(2));
		else
			return (firstMatch && isMatch(text.substring(1), pattern.substring(1)));

	}

	public static void main(String[] args) {
		String text = "aab";
		String pattern = "c*a*b";
		System.out.println(isMatch(text, pattern));
	}
}
