import org.springframework.stereotype.Controller;

package com.fibo.contactmanager.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fibo.contactmanager.domain.Contact;
import com.fibo.contactmanager.service.ContactService;

/**
 * @author Viktor Chuhra
 */
@Controller
@RequestMapping("/rest")
public class ContactRestController {

    @Autowired
    private ContactService contactService;


    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Contact> listContacts() {
        return contactService.listContact();

    }

   /* @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact,
                             BindingResult result) {

        contactService.addContact(contact);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {

        contactService.removeContact(contactId);

        return "redirect:/index";
    }*/
}
