package com.ist412.wallyland_vacation_planner.account;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Interface to provide common interaction with all the Account classes.
 * 
 * @author Jason C. Nucciarone
 * @version 2.0
 * @since 2021-11-21
 */
public class Account implements Serializable {
    private int accountID;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String accountType;
    private String password;
    private final HashMap<String, Object> accountInfo;

    public Account(int accountID, String firstName, String lastName, String email, String userName, String password, String accountType) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
        this.accountInfo = new HashMap<>();
    }
    
    // Getter methods for retrieving information
    public int getAccountID() {
        return accountID;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public HashMap<String, Object> getAccountInfo() {
        return accountInfo;
    }
    
    public Object getAccountInfoByKey(String key) {
        return accountInfo.get(key);
    }
    
    public String getPassword() {
        return password;
    }
    
    // Setter methods for defaulting to new information
    public void setAccountID(int newID) {
        this.accountID = newID;
    }
    
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    
    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }
    
    public void setAccountType(String newType) {
        this.accountType = newType;
    }
    
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    
    public void pushAccountInfo(String newKey, Object newValue) {
        this.accountInfo.put(newKey, newValue);
    }
    
    public void popAccountInfo(String oldKey) {
        this.accountInfo.remove(oldKey);
    }
}
