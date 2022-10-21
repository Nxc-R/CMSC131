package programs;

/**
 * This class represents a person's passport. It has three instance variables
 * representing the first, last and middle name (all are String variables). A
 * character instance variable representing a separator (to be used for
 * formatting purposes) is also part of the class. In addition, the class has a
 * StringBuffer instance variable that represents the passport stamps the person
 * has received.
 * 
 * For this class you need to define and use a private method called
 * validateAndFormat that takes a character as a parameter.
 * 
 * The class will keep track of the number of instances created by using a
 * private static field called objectCount.
 * 
 * @author cmsc131
 *
 */
public class Passport {
	private String firstname, middlename, lastname;
	private char separator;
	private static int objectCount = 0;
	private StringBuffer stamps;

	/**
	 * Initializes the object based on the provided parameters. It uses a comma as
	 * default separator. Each name (first, middle and last) will be verified using
	 * the method validateAndFormat. If any of the names (first, middle or last) is
	 * null according to validateAndFormat, the method will return and perform no
	 * further initialization. For the middle name, before calling
	 * validateAndFormat, you need to check whether the string is blank (using the
	 * String method isBlank()). If the string is blank, that means the person has
	 * no middle name. If the string is blank, the validateAndFormat method will not
	 * be called and the middle name will be set to the empty string. The
	 * constructor will initialize the stamps instance variable with a StringBuffer
	 * object and will increase the number of objects (objectCount instance
	 * variable) that have been created. The format of the first, last and middle
	 * name will be defined by the validateAndFormat method.
	 * 
	 * @param firstname Person's first name.
	 * @param middlename Person's middle name.
	 * @param lastname Person's last name.
	 */
	public Passport(String firstname, String middlename, String lastname) {
		stamps = new StringBuffer();
		this.separator = ',';
		if(middlename.isBlank()) {
			this.middlename = "";
			if (Passport.validateAndFormat(firstname) == null || Passport.validateAndFormat(lastname) == null) {
				return;
			}
			else {
				this.firstname = Passport.validateAndFormat(firstname);
				this.lastname = Passport.validateAndFormat(lastname);
			}
		}
		else {
			if (Passport.validateAndFormat(firstname) == null || Passport.validateAndFormat(middlename) == null || Passport.validateAndFormat(lastname) == null) {
				return;
			}
			else {
				this.firstname = Passport.validateAndFormat(firstname);
				this.middlename = Passport.validateAndFormat(middlename);
				this.lastname = Passport.validateAndFormat(lastname);
			}
		}
		objectCount++;
		
	}

	/**
	 * Generates a string with the last name, first name and middle name (if exist)
	 * separated by the separator character (no spaces in between).
	 * 
	 * @return string with name components separated by commas.
	 */
	public String toString() {
		if (this.middlename.isBlank()) {
			return this.lastname  + this.separator + this.firstname;
		}
		return this.lastname + this.separator + this.firstname + this.separator + this.middlename;
	}

	/**
	 * Initializes the first name and last name with the parameter values. The
	 * middle name will be the empty string and the separator will be a comma. To
	 * implement this method you must call the constructor with three parameters;
	 * use "this" to call the constructor.
	 * 
	 * @param firstname Person's first name.
	 * @param lastname Person's last name.
	 */
	public Passport(String firstname, String lastname) {
		this(firstname, "", lastname);
	}

	/**
	 * Initializes a Passport object with "SAMPLEFIRSTNAME", "SAMPLEMIDDLENAME",
	 * "SAMPLELASTNAME" as first name, middle name and last name, respectively. The
	 * separator will be a comma. Implement this method by calling the constructor
	 * that constructor with three parameters; use "this" to call the constructor.
	 */
	public Passport() {
		this("SAMPLEFIRSTNAME", "SAMPLEMIDDLENAME","SAMPLELASTNAME");
	}

	/**
	 * Adds a stamp by appending the string to the StringBuffer instance variable.
	 * If the parameter is null or is blank (according to the String method
	 * isBlank()) no stamp will be added. The method will always return a reference
	 * to the current object.
	 * 
	 * @param stamp Passport stamp.
	 * @return Current object reference.
	 */
	public Passport addStamp(String stamp) {
		if (!stamp.isBlank() || stamps != null) {
			stamps.append(stamp);
		}
		return this;
	}

	/**
	 * Returns a copy (copy, not original) of the stamps instance variable.
	 * 
	 * @return A copy of the stamp StringBuffer object.
	 */
	public StringBuffer getStamps() {
		StringBuffer copy = new StringBuffer(stamps);
		return copy;
	}

	/**
	 * Get method for separator
	 * 
	 * @return A the separator character.
	 */
	public char getSeparator() {
		return separator;
	}

