package br.com.erudio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.erudio.model.Person;
import br.com.erudio.service.IPersonService;
import br.com.erudio.service.PersonService;

public class PersonServiceTest {
	
	IPersonService service;
	Person personVo;
	
	@BeforeEach
	void setup() {
		service = new PersonService();
		personVo = new Person(
				"Keith",
				"Moon",
				"kmoon@erudio.com.br",
				"Wembley - UK",
				"Male"
				);
	}

	@Test
	@DisplayName("When Create a Person with Success Should Return a Person Object")
	void testCreatePerson_WhenSuccess_ShouldReturnPersonObject() {
		Person actualVo = service.createPerson(personVo);
		
		assertNotNull(actualVo, () -> "The createPerson() should not have returned null!");
		assertNotNull(personVo.getId(), () -> "Person ID missing");
	}
	
	@Test
	@DisplayName("When Create a Person with Success Should Contains FirstName in Returned a Person Object")
	void testCreatePerson_WhenSuccess_ShouldContainsFirstNameInReturnedPersonObject() {
		Person actualVo = service.createPerson(personVo);
		
		assertEquals(personVo.getFirstName(), actualVo.getFirstName(), () -> "The FirstName is incorrect!");
	}
	@Test
	@DisplayName("When Create a Person with Success Should Contains LastName in Returned a Person Object")
	void testCreatePerson_WhenSuccess_ShouldContainsLastNameInReturnedPersonObject() {
		Person actualVo = service.createPerson(personVo);
		
		assertEquals(personVo.getLastName(), actualVo.getLastName(), () -> "The LastName is incorrect!");
	}
	
	@Test
	@DisplayName("When Create a Person with Success Should Contains Address in Returned a Person Object")
	void testCreatePerson_WhenSuccess_ShouldContainsAddressInReturnedPersonObject() {
		Person actualVo = service.createPerson(personVo);
		
		assertEquals(personVo.getAddress(), actualVo.getAddress(), () -> "The Address is incorrect!");
	}

	@Test
	@DisplayName("When Create a Person with Success Should Contains Gender in Returned a Person Object")
	void testCreatePerson_WhenSuccess_ShouldContainsGenderInReturnedPersonObject() {
		Person actualVo = service.createPerson(personVo);
		
		assertEquals(personVo.getGender(), actualVo.getGender(), () -> "The Gender is incorrect!");
	}
	
	@Test
	@DisplayName("When Create a Person with Success Should Contains Email in Returned a Person Object")
	void testCreatePerson_WhenSuccess_ShouldContainsEmailInReturnedPersonObject() {
		Person actualVo = service.createPerson(personVo);
		
		assertEquals(personVo.getEmail(), actualVo.getEmail(), () -> "The Email is incorrect!");
	}
	
	@Test
	@DisplayName("When Create a Person with null e-mail Should throw Exception")
	void testCreatePerson_WithNullEmail_ShouldThrowIllegalArgumentsException() {
		personVo.setEmail(null);

		String expectedMessage = "The Person e-mail is null or empty!";

		IllegalArgumentException exception =  assertThrows(IllegalArgumentException.class, 
				() -> service.createPerson(personVo), 
				() -> "Empty e-mail should hava cause an IllegalArgumentsException");

		assertEquals(
				expectedMessage, 
				exception.getMessage(),
				() -> "Exception error message is incorrect!");
	}
}
