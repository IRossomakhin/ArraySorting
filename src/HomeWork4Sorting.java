import java.util.Scanner;
import java.util.*;

public class HomeWork4Sorting {
    public static void main(String[] args) {

        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] mix = GeneratingNewArray.randomArray(N);

        int[] mix2 = Arrays.copyOf(mix,mix.length); //создали копию массива

        long start = System.currentTimeMillis(); // время старта сортировки

      MyArraySorting.selectionSort(mix);

              long finish = System.currentTimeMillis();

        long sortingTime = finish - start;
        System.out.println("Время на сортировку 'выбором' составило  " + sortingTime + "  миллисекунд.");

        long start2 = System.currentTimeMillis();
        System.out.println(start2);

        Arrays.sort(mix2);

        long finish2 = System.currentTimeMillis();
        System.out.println(finish2);

        long sortingTime2 = finish2 - start2;
        System.out.println("Время на сортировку с помощью Array.sort составило  " + sortingTime2 + "  миллисекунд.");
    }
}

