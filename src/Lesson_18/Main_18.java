package Lesson_18;

import java.util.Random;

public class Main_18 {
    public static void main(String[] args) {
        Random random = new Random();

        RuberrArray ra = new RuberrArray();
        ra.add(50);
        ra.add(-10);

        for (int i = 0; i < 5; i++) {
            ra.add(random.nextInt(101));
        }

        System.out.println(ra.toString());
    }
}
