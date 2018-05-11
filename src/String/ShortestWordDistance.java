package String;

/**
 * Given a list of words and two words word1 and word2, return the 
 * shortest distance between these two words in the list.
 * 
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * 
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * 
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 
 * are both in the list.
 */

public class ShortestWordDistance {
	public static int shortestWordDistance(String[] words, String word1, String word2){
		int indexOfWord1 = 0, indexOfWord2 = 0;
		int shortestDistance = 0;
		for (int i =0; i <words.length;i++){
			if (words[i] == word1){
				indexOfWord1 = i + 1;
			}
		}
		for (int j =0; j <words.length;j++){
			if (words[j] == word2){
				indexOfWord2 = j + 1;
			}
		}
		if (indexOfWord2 > indexOfWord1){
			shortestDistance = indexOfWord2 - indexOfWord1;
		} else {
			shortestDistance = indexOfWord1 - indexOfWord2;
		}
		return shortestDistance;
	}
	public static void main(String[] args){
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "coding";
		String word2 = "practice";
		System.out.println(shortestWordDistance(words, word1, word2));
		
		String[] words_1 = {"practice", "makes", "perfect", "coding", "makes"};
		String word_1 = "makes";
		String word_2 = "coding";
		System.out.println(shortestWordDistance(words_1, word_1, word_2));
	}
}
