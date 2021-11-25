
public class GeneratingNewArray {
     public static int[] randomArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) { // обращаемся к псевдогенратру случайных чисел для заполнения массива
            newArray[i] = (int) (Math.random() * 120106);
        }
        return newArray;
     }
}


