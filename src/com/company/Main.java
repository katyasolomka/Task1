package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
        */


        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность цифр: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Вот обратная последовательность цифр: " + mirror);
        */


        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
       /* int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {

            System.out.println(i);
        }
        for (int i : a) {
            System.out.print(i);
        }
        */







        // 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password1 = scanner.next();
        String password2 = "tester1";
        if (password1.equals(password2))
            System.out.println("Пароль верный");
        else System.out.println("Пароль не верный");
*/





        //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
       /* while (value != 0) {  //подсчитать сумму чисел
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);*/

        /* while (value != 0) {   //подсчитать произведения чисел
            com *= value % 10;
            value = value / 10;
        }
        System.out.println("Произведение введённых чисел: " + com);*/




        //6.Ввести с консоли n целых чисел. На консоль вывести:
       /* System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
        }
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Введите целые числа через пробел ");
        for (int i = 0; i < size; i++)
            sourceNumbers[i] = in.nextInt();*/ //чтобы работали нижние заданание надо раскоментировать эту часть,
                                               //а потом по очереди последуйщие например 6 и 6.1 или 6 и 6.3

        // 6.1. Четные и нечетные числа.
        /*for (int i = 0; i < size; i++)
            if (sourceNumbers[i] % 2 != 0)
                System.out.println("Нечётное число:" + sourceNumbers[i]);
            else if (sourceNumbers[i] % 2 == 0)
                System.out.println("Чётное число:" + sourceNumbers[i]);
        */


        //6.2. Наименьшее число.

        /*int min = sourceNumbers[0];
         for (int i = 0; i < size; i++) {
             if (min > sourceNumbers[i])
                 min = sourceNumbers[i];
         }
         System.out.println("Минимльное число:" + min);
        */


        //6.2. Наибольшее число.
          /* int max = sourceNumbers[0];
           for (int i = 0; i < size; i++) {
               if (max < sourceNumbers[i])
                   max = sourceNumbers[i];
           }
           System.out.println("Максимальное число:" + max);
        */


        // 6.3. Числа, которые делятся на 3 или на 9.
         /*for (int i = 0; i < size; i++)
            if ((sourceNumbers[i] % 3 == 0) || (sourceNumbers[i] % 9 == 0)) // для задания достаточно 1й проверки
                System.out.println("Число, которое делится на 3 или 9: " + sourceNumbers[i]);
        */


        // 6.4. Числа, которые делятся на 5 и на 7.
        /* for (int i = 0; i < size; i++)
            if ((sourceNumbers[i] % 5 == 0) && (sourceNumbers[i] % 7 == 0))  // (5 AND 7) для задания достаточно только 1й if
                System.out.println("Число, которое делится на 5 и 7: " + sourceNumbers[i]);
        */



        //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        /*int a = 0, b = 0, c = 0;
        for (int j = 0; j < size; j++)
            if ((sourceNumbers[j] > 99) && (sourceNumbers[j] < 1000)) {
                a = sourceNumbers[j] / 10 / 10;
                b = sourceNumbers[j] / 10 % 10;
                c = sourceNumbers[j] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)

                    System.out.println("3х-значное число в десятичной записи которых нет одинаковых цифр: " + sourceNumbers[j]);
            }
*/


        // 6.6. «Счастливые» числа.
        /* int a1 = 0, b1 = 0;
           for (int j = 0; j < size; j++)
               if ((sourceNumbers[j] > 99999) && (sourceNumbers[j] < 1000000)) {

                a1 = sourceNumbers[j] / 1000; // выделение 1й 3ки чисел
                b1 = sourceNumbers[j] % 1000; // выделение 2й 3ки чисел

                int sum = 0;
                int sum1 = 0;
                while (a1 != 0) {  //подсчитать сумму 1й тройки чисел
                    sum = sum + a1 % 10;
                    a1 = a1 / 10;
                }

                while (b1 != 0) {  //подсчитать сумму 2й тройки чисел
                    sum1 = sum1 + b1 % 10;
                    b1 = b1 / 10;
                }

                if (sum == sum1) {
                    System.out.println("Счастливое число: " + sourceNumbers[j]);
                }
            }
            */


    }
}
