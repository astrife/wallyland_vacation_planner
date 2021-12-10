package com.ist412.wallyland_vacation_planner.account;

/**
 * Account Class for Individuals.
 * 
 * @author Jason C. Nucciarone
 * @version 2.0
 * @since 2021-11-21
 */
public class PersonalAccount extends Account {
    public PersonalAccount(int accountID, String firstName, String lastName, String email, String userName, String password) {
        super(accountID, firstName, lastName, email, userName, password, "personal");
    }
}
