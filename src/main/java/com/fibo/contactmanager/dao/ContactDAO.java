package com.fibo.contactmanager.dao;

import java.util.List;
import com.fibo.contactmanager.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}