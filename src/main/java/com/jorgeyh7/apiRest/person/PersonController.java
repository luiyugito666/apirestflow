package com.jorgeyh7.apiRest.person;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

        private final PersonService personService;

    @PostMapping
    public void createPerson(@RequestBody Person person  ){
        personService.createPerson(person);

    }



}
