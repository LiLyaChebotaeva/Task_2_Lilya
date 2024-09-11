import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Задача №1
    private static int Max (int num1, int num2) throws Exception
    {
        if (num1 > num2)
            return num1;
        else if (num2 > num1)
            return num2;
        throw new Exception("Числа равны");
    }

    //Задача №2
    private static float Calculate (int num1, int num2) throws ArithmeticException
    {
        if (num2 != 0)
            return num1/num2;
        throw new ArithmeticException("Делить на 0 нельзя");
    }

    //Задача №3
    private static int str (String num)
    {
        return Integer.parseInt(num);
    }

    //Задача №4
    private static void age (int age) throws IllegalArgumentException
    {
        if (age < 0 || age > 150)
            throw new IllegalArgumentException("Возраст введен некоректно!");
    }

    //Задача №5
    private static float sqrt (float num) throws IllegalArgumentException
    {
        if (num < 0)
            throw new IllegalArgumentException("Число отрицательное");
        return (float)Math.sqrt(num);
    }

    //Задача №6
    public static int Factorial (int a) throws Exception {
        if (a < 0) throw new Exception("Факториал из отрицательного числа");
        if (a == 1) return 1;
        return a * Factorial(a - 1);
    }

    //Задача №7
    private static void arr (int[] arr) throws Exception
    {
        if (Arrays.stream(arr).sorted().toArray()[0] == 0)
            throw new Exception("Массив содержит нули");
        System.out.println("Массив не содержит нулей");
    }

    //Задача №8
    private static int pow (int num1, int num2) throws Exception
    {
        if (num2 < 0)
            throw new Exception("Отрицательная степень");
        return (int)Math.pow(num1, num2);
    }

    //Задача №9
    private static String len (String s, int num) throws Exception
    {
        if (num > s.length())
            throw new Exception("В строке меньше нужного количества символов");
        return s.substring(0, num);
    }

    //Задача №10
    private static int massive (int[] arr, int num) throws Exception {
        for (int i = 0; i <= arr.length; i++)
        {
            if (arr[i] == num) return i;
        }

        throw new Exception("Массив не содержит введённого элемента");
    }

    //Задача №11
    public static int two (int[] arr, int element) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        throw new Exception("Элемент не найден");
    }

    //Задача №12
    public static boolean divide (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        return a % b == 0;
    }

    //Задача №13
    public  static int read (int[] a,int b) throws Exception {
        if (b > a.length-1) throw new IndexOutOfBoundsException("Индекс находиться вне массива");
        return a[b];
    }

    //Задача №14
    public static class WeakPasswordException extends Throwable {
        public WeakPasswordException(String mes) {
            super(mes);
        }
    }

    public static boolean ChekPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) throw new WeakPasswordException("Пароль короткий");
        return true;
    }

    //Задача №15
    public static boolean ChekDate(String date) throws Exception {
        try {
            LocalDate localDate = LocalDate.of(Integer.parseInt(date.substring(6, 10)), Integer.parseInt(date.substring(3, 5)), Integer.parseInt(date.substring(0, 2))
            );
        }
        catch (DateTimeParseException e)
        {
            throw new DateTimeParseException("Формат неверный",date, 0);
        }
        return true;
    }


    //Задача №16
    public static String nul (String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна или две строки равны null");
        }
        return str1 + str2;
    }

    //Задача №17
    public static int rem (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        return a % b;
    }

    //Задача №18
    public static double RenSqrt (double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Корень отрицательного числа найти нельзя");
        }
        return Math.sqrt(a);
    }

    //Задача №19
    public static double temp (double a) {
        if (a < -273.15) {
            throw new IllegalArgumentException("Температура не может быть меньше абсолютного нуля");
        }
        return (a * 9.0 / 5.0) + 32.0;
    }

    //Задача №20
    public static String strnul (String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или равной null");
        }
        return s;
    }
}
