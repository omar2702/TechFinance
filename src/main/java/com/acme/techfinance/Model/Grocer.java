package com.acme.techfinance.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "grocers")
@Getter
@Setter

public class Grocer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String username;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String password;

    //Relationships:
    //    @OneToOne(mappedBy = "grocer")
    //            private Profile profile;
    //    @OneToMany(mappedBy = "grocer")
    //    List<Request> clients;

}

