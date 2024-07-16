package com.cc.java;

import java.util.HashMap;
import java.util.Map;

public class Account {

    private static final String ACCOUNT_TOTAL = "10000";
    private static final String OWNER_NAME = "ownerName";

    private Map<String, String> accountDetails = new HashMap<>();
    {
        accountDetails.put(ACCOUNT_TOTAL, "100000");
        accountDetails.put(OWNER_NAME, "mustermen");
    }

    public Account(String ownerName) {
        commitChanges(OWNER_NAME, ownerName);
        HLP.log("Inhaber: " + getAccountDetail(OWNER_NAME) + " eröffnet ein Konto mit dem Startkapital: " + getAccountDetail(ACCOUNT_TOTAL));
    }

    public void setAccountTotal(int accountTotal) {
        commitChanges(ACCOUNT_TOTAL, "" + accountTotal);
        HLP.log("Inhaber: " + getAccountDetail(OWNER_NAME) + " ändert den Kontostand und hat nun: " + getAccountDetail(ACCOUNT_TOTAL));
    }
    
    public int getAccountTotal() {
        return Integer.parseInt(getAccountDetail(ACCOUNT_TOTAL));
    }
    
    private void commitChanges(String key, String value) {
        if (accountDetails.containsKey(key)) {
            accountDetails.put(key, value);
        } else {
            HLP.log("FEHLER: Schlüssel wurd nicht gefunden. Mapping fehlerhaft?");
        }
    }

    private String getAccountDetail(String key){
        if (accountDetails.containsKey(key)) {
            return accountDetails.get(key);
        } else {
            HLP.log("FEHLER: Schlüssel wurd nicht gefunden. Mapping fehlerhaft?");
            return "";
        }
    }
    

    
}