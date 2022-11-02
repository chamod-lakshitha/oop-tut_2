package tut_2.Question_3;

import Question.Question;

public class Question_3 implements Question {
    public void run() {
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);
    }
}
