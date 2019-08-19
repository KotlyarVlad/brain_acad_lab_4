package ua.zp.brainacad;

public class LearnDebug2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            switch (i){
                case 1:
                    System.out.println("Понедельник - это рабочий день");
                    break;
                case 2:
                    System.out.println("Вторник - это рабочий день");
                    break;
                case 3:
                    System.out.println("Среда - это рабойчий день");
                    break;
                case 4:
                    System.out.println("Четверг - это рабочий день");
                    break;
                case 5:
                    System.out.println("Пятница - УРА, ПЯТНИЦА!");
                    break;
                case 6:
                    System.out.println("Суббота - это выходной!");
                    break;
                case 7:
                    System.out.println("Воскресенье - это выходной!");
                    break;
            }

        }
    }
}
