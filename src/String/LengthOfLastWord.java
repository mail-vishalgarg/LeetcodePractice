package String;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		System.out.println("Last Index of space:" + s.trim().lastIndexOf(" "));
		System.out.println("Length of string: " + s.trim().length());
		return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
	}

	@Test
	public void test() {
		assertTrue("Test1", lengthOfLastWord("Hello World") == 5);
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(LengthOfLastWord.class);
		System.out.println("All Tests passed : " + result.wasSuccessful());
		for (Failure failure : result.getFailures()) {
			System.out.println("Failed Test cases" + failure.toString());
		}
	}
}
