package com.bosonit.EJ3.Teacher.infraestructure.DTOs;

import com.bosonit.EJ3.Person.domain.PersonaEnt;
import lombok.Data;

@Data
public class InputTeacherDTO {

    private String id_teacher;
    private PersonaEnt personaEnt;
    private String comments;
    private String branch;
}

