package com.example.baitaptuan7_reboot;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;

public class UserModel extends BaseObservable implements Serializable {
    public String firstName;
    public String lastName;
    public UserModel(String fistName, String lastName) {

        this.firstName = fistName;
        this.lastName = lastName;
    }
    @Bindable
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fistName) {
        this.firstName = fistName;
        notifyPropertyChanged(BR.firstName);
    }
    @Bindable
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
