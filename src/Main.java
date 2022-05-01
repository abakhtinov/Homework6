public class Main {
    public static void main(String[] args) {

    //Задание 1
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        float[] numbers = {1.57f ,7.654f, 9.986f};

        int[] week = {1,2,3,4,5,6,7};


    //Задание 2
        for (int j = 0; j < i.length; j++) {
            if (j == i.length - 1) {
                System.out.println(i[j]);
            } else {
                System.out.print(i[j] + ",");
            }
        }

            for (int j = 0; j < numbers.length; j++) {
                if (j == numbers.length-1){
                    System.out.println(numbers[j]);
                }
                else {
                    System.out.print(numbers[j] + ",");}

            }

        for (int j = 0; j < week.length; j++) {
            if (j == week.length-1){
                System.out.println(week[j]);
            }
            else {
                System.out.print(week[j] + ",");}

        }

        //Задание 3

        for (int j = i.length-1;j >= 0; j--) {
            if (j >= i[0]) {
                System.out.print(i[j] + ",");
            } else {
                System.out.println(i[j]);
            }

        }

        for (int j = numbers.length-1; j >= 0; j--) {
            if (j >= numbers[0]) {
                System.out.print(numbers[j] + ",");
            } else {
                System.out.println(numbers[j]);
            }
        }

        for (int j = week.length-1; j >= 0; j--) {
            if (j >= week[0]) {
                System.out.print(week[j] + ",");
            } else {
                System.out.println(week[j]);
            }
        }

        //Задание 4

        for (int j = 0; j <= i.length; j++) {
            if (j % 2 != 0) { j = j+1;
                System.out.print(j + " ");}
            
        }







    }
}