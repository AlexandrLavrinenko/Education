package com.bobocode.cs.les_01;

import java.util.ArrayList;
import java.util.List;

/**
 * stepic
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 19.08.2021
 */
public class Accounts {
    private static List<Account> accountList = new ArrayList<>();
    public static List<Account> getAccountList(int i) {
        return accountList;
    }
}
