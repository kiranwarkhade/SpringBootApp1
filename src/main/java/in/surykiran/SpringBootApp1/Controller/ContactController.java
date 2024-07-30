package in.surykiran.SpringBootApp1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.surykiran.SpringBootApp1.Entity.ContactEntity;
import in.surykiran.SpringBootApp1.Service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
	@Autowired
	private ContactService contactService;

	@GetMapping("/index")
    public String home() {
         System.out.println("This is Display Index");
    	return  "<!DOCTYPE html>\r\n"
    			+ "<html lang=\"en\">\r\n"
    			+ "<head>\r\n"
    			+ "    <meta charset=\"UTF-8\">\r\n"
    			+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
    			+ "    <title>Contact Management</title>\r\n"
    			+ "    <style>\r\n"
    			+ "        /* Add your styles here */\r\n"
    			+ "        body {\r\n"
    			+ "            font-family: Arial, sans-serif;\r\n"
    			+ "            margin: 20px;\r\n"
    			+ "        }\r\n"
    			+ "\r\n"
    			+ "        form {\r\n"
    			+ "            margin-bottom: 20px;\r\n"
    			+ "        }\r\n"
    			+ "\r\n"
    			+ "        table {\r\n"
    			+ "            width: 100%;\r\n"
    			+ "            border-collapse: collapse;\r\n"
    			+ "            margin-top: 20px;\r\n"
    			+ "        }\r\n"
    			+ "\r\n"
    			+ "        th, td {\r\n"
    			+ "            border: 1px solid #ddd;\r\n"
    			+ "            padding: 8px;\r\n"
    			+ "            text-align: left;\r\n"
    			+ "        }\r\n"
    			+ "\r\n"
    			+ "        th {\r\n"
    			+ "            background-color: #f2f2f2;\r\n"
    			+ "        }\r\n"
    			+ "    </style>\r\n"
    			+ "</head>\r\n"
    			+ "<body>\r\n"
    			+ "    <h1>Contact Management</h1>\r\n"
    			+ "    \r\n"
    			+ "    <form id=\"contactForm\">\r\n"
    			+ "        <label for=\"contactId\">ID:</label>\r\n"
    			+ "        <input type=\"text\" id=\"contactId\" required disabled>\r\n"
    			+ "        \r\n"
    			+ "        <label for=\"contactName\">Name:</label>\r\n"
    			+ "        <input type=\"text\" id=\"contactName\" required>\r\n"
    			+ "        \r\n"
    			+ "        <label for=\"contactEmail\">Email:</label>\r\n"
    			+ "        <input type=\"email\" id=\"contactEmail\" required>\r\n"
    			+ "        \r\n"
    			+ "        <label for=\"contactNum\">Phone Number:</label>\r\n"
    			+ "        <input type=\"text\" id=\"contactNum\" required>\r\n"
    			+ "        \r\n"
    			+ "        <button type=\"button\" onclick=\"addContact()\">Add Contact</button>\r\n"
    			+ "    </form>\r\n"
    			+ "\r\n"
    			+ "    <table id=\"contactTable\">\r\n"
    			+ "        <thead>\r\n"
    			+ "            <tr>\r\n"
    			+ "                <th>ID</th>\r\n"
    			+ "                <th>Name</th>\r\n"
    			+ "                <th>Email</th>\r\n"
    			+ "                <th>Phone Number</th>\r\n"
    			+ "            </tr>\r\n"
    			+ "        </thead>\r\n"
    			+ "        <tbody id=\"contactTableBody\">\r\n"
    			+ "            <!-- Contact list will be displayed here -->\r\n"
    			+ "        </tbody>\r\n"
    			+ "    </table>\r\n"
    			+ "\r\n"
    			+ "    <script> let contacts = [];\r\n"
    			+ "\r\n"
    			+ "function addContact() {\r\n"
    			+ "    const contactId = contacts.length + 1;\r\n"
    			+ "    const contactName = document.getElementById('contactName').value;\r\n"
    			+ "    const contactEmail = document.getElementById('contactEmail').value;\r\n"
    			+ "    const contactNum = document.getElementById('contactNum').value;\r\n"
    			+ "\r\n"
    			+ "    const newContact = {\r\n"
    			+ "        contactId: contactId,\r\n"
    			+ "        contactName: contactName,\r\n"
    			+ "        contactEmail: contactEmail,\r\n"
    			+ "        contactNum: contactNum\r\n"
    			+ "    };\r\n"
    			+ "\r\n"
    			+ "    contacts.push(newContact);\r\n"
    			+ "\r\n"
    			+ "    displayContacts();\r\n"
    			+ "\r\n"
    			+ "    document.getElementById('contactId').value = '';\r\n"
    			+ "    document.getElementById('contactName').value = '';\r\n"
    			+ "    document.getElementById('contactEmail').value = '';\r\n"
    			+ "    document.getElementById('contactNum').value = '';\r\n"
    			+ "}\r\n"
    			+ "\r\n"
    			+ "function displayContacts() {\r\n"
    			+ "    const contactTableBody = document.getElementById('contactTableBody');\r\n"
    			+ "    contactTableBody.innerHTML = '';\r\n"
    			+ "\r\n"
    			+ "    contacts.forEach(contact => {\r\n"
    			+ "        const row = contactTableBody.insertRow();\r\n"
    			+ "        row.insertCell(0).textContent = contact.contactId;\r\n"
    			+ "        row.insertCell(1).textContent = contact.contactName;\r\n"
    			+ "        row.insertCell(2).textContent = contact.contactEmail;\r\n"
    			+ "        row.insertCell(3).textContent = contact.contactNum;\r\n"
    			+ "    });\r\n"
    			+ "}\r\n"
    			+ "         </script>\r\n"
    			+ "</body>\r\n"
    			+ "</html>\r\n"
    			+ " ";
        		
    }

	@GetMapping
	public List<ContactEntity> getAllContacts() {

		return contactService.getAllContacts();
	}

	@GetMapping("/{contactId}")
	public ContactEntity getContactById(@PathVariable Integer contactId) {
		return contactService.getContactById(contactId);
	}

	@PostMapping
	public String createContact(@RequestBody ContactEntity contact) {
		return contactService.saveContact(contact);
	}

	@PutMapping
	public String updateContact(@RequestBody ContactEntity contact) {
		return contactService.updateContact(contact);
	}

	@DeleteMapping("/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		return contactService.deleteContactById(contactId);
	}
}
