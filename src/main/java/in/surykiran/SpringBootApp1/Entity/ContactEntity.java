package in.surykiran.SpringBootApp1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
//@Table(name = "CONTACT_DTLS")
public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNum;

	public ContactEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactEntity(Integer contactId, String contactName, String contactEmail, Long contactNum) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactNum = contactNum;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactNum() {
		return contactNum;
	}

	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getContactId() {

		return contactId;
	}

	@Override
	public String toString() {
		return "ContactEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail="
				+ contactEmail + ", contactNum=" + contactNum + "]";
	}

}