	/**
	 * Set method for separator. If an invalid character is provided, the separator
	 * will not be changed. A character is considered invalid if it is a '@'
	 * character, or a space character (according to the Character.isSpaceChar()
	 * method) or a letter character (according to the Character.isLetter() method).
	 * The method will return true if the separator was changed, otherwise false.
	 * 
	 * @param separator Separator for name components.
	 * @return True if separator changed and false otherwise.
	 */
	public boolean setSeparator(char separator) {
		boolean changed;
		if (separator == '@' || Character.isSpaceChar(separator) || Character.isLetter(separator)) {
			changed = false;
		}
		else {
			this.separator = separator;
			changed = true;
		}
		return changed;
	}

	/**
	 * To Passport objects are equal if they have the same first name, last name and
	 * middle name (ignore the separator). You must use the equals method described
	 * in lecture and not the automatically generated by Eclipse. The method must
	 * have Object as a parameter (and NOT Passport), otherwise you will lose
	 * credit.
	 * 
	 * @param obj Object parameter.
	 * @return True if the parameter and the current object are equal and false otherwise.
	 */
	public boolean equals(Object obj) {
		Passport p = (Passport)obj;
		if ((firstname.equals(p.firstname) == true) && (lastname.equals(p.lastname) == true) && (middlename.equals(p.middlename) == true)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * It will compare the names that are part of a Passport objects. We can use
	 * this method to sort Passport in alphabetical order (based on their names).
	 * 
	 * The method will return a negative value if the current object precedes the
	 * parameter in alphabetical order, 0 if the current object and the parameter
	 * have the same name, and a positive value if current object follows the
	 * parameter in alphabetical order. The method will first compare last names,
	 * then first names and finally middle names. You must use the String compareTo
	 * method to compare corresponding first, last and middle names.  Ignore the
	 * separator during the comparison process.
	 * 
	 * @param passport Passport object reference.
	 * @return Negative, 0 or positive integer value.
	 */
	public int compareTo(Passport passport) {
		return this.lastname.compareTo(passport.lastname) + 
				this.firstname.compareTo(passport.firstname) + 
				this.middlename.compareTo(passport.middlename);
	}

	/**
	 * Returns the number of Passport objects created.
	 * 
	 * @return Number of Passport objects created.
	 */
	public static int getNumberOfPassportObjects() {
		return objectCount;
	}

	/**
	 * Sets to 0 the number of Passport objects that have been created.
	 * 
	 */
	public static void resetNumberOfPassportObjects() {
		objectCount = 0;
	}

	/**
	 * Returns a new Passport object where the first name, last name and middle name
	 * have been capitalized if the uppercase parameter is true; otherwise all the
	 * values will be in lowercase. The new object will have the same separator
	 * as the original object. If the passport paramneter is null, the method
	 * will return null and perform no processing.
	 * 
	 * @param passport Passport reference.
	 * @param uppercase If true turn to uppercase; otherwise lowercase.
	 * @return Normalized object.
	 */
	public static Passport normalize(Passport passport, boolean uppercase) {
		String fname, mname, lname;
		if (passport == null) {
			return null;
		}
		if (uppercase == true) {
			fname = passport.firstname.toUpperCase();
			mname = passport.middlename.toUpperCase();
			lname = passport.lastname.toUpperCase();
			passport.setNames(fname, mname, lname);
		}
		else {
			fname = passport.firstname.toLowerCase();
			mname = passport.middlename.toLowerCase();
			lname = passport.lastname.toLowerCase();			
			passport.setNames(fname, mname, lname);		
		}
		return passport;
	}

	/**
	 * The lastname will be changed if it is valid according to
	 * the validateAndFormat method; otherwise no change will take place.
	 * The format of the lastname will be defined by validateAndFormat method.
	 * @param lastname Person's last name.
	 * @return True if changed occurred; false otherwise.
	 */
	public boolean changeLastname(String lastname) {
		boolean changed;
		if (Passport.validateAndFormat(lastname) == null) {
			changed = false;
		}
		else {
			this.lastname = lastname;
			changed = true;
		}
		return changed;
	}

	/**
	 * This method will generate and return a formatted string in lowercase 
	 * with the first character in uppercase. The parameter is valid if it is 
	 * not null and it is not blank according to the string method isBlank().  
	 * If the parameter is invalid, the method will return null and perform 
	 * no further processing.  If the parameter is valid, spaces surrounding 
	 * the parameter will be removed, the string will be converted to lowercase, 
	 * and the first character of the string (after spaces have been removed) 
	 * will be in upper case.  The following methods can be helpful during 
	 * the implementation of this method: Character.toUpperCase, and the 
	 * string methods charAt and substring.
	 * 
	 * You can test this method by initially defining public; once you have
	 * tested it, make it private. 
	 * 
	 * @param name String representing either first, middle or last name.
	 * @return null or formatted name.
	 */
	private static String validateAndFormat(String name) {
		String trim, valid2;
		char valid;
		if (name == null || name.isBlank()) {
			return null;
		}
		else {
		trim = name.trim();
		valid = trim.charAt(0);
		valid2 = Character.toUpperCase(valid) + trim.substring(1).toLowerCase();
		}
		return valid2;
	}
	private void setNames(String fname, String mname, String lname) {
		this.firstname = fname;
		this.middlename = mname;
		this.lastname = lname;
	}
}