package geekbrains.lesson_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mass1 = new int[5];
        mass1[0] = 1;
        mass1[2] = 1;
        mass1[4] = 1;
        System.out.println(Arrays.toString(mass1));
        for (int i1 = 0; i1 < 5; i1++) {

            if (mass1[i1] == 0) {
                mass1[i1] = 1;
            } else mass1[i1] = 0;

        }
        System.out.println(Arrays.toString(mass1)); //DZ1.1

        int[] mass2 = new int[8];
        System.out.println(Arrays.toString(mass2));

        for (int i = 0, j = 0; i <8; i++, j+=3){
            mass2[i] = j;
        }
        System.out.println(Arrays.toString(mass2)); //DZ1.2

        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mass3));
        for (int i = 0; i < 12; i++) {
            if (mass3[i] < 6) {
                mass3[i] = mass3[i]*2;
            }
            }
        System.out.println(Arrays.toString(mass3)); //DZ1.3

        int[][] mass4 = new int[5][5];

        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4.length; j++) {
                System.out.print( mass4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
                mass4[i][i] = 1;
        }


        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4.length; j++) {
                System.out.print( mass4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        int jj = 5;
        for (int i=0; i < 5; i++) {
            jj--;
                    mass4[i][jj] = 1;
        }


        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4.length; j++) {
                System.out.print( mass4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" "); // DZ1.4

        int[] mass5 = new int[5];
        System.out.println(Arrays.toString(mass5));
        System.out.println(" ");

        mass5[0] = 6;
        mass5[1] = 5;
        mass5[2] = 7;
        mass5[3] = 5;
        mass5[4] = 6;

        int max;
        int min;
        max = mass5[0];
        min = mass5[0];


        for (int i = 1; i < 5; i++) {

            if (min > mass5[i]) {
                min = mass5[i];
            }
            if (max < mass5[i]) {
                max = mass5[i];
            }
        }
        if (min == max) {
            System.out.println("min = max = " + max);
        } else System.out.println(max + " = max " + min + " = min ");//DZ1.5

        boolean resolt6 = false;

        double a6;
        int a666;
        a6 = 7;// можно подставить и нечетное число
        a666 = (int)a6;
        int[] mass6 = new int[a666];
        mass6[0] = 6;
        mass6[1] = 5;
        mass6[2] = 7;
        mass6[3] = 5;
        mass6[4] = 20;
        mass6[5] = 2;
        mass6[6] = 0;// и добавить тут значений.

        resolt6 = checkBalance(mass6, a6);
        System.out.println(resolt6);
        int n7 = 0;// инициализация N7
        n7 = 2;
        int[] mass7 = new int[7];
        mass7[0] = 1;
        mass7[1] = 2;
        mass7[2] = 3;
        mass7[3] = 4;
        mass7[4] = 5;
        mass7[5] = 6;
        mass7[6] = 7;

          TransporterN(mass7, n7);

    }

    static boolean checkBalance(int[] mass6, double a6){   //DZ1.6

        boolean resolt = false;

        double sss = a6/2; // делю пополам кол-во чисел в массиве
        int jjj1 = (int)sss; // отрезаю целую часть
        double jjj2 = sss - jjj1;// отрезаю дробь

        int sss1 = 0;
        sss1 = (int)(sss-1);// номер последнего левого элемента в случае с чётным кол-вом чисел.
        System.out.println(sss1 + "sss1");// проверка его значения

        int a66 = 0; // (далее расчёт) номер последнего левого элемента в случае нечетности кол-ва чисел в массиве.
        int rightSum = 0;// сумма правых.
        int leftSum = 0; // сумма левых // пусть левая часть всегда имее больше кол-во чисел или равное правой.
        int sss2 = 0;// (будет) номер последнего правого элемента в случае чётности.

        if (jjj2 == 0) {
            sss2 = (int)(a6-1); // номер последнего правого элемента в случае чётности.
            System.out.println(sss2 + " sss2 ");// проверка.
            for (int i = (sss1+1); i <= sss2; i++){
                rightSum = rightSum + mass6[i];
            }
            for (int i = 0; i <= sss1; i++){
                leftSum = leftSum + mass6[i];
            }
        } else {
            sss2 = (int)(a6-1);//в случае не чётности.
            a66 = (int) (a6 - jjj1);// расчёт значения номера с приведением к типу интеджер.
            for (int i = a66; i <= sss2; i++) {
                rightSum = rightSum + mass6[i];
            }
            for (int i = 0; i <= jjj1; i++) {
                leftSum = leftSum + mass6[i];
            }
        }
        if (leftSum == rightSum) {
            resolt = true;
        }
        return resolt;
    }

        static void TransporterN(int[] mass7, int n7){
            System.out.println("Начальный массив");
            System.out.println(Arrays.toString(mass7));
            int n77 = 0;// для расчёта модуля n7
            if (n7 < 0){
                n77 = n7 * (-1);
            } else if (n7 == 0) {
                System.out.println("N7 = 0, выполнение метода ненужно.");
                System.out.println(Arrays.toString(mass7));
                return;
            } else n77 = n7;
                if (n7 > 0){
                    for (int i = 6; i >= (0+n77); i--) {
                        mass7[i] = mass7[i-n77];
                    }
                    System.out.println("Конечный массив");
                    System.out.println(Arrays.toString(mass7));
                } else {
                    for (int i = 0; i <= (6-n77); i++) {
                        mass7[i] = mass7[i+n77];
                    }
                    System.out.println("Конечный массив");
                    System.out.println(Arrays.toString(mass7));
                }
            return;//DZ1.7
        }

// Скорее всего не успею выполнить змейку и потому выполню её отдельным файлом, если всё таки успею.

}
