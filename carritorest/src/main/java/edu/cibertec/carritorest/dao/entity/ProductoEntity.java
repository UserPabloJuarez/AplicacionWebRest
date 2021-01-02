package edu.cibertec.carritorest.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class ProductoEntity {

    @Id
    @Column(name = "idproducto")
    int idProducto;
    @NotNull
    @Column(name = "nomproducto")
    String nomProducto;
    @NotNull
    @OneToOne
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    CategoriaEntity categoria;
    @NotNull
    @Column(name = "preproducto")
    double preProducto;
    @Column(name = "antpreproducto")
    double antPreProducto;
    @Column(name = "nueproducto")
    int nueProducto;
    @Column(name = "imgproducto")
    String imgProducto;
}
