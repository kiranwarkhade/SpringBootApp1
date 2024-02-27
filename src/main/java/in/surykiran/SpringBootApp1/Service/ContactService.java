package in.surykiran.SpringBootApp1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import in.surykiran.SpringBootApp1.Entity.ContactEntity;
import in.surykiran.SpringBootApp1.repo.ContactRepo;



	@Service
	public class ContactService {

	    @Autowired
	    private ContactRepo contactRepository;

	    public List<ContactEntity> getAllContacts() {
	        return contactRepository.findAll();
	    }

	    public ContactEntity getContactById(Integer contactId) {
	        return contactRepository.findById(contactId).orElse(null);
	    }

	    public String saveContact(ContactEntity contact) {
	        contactRepository.save(contact);
	        return "Contact saved successfully";
	    }

	    public String updateContact(ContactEntity contact) {
	        if (contactRepository.existsById(contact.getContactId())) {
	            contactRepository.save(contact);
	            return "Contact updated successfully";
	        } else {
	            return "Contact not found";
	        }
	    }

	    public String deleteContactById(Integer contactId) {
	        if (contactRepository.existsById(contactId)) {
	            contactRepository.deleteById(contactId);
	            return "Contact deleted successfully";
	        } else {
	            return "Contact not found";
	        }
	    }
	}









	
	
	/*
	 * public String saveContact(ContactEntity contact);
	 * 
	 * public List<ContactEntity> getAllContacts();
	 * 
	 * public ContactEntity getContactById(Integer contactId);
	 * 
	 * public String updateContact(ContactEntity contact);
	 * 
	 * public String deleteContactById(Integer contactId);
	
	
	 
}
	 */