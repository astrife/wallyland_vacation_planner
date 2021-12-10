package com.ist412.wallyland_vacation_planner.account;

/**
 * Account class for the head of a family unit.
 * 
 * @author Jason C. Nucciarone
 * @version 2.0
 * @since 2021-11-21
 */
public class FamilyAccount extends Account {
    public FamilyAccount(int accountID, String firstName, String lastName, String email, String userName, String password) {
        super(accountID, firstName, lastName, email, userName, password, "family");
    }
}
