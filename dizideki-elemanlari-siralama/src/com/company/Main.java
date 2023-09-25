import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {99, -2, -2121, 1, 0};


        Arrays.sort(array);

        System.out.print("Sıralama: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
