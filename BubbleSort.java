

import java.util.Arrays;
import java.util.Random;

public class BubbleSort{
    public static void main(String[] args) {
        // Входные данные для массива
        Integer n = 5;
        Integer[] arr = new Integer[n];
        Random random = new Random();
        
        //Создавание рандомных чисел для кадого индекса массива
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(100);
        }
        // Ввыод изначального массива 
        System.out.println(Arrays.toString(arr));
        
        //Цикл Пузырковой сортьировки
        for(int k = 0; k < arr.length - 1; k++){
            for(int i = 0; i < arr.length - k - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }  
        }
        // Вывод отсортированного массива
        System.out.print(Arrays.toString(arr));  
    }
}