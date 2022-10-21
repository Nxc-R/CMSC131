package programs;

public class Utilities {
	/**
	 * Returns a string where each array entry (except the last one) is followed by
	 * the specified separator. An empty string will be returned if the array has no
	 * elements. An IllegalArgumentException (with any message) will be thrown when
	 * the array parameter is null.
	 * 
	 * @param array
	 * @param separator
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @return string
	 */
	public static String getArrayString(int[] array, char separator) {
		String returnVal = new String();
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else if (array.length == 0) {
			return returnVal;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (i < array.length - 1) {
					returnVal += array[i]; 
					returnVal += separator;
				} else {
					returnVal += array[i];
				}
			}
			return returnVal;
		}
	}

	/**
	 * Returns the number of values that are in the range defined by lowerLimit
	 * (inclusive) and upperLimit (inclusive). An IllegalArgumentException (with any
	 * message) will be thrown when the array parameter is null or if lowerLimit is
	 * greater than upperLimit.
	 * 
	 * @param array
	 * @param lowerLimit
	 * @param upperLimit
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @throws IllegalArgumentException When lowerLimit is greater than upperLimit.
	 * @return number of values in range
	 */
	public static int getInstances(int[] array, int lowerLimit, int upperLimit) {
		int count = 0;
		if (array == null || lowerLimit > upperLimit) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] >= lowerLimit && array[i] <= upperLimit) {
					count++;
				}
			}
			return count;
		}
	}

	/**
	 * Returns a new array with values in the array that exists in the range defined
	 * by lowerLimit (inclusive) and upperLimit (inclusive). An
	 * IllegalArgumentException (with any message) will be thrown when the array
	 * parameter is null or if lowerLimit is greater than upperLimit.
	 * 
	 * @param array
	 * @param lowerLimit
	 * @param upperLimit
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @throws IllegalArgumentException When lowerLimit is greater than upperLimit.
	 * @return array with values in range.
	 */
	public static int[] filter(int[] array, int lowerLimit, int upperLimit) {
		int[] arrFiltered;
		int count = 0;
		if (array == null || lowerLimit > upperLimit) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			arrFiltered = new int[Utilities.getInstances(array, lowerLimit, upperLimit)];
			for (int i = 0; i < array.length; i++) {
				if (array[i] >= lowerLimit && array[i] <= upperLimit) {
					arrFiltered[count] = array[i];
					count++;
				}
			}
			return arrFiltered;
		}
	}

	/**
	 * Rotates the provided array left if leftRotation is true; right otherwise. The
	 * number of positions to rotate is determined by the positions parameter. For
	 * example, rotating the array 10, 20, 7, 8 two positions to the left will
	 * update the array to 7, 8, 10, 20. Only arrays with 2 or more elements will be
	 * rotated, therefore no rotation will take place for an array of size 1 or 0.
	 * An IllegalArgumentException (with any message) will be thrown when the array
	 * parameter is null or positions is a negative value.
	 * 
	 * Hint: adding private methods that rotate an array one position to the left
	 * and one position to the right can help.
	 * 
	 * @param array
	 * @param leftRotation
	 * @param positions
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @throws IllegalArgumentException When positions is negative.
	 */
	public static void rotate(int[] array, boolean leftRotation, int positions) {
		if (array == null || positions < 0) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			if (leftRotation == true) {
				int count = 0;
				while (count < positions) {
					leftRotateOnce(array);
					count++;
				}
				
			} else {
				int count2 = 0;
				while (count2 < positions) {
					rightRotateOnce(array);
					count2++;
				}
			}
		}
	}

	/**
	 * Returns a StringBuffer array with COPIES of StringBuffer objects present in
	 * the array parameter with a length greater than the length parameter. If no
	 * StringBuffer object is found an empty array will be returned. An
	 * IllegalArgumentException (with any message) will be thrown when the array
	 * parameter is null.
	 * 
	 * @param array
	 * @param length
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @return
	 */
	public static StringBuffer[] getArrayStringsLongerThan(StringBuffer[] array, int length) {
		StringBuffer[] copy;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			int count = 0;
			copy = new StringBuffer[getStringBufferArrayLength(array, length)];
			for (int i = 0; i < array.length; i++) {
				if (array[i].length() > length) {
					copy[count] = new StringBuffer(array[i]);
					count++;
				}
			}
		}
		return copy;
	}

	/**
	 * Returns the number of instances of the value parameter (if any) in the array.
	 * An IllegalArgumentException (with any message) will be thrown when the array
	 * parameter is null.
	 * 
	 * @paran value
	 * @param array
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @return
	 */
	public static int countInstancesOf(int value, int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			return getInstances(array, value, value);
		}
	}

	/**
	 * Returns true if the array has exactly 2 instances of any value. For example,
	 * 4, 5, 89, 5, 7 has 2 instances of 5. There could be more than one value with
	 * 2 instances. An IllegalArgumentException (with any message) will be thrown
	 * when the array parameter is null.
	 * 
	 * @param array
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @return True if two instances found; false otherwise.
	 */
	public static boolean hasTwoInstancesOfAnyValue(int[] array) {
		boolean twoInstance = false;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			for (int i = 0;i < array.length;i++) {
				if (countInstancesOf(array[i], array) == 2) {
					twoInstance = true;
				}
			}
		}
		return twoInstance;
	}

	/**
	 * Returns true if the array has at least two pairs of numbers where each pair
	 * has the same values and the number in a pair does not appear in any other
	 * pair. For example, 6, 8, 6, 3, 2, 3, 8, 1, 8, 8 has the pairs (6, 6), (3, 3).
	 * For the numbers 3, 3, 3, 3, 3, 3 there are no pairs. An
	 * IllegalArgumentException (with any message) will be thrown when the array
	 * parameter is null.
	 * 
	 * @param array
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @return True if at least two pairs found; false otherwise.
	 */
	public static boolean hasTwoPairsOfDifferentValues(int[] array) {
		boolean twoPairs = false;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			int count = 0;
			for (int i = 0;i < array.length;i++) {
				if (countInstancesOf(array[i], array) == 2) {
					count++;
				}
			}
			if (count >= 4) {
				twoPairs = true;
			}
		}
		return twoPairs;
	}

	/**
	 * Determines whether elements of an array are increasing. By definition an
	 * array of 0 or 1 elements is increasing. For example, the array -40, 30, 30,
	 * 50 is increasing; the array 10, 5, 20 is not increasing. An
	 * IllegalArgumentException (with any message) will be thrown when the array
	 * parameter is null.
	 * 
	 * @param array
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @return True if increasing; false otherwise.
	 */
	public static boolean isIncreasing(int[] array) {
		boolean increasingOrNot = false;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			int count = 0;
			for (int i = 0;i < array.length;i++) {
				if (i < array.length - 1) {
					if (array[i] <= array[i + 1]) {
						count++;
					} 
				} else {
					if (array[i] >= array[i - 1]) {
						count++;
					}
				}
			}
			if (count == array.length) {
				increasingOrNot = true;
			}
		}
		return increasingOrNot;
	}

	/**
	 * Returns an array with the indices of even values in the array parameter, if
	 * the even parameter is true; otherwise the array will have indices of odd
	 * values in the array parameter. For example, for the array 10, 5, 8, 19, the
	 * method will return an array of size 2 with the values 0, 2. The returned
	 * array must have a size that corresponds to the number of even or odd values
	 * present in the array parameter. An IllegalArgumentException (with any
	 * message) will be thrown when the array parameter is null.
	 * 
	 * @param array
	 * @throws IllegalArgumentException When a null array parameter is provided.
	 * @param array
	 * @param even
	 * @return
	 */
	public static int[] getIndices(int[] array, boolean even) {
		int[] copy;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			int count = 0;
			if (even == true) {
				copy = new int[getEvenLength(array)];
				for (int i = 0;i < array.length;i++) {
					if (array[i] % 2 == 0) {
						copy[count] = i;
						count++;
					}
				}
			}
			else {
				copy = new int[getOddLength(array)];
				for (int i = 0;i < array.length;i++) {
					if (array[i] % 2 != 0) {
						copy[count] = i;
						count++;
					}
				}
			}
		}
		return copy;
	}

	private static int getStringBufferArrayLength(StringBuffer[] array, int length) {
		int indexes = 0;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i].length() > length) {
					indexes++;
				}
			}
		}
		return indexes;
	}
	
	private static int getEvenLength (int[] array) {
		int indexes = 0;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			for (int i = 0;i < array.length;i++) {
				if (array[i] % 2 == 0) {
					indexes++;
				}
			}
		}
		return indexes;
	}
	
	private static int getOddLength (int[] array) {
		int indexes = 0;
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			for (int i = 0;i < array.length;i++) {
				if (array[i] % 2 != 0) {
					indexes++;
				}
			}
		}
		return indexes;
	}

	private static void leftRotateOnce(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			int placeHolder = array[0];
			for (int i = 0; i < array.length; i++) {
				if (i < array.length - 1) {
					array[i] = array[i + 1];
				} else {
					array[i] = placeHolder;
				}
			}

		}
	}
	private static void rightRotateOnce(int[] array) {
		if (array == null) {
			throw new IllegalArgumentException("Invalid parameters");
		} else {
			int placeHolder = array[array.length - 1];
			for (int i = array.length - 1; i >= 0; i--) {
				if (i > 0) {
					array[i] = array[i - 1];
				} else {
					array[0] = placeHolder;
				}
			}

		}
	}
}