// AP CS Exam 2017 - Free Response - Phrase Manipulation
public class Phrase
{
	private String currentPhrase;

	/** Constructs a new Phrase object. */
	public Phrase(String p)
	{
		currentPhrase = p;
	}

	@SuppressWarnings("unused")
	private Phrase()
	{
		/* prevent uninitialized objects */
	}

	/*
	 * Returns the index of the nth occurrence of str in the current phrase;
	 * 
	 * returns -1 if the nth occurrence does not exist.
	 * 
	 * Precondition: str.length() > 0 and n > 0
	 * 
	 * Postcondition: the current phrase is not modified.
	 */
	public int findNthOccurrence(String str, int n)
	{
		int pos = currentPhrase.indexOf(str);
		// while there are more occurrences to look for
		while (--n > 0 && pos != -1)
		{
			// search from where we left off the last time
			pos = currentPhrase.indexOf(str, pos + 1);
		}
		return pos;
	}

	/*
	 * Modifies the current phrase by replacing the nth occurrence of str with repl.
	 * 
	 * If the nth occurrence does not exist, the current phrase is unchanged.
	 * 
	 * Precondition: str.length() > 0 and n > 0
	 */
	public void replaceNthOccurrence(String str, int n, String repl)
	{
		// use helper method to look for the location we're interested in
		int loc = findNthOccurrence(str, n);

		// if we found what we were looking for
		if (loc != -1)
		{
			// everything BEFORE the found location + replacement + everything AFTER the found location
			currentPhrase = currentPhrase.substring(0, loc) + repl + currentPhrase.substring(loc + str.length());
		}

	}

	public String toString()
	{
		return currentPhrase;
	}

}
