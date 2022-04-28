public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int number = 0;

        while (number < 10)
        {   number = number +1;
            System.out.println(number);}
        for(int n = 10; n > 0; n = n - 1) {
            System.out.println(n);
        }
        // Задача 2
        System.out.println("Задача 2");
        for(int f = 1; f<= 31; f = f + 7) {
            System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчет.");}
        // Задача 3
        System.out.println("Задача 3");
        int start = 1822;
        int finish = 2122;
        int comet = 0;
        while (comet >= 0) {
            comet = comet + 79;
            if(comet >= start && comet <= finish) {
                System.out.println(comet);}}
    }
}