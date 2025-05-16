public class Bubble_sorting {
    public static void main(String[] args) {
        int min = -100; // нижняя граница массива
        int max = 100; // верхняя граница массива
        int nums[] = new int[12];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println("Инициализирован массив:");
        display(nums);
        System.out.println("\n\nПроизведена сортировка");
        sortArray(nums);
        System.out.println("\nОтсортированный массив:");
        display(nums);
    }
    private static void display(int[] arik) {
        for (int i = 0; i < arik.length; i++) {
            System.out.print(arik[i] + " ");
        }
    }
    private static int[] sortArray(int[] arik) {
        for (int i = 1; i < arik.length; i++) {
            for ( int j = 0; j < arik.length-1; j++) {
                if ( arik[j] > arik[j+1] ) {
                    int k = arik[j+1];
                    arik[j+1] = arik[j];
                    arik[j] = k;
                }
            }
        }
        return arik;
    }
}