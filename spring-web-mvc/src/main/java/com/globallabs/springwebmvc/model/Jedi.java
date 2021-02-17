package com.globallabs.springwebmvc.model;

import android.arch.persistence.room.Entity;

import javax.persistense.Column;
import javax.persistense.Entity;
import javax.persistense.GeneratedValue;
import javax.persistense.GenerationType;
import javax.persistense.Id;
import javax.persistense.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Jedi {

@Entity
@Table(name = "jedi")
public class Jedi {

    @Id
    @Column(name = "id_jedi")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, max = 10, message = "Nome deve conter entre 3 e 10 caracteres")
    @NotBlank(message = "Nome não pode estar em branco")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Sobrenome não pode estar em branco")
    @Column(name = "last_name")
    private String lastName;

}
    public Jedi(final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId(){return id;}

    public void setId(final Long id) {this.id = id;}
}
