import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
    /**
     * @author Goncharov Matthew
     * @version 0.1
     */
    public class laba_18
    {
        public static void main(String[] args)
        {
            int[][] arr = newArray(5);
            // Вывожу для проверки
            System.out.println("\nPrint my array");
            for (int[] line : arr)
            {
                System.out.println(Arrays.toString(line));
            }
            // Моя функция
            arr = replaceDiag(arr);
            System.out.println("\nReplace diagonal on array");
            for (int[] line : arr)
            {
                System.out.println(Arrays.toString(line));
            }
        }
        /**
         * Создание массива
         * @param size размер матрицы
         * @return возвращает заполненый массив
         */
        public static int[][] newArray(int size)
        {
            int[][] arr = new int[size][size];
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    arr[i][j] = (int) (Math.random() * 10);
                }
            }
            if (arr == null || arr.length == 0) // Проверка на пустоту
            {
                return null;
            }
            return arr;
        }
     /**
      * Функция для смены элементов на главной и побочной диагонали
      *
      * @return возвращает среднее арифмитическое
      */
     public static int[][] replaceDiag(int[][] arr)
     {
         if (arr == null || arr.length == 0)
         {
             return null;
         }
         int[] array_glavn = new int[arr.length];
         int[] array_pobochn = new int[arr.length];

         // Заполняю диагонали
         for (int i = 0; i < arr.length; i++)
         {
             for (int j = 0 ; j < arr.length; j++)
             {
                if (i == j)
                {
                    array_glavn[i] = arr[i][j];
                }
                if (i + j == arr.length - 1)
                {
                    array_pobochn[i] = arr[i][j];
                }
             }
         }
         // replace
         for (int i = 0; i < arr.length; i++)
         {
             for (int j = 0 ; j < arr.length; j++)
             {
                 if (i == j)
                 {
                     arr[i][j] = array_pobochn[i];
                 }
                 if (i + j == arr.length - 1)
                 {
                     arr[i][j] = array_glavn[i];
                 }
             }
         }
         return arr;
     }
 }
