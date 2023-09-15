package com.github.bb9leko.foods.cadastro;

import java.math.BigDecimal;

import org.hibernate.annotations.ManyToAny;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prato")
public class Prato extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id; 

    public String name; 

    public String descricao; 

    @ManyToOne
    public Restaurante restaurante; 

    public BigDecimal preco;
    
}
