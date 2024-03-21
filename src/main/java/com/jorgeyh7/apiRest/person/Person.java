package com.jorgeyh7.apiRest.person;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity()
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String firstName;
    private  String lastName;
    private String email;

}
