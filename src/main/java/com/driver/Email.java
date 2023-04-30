package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(!(oldPassword.equals(password) )|| newPassword.length()<8){
            return;
        }
        int up=0;
        int low=0;
        int dig=0;
        int spe=0;
        for(int i=0;i<newPassword.length();i++){
            if(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z') up++;
            else if(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z') low++;
            else if(newPassword.charAt(i)>=48 && newPassword.charAt(i)<=57) dig++;
            else spe++;
        }
        if(up==0 || low==0 || dig==0 || spe==0) return;
        password=newPassword;
        return;
    }
}
