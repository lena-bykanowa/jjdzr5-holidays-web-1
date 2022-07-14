package org.isa.holidaysweb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.isa.holidaysweb.enity.Departament;

import java.util.UUID;

@Data
@NoArgsConstructor
public class CreateUserDetailsDto {
    private String firstName;
    private String lastName;
    private Departament departament;
    private UUID userId;

    public CreateUserDetailsDto(String firstName, String lastName, Departament departament, UUID userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departament = departament;
        this.userId = userId;
    }

}
