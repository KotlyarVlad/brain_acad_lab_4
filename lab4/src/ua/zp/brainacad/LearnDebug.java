package ua.zp.brainacad;
/*Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10 и возле каждого пишет четное это число или нечетное.*/
public class LearnDebug {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Число " + i + "-" + (i % 2 == 0 ? "Четное" : "Нечетное"));
        }
    }
}


