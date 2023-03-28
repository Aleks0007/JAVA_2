import java.util.logging.*;
import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    
    // создаем логгер
    private static final Logger LOGGER = Logger.getLogger(BubbleSort.class.getName());
    
    public static void main(String[] args) {
        // создаем массив
        int[] arr = createArray();
        // выводим неотсортированный массив
        LOGGER.info("Инициализация массива: " + Arrays.toString(arr));
        // сортируем массив
        bubbleSort(arr);
        // выводим отсортированный массив
        LOGGER.info("Отсортированный массив: " + Arrays.toString(arr));
    }
    
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы массива через пробел: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        scanner.close();
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // проходимся по всем элементам массива
        for (int i = 0; i < n; i++) {
            // последние i элементов уже отсортированы, их можно пропустить
            for (int j = 0; j < n - i - 1; j++) {
                // если элемент j больше следующего за ним, меняем их местами
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // записываем промежуточный результат в лог-файл
            LOGGER.info("Итерация " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
}