package in.surykiran.SpringBootApp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.surykiran.SpringBootApp1.Controller.ContactController;
import in.surykiran.SpringBootApp1.Entity.ContactEntity;

public interface ContactRepo extends JpaRepository<ContactEntity, Integer>
{

	ContactEntity save(ContactEntity contact);

	

}
