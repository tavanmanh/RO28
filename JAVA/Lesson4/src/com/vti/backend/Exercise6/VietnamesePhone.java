package com.vti.backend.Exercise6;

import java.util.ArrayList;

public class VietnamesePhone extends Phone{
    private ArrayList<Contact> contacts=new ArrayList<Contact>();
    public void insertContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
    }
    @Override
    public void removeContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }
    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setNumber(newPhone);
            }
        }
    }
    @Override
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
            }
        }
    }
    public void printContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
