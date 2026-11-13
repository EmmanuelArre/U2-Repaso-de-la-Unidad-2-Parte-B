import java.util.*;
public class Ordenamiento {

    // Bubble Sort
    public static void ordenar(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Pasada " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    // Partición de QuickSort (pivote = último elemento)
    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];   // pongo el pivote en su lugar
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int p = particion(arr, inicio, fin);
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fin);
        }
    }

    public static void main(String[] args) {
        int[] a = {23, 5, 41, 8, 17, 30, 12, 26};
        System.out.println("Bubble Sort:");
        ordenar(a);

        int[] b = {23, 5, 41, 8, 17, 30, 12, 26};
        int p = particion(b, 0, b.length - 1);
        System.out.println("\nPrimera partición: " + Arrays.toString(b) + "  (pivote 26 en índice " + p + ")");

        int[] c = {23, 5, 41, 8, 17, 30, 12, 26};
        quickSort(c, 0, c.length - 1);
        System.out.println("QuickSort completo: " + Arrays.toString(c));
    }
}
