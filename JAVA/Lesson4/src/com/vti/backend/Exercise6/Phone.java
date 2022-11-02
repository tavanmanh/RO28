package com.vti.backend.Exercise6;

public abstract class Phone {
    public abstract void insertContact(String name, String number);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String number);
    public abstract void searchContact(String name);
}
