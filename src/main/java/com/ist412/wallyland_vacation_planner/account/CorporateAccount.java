package com.ist412.wallyland_vacation_planner.account;

/**
 * Account class for Corporate entities that are planning a retreat to one
 * of the WallyLand parks.
 * 
 * @author Jason C. Nucciarone
 * @version 2.0
 * @since 2021-11-3
 */
public class CorporateAccount extends Account {
    public CorporateAccount(int accountID, String firstName, String lastName, String email, String userName, String password) {
        super(accountID, firstName, lastName, email, userName, password, "corporate");
    }
}
