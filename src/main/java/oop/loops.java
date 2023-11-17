package oop;

public class loops {

    int liczba = 2;
    static int[] tablicaliczb;
//psvm
    public static void main(String[] args) {
        tablicaliczb = new int[3];
        tablicaliczb[0] = 10;
        tablicaliczb[1] = 20;
        tablicaliczb[2] = 30;

        //for (int number: tablicaliczb) {
        //    System.out.println("Liczba: " + number);
        //}
        //for (int i = 0; i < 3; i++) {
        //    System.out.println("Liczba: " + tablicaliczb[i]);
        //}
        //for (int i = 0; i < 10; i++) {
        //    System.out.println("counter: " + i);
        //}
        //for (int i = 0; i <= 1000; i = i + 10) {
        //    System.out.println("Liczba: " + i);
        //}
        //int i = 1;
        //while (i<10) {
        //    System.out.println(i++);
        //    if (i == 5) System.out.println("jestem w połowie");

        //}
        int a = 100;
        int i = 0;
        while (i<a) {
            System.out.println("liczba: "+ i);
            i++;
            if (i == a-1) System.out.println("Prawie koniec");
        }
    }
}
