package sysImplementation;

import java.util.ArrayList;

public class Utilities {

	public static String addDelimiter(String str, char delimeter) {
		String returnVal = new String();
		if (str.length() > 1) {
			returnVal+= str.charAt(0) + (delimeter + addDelimiter(str.substring(1), delimeter));
		} else {
			returnVal+= str.charAt(0);
		}
		return returnVal;
	}

	public static String getDigits(String str) {
		String returnVal = new String();
		if (str.length() == 0) {
			return "";
		}else if (Character.isDigit(str.charAt(0))) {
			returnVal += str.charAt(0) + getDigits(str.substring(1));
		} else  {
			returnVal+= getDigits(str.substring(1));
		}
		
		return returnVal;
	}

	public static void replaceCharacter(char[] array, char target, char replacement) {
		replaceCharacterAuxiliary(array, 0, target, replacement);
	}

	public static int getSumEven(int[] array) {
		return getSumEvenAuxiliary(array, 0);
	}

	public static ArrayList<Integer> getListRowIndices(int[][] array, int rowLength) {
		ArrayList<Integer> returnArr = new ArrayList<Integer>();
		getListRowIndicesAuxiliary(returnArr, array, rowLength, 0);
		return returnArr;
	}

	public static int replaceCells(char[][] array, int x, int y, char target, char replacement) {
		int returnVal = 0;
		if (isValid(array, x, y) && x >= 0) {
			if (array[x][y] == target) {
				array[x][y] = replacement;
				if (x - 1 >= 0) {
					replaceCells(array, x - 1, y, target, replacement);		
				}
				if (x + 1 < array.length) {
					replaceCells(array, x + 1, y, target, replacement);
				}
				if (y + 1 < array[x].length) {
					replaceCells(array, x, y + 1, target, replacement);
				}
				if (y - 1 < array[x].length) {
					replaceCells(array, x, y - 1, target, replacement);
				}
				if (x + 1 < array.length) {
					replaceCells(array, x + 1, y + 1, target, replacement);
				}
				if (x - 1 >= 0) {
					replaceCells(array, x - 1, y - 1, target, replacement);
				} 
				if (x - 1 >= 0) {
					replaceCells(array, x - 1, y + 1, target, replacement);
				} 
				if (x + 1 < array.length) {
					replaceCells(array, x + 1, y - 1, target, replacement);
				} 
				return returnVal + 1;
			} else {
				//return returnVal;
			}
			
		} else {
			//return returnVal;
		}
		return returnVal;
	}
	
	
	private static void replaceCharacterAuxiliary(char[] array, int index, char target, char replacement) {
		if (index > array.length - 1) {
			return;
		} else if (array[index] == target) {
			array[index] = replacement;
			replaceCharacterAuxiliary(array, index + 1, target, replacement);
		} else {
			replaceCharacterAuxiliary(array, index + 1, target, replacement);
		}
	}
	
	private static int getSumEvenAuxiliary(int[] array, int index) {
		if (index > array.length - 1) {
			return 0;
		} else if (array[index] % 2 == 0) {
			return array[index] + getSumEvenAuxiliary(array, index + 1);
		} else {
			return getSumEvenAuxiliary(array, index + 1);
		}
	}
	private static void getListRowIndicesAuxiliary(ArrayList<Integer> arrayList, int[][] array, int rowLength, int index) {
		if (index > array.length - 1) {
		} else if (array[index].length == rowLength) {
			arrayList.add(index);
			getListRowIndicesAuxiliary(arrayList, array, rowLength, index + 1);
		} else {
			getListRowIndicesAuxiliary(arrayList, array, rowLength, index + 1);
		}
	}
	private static boolean isValid(char[][] array, int x , int y) {
		if (x > array.length - 1) {
			return false;
		} else if (y > array[x].length - 1) {
			return false;
		} else {
			return true;
		}
	}
}
