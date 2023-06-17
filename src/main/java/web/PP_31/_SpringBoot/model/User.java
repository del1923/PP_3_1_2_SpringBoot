package web.PP_31._SpringBoot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table( name = "users" )
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty( message = "Не пустое")
    @Size( min = 3, max = 20, message = "3...20 символов")
    @Column(name = "name")
    private String name;

    @NotEmpty( message = "Не пустое" )
    @Column(name = "surname")
    private String surName;

    @Min(value = 1, message = "1...100")
    @Max(value = 100, message = "1...100")
    @Column( name = "age")
    private int age;

    @Email(message = "формат: abc@defg.hi")
    @NotEmpty( message = "Не пустое" )
    @Column( name = "email")
    private String eMail;

    public User() {
    }

    public User( String name, String surName, int age, String eMail) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }
}
