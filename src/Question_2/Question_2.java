package Question_2;

import Question.Question;

import java.awt.*;

public class Question_2 implements Question {
    public void run() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
//        Rectangle r2 = new Rectangle(r1);
        System.out.println(r1);
        /*r2.grow(10,20);
        System.out.println(r1);
        System.out.println(r2);*/
        Rectangle r2 = r1;
        r2.grow(10,20);
        System.out.println(r1);
        System.out.println(r2);
    }
}
