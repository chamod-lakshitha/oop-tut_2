package Question_1;

import Question.Question;

public class Question_1 implements Question {
    public void run()
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        /* Your work goes here */
        System.out.println(animal1.concat(animal2).concat(article).concat(action));
        System.out.println(animal1+animal2+article+action);
    }
}
