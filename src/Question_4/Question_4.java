package Question_4;

import Question.Question;

public class Question_4 implements Question {
    public void run(){
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count = ");
        System.out.println(machine.getCanCount());
    }
}
