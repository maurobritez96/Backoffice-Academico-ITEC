package ar.com.backoffice.securirty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String lastName;
    private String dni;
    private String phone;
    private String email;
    private String password;
    private Role role;
}
