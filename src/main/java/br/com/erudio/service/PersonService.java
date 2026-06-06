package br.com.erudio.service;

import java.util.concurrent.atomic.AtomicLong;

import br.com.erudio.model.Person;

public class PersonService implements IPersonService {

	@Override
	public Person createPerson(Person personVo) {
		if(personVo.getEmail() == null || personVo.getEmail().isBlank())
			throw new IllegalArgumentException("The Person e-mail is null or empty!");
		var id = new AtomicLong().incrementAndGet();
		personVo.setId(id);
		return personVo;
	}

}
