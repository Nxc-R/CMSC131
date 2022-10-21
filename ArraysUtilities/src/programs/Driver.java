package programs;

public class Driver {

	public static void main(String[] args) {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int[] ta = new int[] {10, 5, 8, 19};
		int[] argh = new int[] {-40, 30, 30,50, 50};
		int [] testArr2 = new int [] {10, 30, 7, 5, 9, 60, -1};
		System.out.println(Utilities.getArrayString(testArr, ','));
		System.out.println(Utilities.getInstances(testArr2, 7, 30));
		System.out.println(Utilities.getArrayString(Utilities.filter(testArr2, 7, 30), ','));
		System.out.println(Utilities.getArrayString(testArr, ','));
		Utilities.rotate(testArr, false, 2);
		System.out.println(Utilities.getArrayString(testArr, ','));
		Utilities.rotate(testArr, true, 1);
		System.out.println(Utilities.getArrayString(testArr, ','));
		StringBuffer t1 = new StringBuffer("test"), t2 = new StringBuffer("yeeeeet"), 
				t3 = new StringBuffer("nani"), t4 = new StringBuffer("asddd"), t5 = new StringBuffer("dsa");
		StringBuffer[] str = new StringBuffer[] {t1, t2, t3, t4, t5};
		for (int i = 0;i < Utilities.getArrayStringsLongerThan(str, -1).length;i++) {
			System.out.print(Utilities.getArrayStringsLongerThan(str, -1)[i] + " ");
		}
		System.out.println();
		System.out.println(Utilities.countInstancesOf(20, testArr));
		System.out.println(Utilities.hasTwoInstancesOfAnyValue(testArr));
		System.out.println(Utilities.hasTwoPairsOfDifferentValues(testArr));
		System.out.println(Utilities.isIncreasing(argh));
		int[] newArr = Utilities.getIndices(testArr2, false);
		System.out.println(Utilities.getArrayString(newArr, ','));
	}

}
