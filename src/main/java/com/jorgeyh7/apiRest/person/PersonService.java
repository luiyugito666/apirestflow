package com.jorgeyh7.apiRest.person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;


    public void createPerson(Person person){
        personRepository.save(person);

    }
}
