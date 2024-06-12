package com.liseth.angular.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_formulario;

    private String name;

    private Date date;

    private String text;

    private String category;

    private String gender;

    private String email;
}
