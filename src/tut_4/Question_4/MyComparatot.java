package tut_4.Question_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator<BankAccount> {
    public int compare(BankAccount b1, BankAccount b2) {
        if (b1.balance < b2.balance)
            return -1;
        else if (b1.balance > b2.balance)
            return 1;
        else
            return 0;
    }
}


