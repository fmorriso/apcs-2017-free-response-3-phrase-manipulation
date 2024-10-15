// AP CS Exam 2017 - Free Response #3 - Phrase Manipulation

public class Driver
{

	public static void main(String[] args)
	{
		System.out.format("Java version: %s%n", getJavaVersion());
		// 1
		// 012345678901234
		String p = "A cat ate late.";
		String searchFor = "at";
		String replace = "rane";
	
		runTest(p, 1, searchFor, replace);  // A crane ate late
		
		replace = "xx";
		runTest(p, 6, searchFor, replace); // A cat ate late
		
		// phrase3.replaceNthOccurrence("bat", 2, "xx"); 
		searchFor = "bat";
		runTest(p, 6, searchFor, replace); // A cat ate late
		
		// replaceNthOccurrence("aa", 1, "xx"); 
		p = "aaaa";
		searchFor = "aa";
		replace = "xx";
		runTest(p, 1, searchFor, replace); // xxaa
		


	}

	private static void runTest(String original, int n, String find, String replace) {
		Phrase p = new Phrase(original);
		System.out.format("Original phrase='%s'%n", original.toString());
		System.out.format("\tn=%d, find=%s, replace=%s %n", n, find, replace);
		p.replaceNthOccurrence(find, n, replace);
		System.out.format("\tModified phrase='%s'%n", p.toString());
	}

	/** get the java version that is running the current program
	 * @return string containing the java version running the current program
	 */
	private static String getJavaVersion()
	{
		Runtime.Version rtv = Runtime.version();
		return String.format("%s.%s.%s.%s", rtv.feature(), rtv.interim(), rtv.update(), rtv.patch());
	}

}
