package String;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Implement_strStr {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;

		int hp = 0, np = 0, fo = -1, hl = haystack.length(), nl = needle.length();
		if (nl > hl)
			return -1;

		if (nl == 0)
			return 0;

		while (np < nl && hp < hl) {
			if (haystack.charAt(hp) == needle.charAt(np)) {
				fo = fo == -1 ? hp : fo;
				np++;
				hp++;
			} else {
				np = 0;
				hp = fo == -1 ? hp + 1 : fo + 1;
				fo = -1;
			}
		}
		return np == nl ? fo : -1;
	}
	
	public int strStr_2(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;

		int hp = 0, np = 0, fo = -1, hl = haystack.length(), nl = needle.length();
		if (nl > hl)
			return -1;

		if (nl == 0)
			return 0;

		while (np < nl && hp < hl) {
			if (haystack.charAt(hp) == needle.charAt(np)) {
				//fo = fo == -1 ? hp : fo;
				if (fo == -1){
					fo = hp;
				}
				np++;
				hp++;
			} else {
				np = 0;
				//hp = fo == -1 ? hp + 1 : fo + 1;
				if (fo == -1){
					hp = hp + 1;
				}else {
					hp = fo + 1;
				}
				fo = -1;
			}
		}
		return np == nl ? fo : -1;
	}

	@Test
	public void test() {
		assertTrue("Test1", strStr("", "") == 0);
		assertTrue("Test1", strStr("vishalaab", "shal") == 2);
		assertTrue("Test2", strStr("vishalaab", "blah") == -1);
		assertTrue("Test2", strStr("mississippi", "issip") == 4);
		
		assertTrue("Test1", strStr_2("", "") == 0);
		assertTrue("Test1", strStr_2("vishalaab", "shal") == 2);
		assertTrue("Test2", strStr_2("vishalaab", "blah") == -1);
		assertTrue("Test2", strStr_2("mississippi", "issip") == 4);
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Implement_strStr.class);
		System.out.println("All Tests passed : " + result.wasSuccessful());
		for (Failure failure : result.getFailures()) {
			System.out.println("Failed Test cases" + failure.toString());
		}
	}
}
