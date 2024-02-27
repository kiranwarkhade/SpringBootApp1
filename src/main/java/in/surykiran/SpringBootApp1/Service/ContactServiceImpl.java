package in.surykiran.SpringBootApp1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.surykiran.SpringBootApp1.Entity.ContactEntity;
import in.surykiran.SpringBootApp1.repo.ContactRepo;

/*
 * import java.util.List;
 * 
 * @Service public class ContactServiceImpl {
 * 
 * @Autowired private ContactRepo contactRepository;
 * 
 * public List<ContactEntity> getAllContacts() { return
 * contactRepository.findAll(); }
 * 
 * public ContactEntity getContactById(Integer contactId) { return
 * contactRepository.findById(contactId).orElse(null); }
 * 
 * public String saveContact(ContactEntity contact) {
 * contactRepository.save(contact); return "Contact saved successfully"; }
 * 
 * public String updateContact(ContactEntity contact) { if
 * (contactRepository.existsById(contact.getContactId())) {
 * contactRepository.save(contact); return "Contact updated successfully"; }
 * else { return "Contact not found"; } }
 * 
 * public String deleteContactById(Integer contactId) { if
 * (contactRepository.existsById(contactId)) {
 * contactRepository.deleteById(contactId); return
 * "Contact deleted successfully"; } else { return "Contact not found"; } } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */












/*
 * import java.util.ArrayList; import java.util.Collection; import
 * java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import in.surykiran.SpringBootApp1.Controller.ContactController; import
 * in.surykiran.SpringBootApp1.Entity.ContactEntity; import
 * in.surykiran.SpringBootApp1.repo.ContactRepo;
 * 
 * @Service public class ContactServiceImpl implements ContactService {
 * 
 * @Autowired private ContactRepo repo;
 * 
 * @Override public String saveContact(ContactEntity contact) {
 * 
 * contact = repo.save(contact); // insertion
 * 
 * if (contact.getContactId() != null) { return "Contact Saved"; } else { return
 * "Contact Failed To Save"; } }
 * 
 * 
 * @Override public List<ContactEntity> getAllContacts() { return
 * repo.findAll(); }
 * 
 * 
 * 
 * @Override public ContactEntity getContactById(Integer contactId) {
 * 
 * Optional<ContactEntity> findById = repo.findById(contactId);
 * 
 * if (findById.isPresent()) { return findById.get(); }
 * 
 * return null; }
 * 
 * @Override public String updateContact(ContactEntity contact) { if
 * (repo.existsById(contact.getContactId())) { repo.save(contact); // update
 * 
 * return "Update Success"; } else { return "No Record Found"; } }
 * 
 * @Override public String deleteContactById(Integer contactId) { if
 * (repo.existsById(contactId)) { repo.deleteById(contactId); return
 * "Record Deleted"; } else { return "No Record Found"; } }
 * 
 * 
 * 
 * 
 * }
 */