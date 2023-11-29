package minggu7.Latihan;

public class Angka {
    int[] array;
    int largest, counter;
    int[] idxLargest;

    Angka(int[] array) {
        this.array = array;
        idxLargest = new int[array.length];
    }

    void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        largest = array[array.length - 1];
    }

    void showSorted() {
        System.out.print("Data array setelah diurutkan : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void findBinarySearch(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (array[mid] == largest) {
                idxLargest[counter] = mid;
                counter++;
                findBinarySearch(array, mid + 1, right);
            } else {
                if (largest < array[mid]) {
                    findBinarySearch(array, left, mid - 1);
                } else {
                    findBinarySearch(array, mid + 1, right);
                }
            }
        }
    }

    void showLargestIdx() {
        for (int i = 0; i < counter; i++) {
            System.out.println("Nilai terbesar ditemukan pada Index ke-" + idxLargest[i]);
        }
    }
}
