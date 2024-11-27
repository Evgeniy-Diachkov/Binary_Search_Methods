import java.util.Comparator;

public class MyArrays {

    // Для массивов byte
    public static int binarySearch(byte[] a, byte key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов char
    public static int binarySearch(char[] a, char key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов double
    public static int binarySearch(double[] a, double key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов float
    public static int binarySearch(float[] a, float key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов int
    public static int binarySearch(int[] a, int key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов long
    public static int binarySearch(long[] a, long key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов short
    public static int binarySearch(short[] a, short key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для массивов объектов с Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return java.util.Arrays.binarySearch(a, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }
}
