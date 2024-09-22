package com.example.APIRest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "Dopmicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Calle")
    private String calle;
    @Column(name = "Numero")
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "localidad")
    private Localidad localidad;
}