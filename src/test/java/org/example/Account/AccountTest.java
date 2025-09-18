package org.example.Account;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private static Account account;

    @BeforeAll
    public static void setUp() {
        account = new Account();
    }

    @Test
    public void testBalance() {
        assertEquals(0.0, account.getBalance(), 0.1);

    }

    @Test
    public void testDeposit() {
        account.deposit(100);
        account.deposit(200);
        account.deposit(0);
        account.deposit(-2000);

        assertEquals(300.0, account.getBalance(), 0.1);
    }

    @Test
    public void testWithdraw() {
        account.deposit(300);
        account.withdraw(150);
        account.withdraw(0);
        account.withdraw(-150);


        assertEquals(150.0, account.getBalance(), 0.1);

        account.withdraw(9999999999999999999.0);
        assertEquals(0.0, account.getBalance(), 0.1);
    }

}