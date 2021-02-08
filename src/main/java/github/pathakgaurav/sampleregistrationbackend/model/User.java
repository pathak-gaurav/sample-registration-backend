package github.pathakgaurav.sampleregistrationbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private int experience;
    private String domain;

    public User(String name, String email, int experience, String domain) {
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.domain = domain;
    }
}
