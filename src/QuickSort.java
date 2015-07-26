public class QuickSort {

	public static void quickSort(Comparable[] array) {
		sort(array, 0, array.length - 1);
	}

	private static void sort(Comparable[] array, int start, int end) {
		if (start < end) {
			int j = partition(array, start, end);
			sort(array, start, j - 1);
			sort(array, j + 1, end);
		}
	}

	private static int partition(Comparable[] array, int low, int high) {
		Comparable pivot = array[low];
		int i = low;
		int j = high + 1;

		while (true) {

			while (compare(array[++i], pivot)) {
				if (i == high)
					break;
			}

			while (compare(pivot, array[--j])) {
				if (j == low)
					break;
			}

			if (i >= j)
				break;

			swap(array, i, j);
		}

		swap(array, low, j);
		return j;
	}

	private static boolean compare(Comparable i, Comparable j) {
		return (i.compareTo(j) < 0);
	}

	private static void swap(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		Integer[] a = { 4, 3, 2, 1, 5, 9, 0 };
		quickSort(a);
		for (Integer a1 : a)
			System.out.println(a1);
	}
}
