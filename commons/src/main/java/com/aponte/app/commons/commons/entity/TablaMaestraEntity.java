package com.aponte.app.commons.commons.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "tablamaestra")
public class TablaMaestraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idregistro")
    private Integer idRegistro;
    @Column(name = "clave1")
    private String clave1;
    @Column(name = "clave2")
    private String clave2;
    @Column(name = "clave3")
    private String clave3;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "idtablamaestra")
    private String idtablamaestra;
    @Column(name = "valor1")
    private String valor1;
    @Column(name = "valor2")
    private String valor2;
    @Column(name = "valor3")
    private String valor3;
    @Column(name = "descripcion")
    private String descripcion;

}
