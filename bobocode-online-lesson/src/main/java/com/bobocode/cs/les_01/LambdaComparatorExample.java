package com.bobocode.cs.les_01;

/**
 * stepic
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 19.08.2021
 */
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class LambdaComparatorExample {

    public static void main(String[] args) {
        List<Account> accounts = Accounts.getAccountList(10);
        sortUsingAnonymousClass(accounts);
        sortUsingLambda(accounts);
        sortUsingMethodReference(accounts);
    }

    private static void sortUsingAnonymousClass(List<Account> accounts) {
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }

    private static void sortUsingLambda(List<Account> accounts) {
        accounts.sort((a1, a2) -> a1.getFirstName().compareTo(a2.getFirstName()));
    }

    private static void sortUsingMethodReference(List<Account> accounts) {
        accounts.sort(comparing(Account::getFirstName));
    }
}
