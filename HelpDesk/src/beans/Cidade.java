/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Vinicius
 */
@Entity
public class Cidade implements Serializable{
    
    @Id
    @SequenceGenerator(name="SEQ",allocationSize=1,sequenceName="SEQ_ID_CIDADE")
    @GeneratedValue(generator="SEQ", strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(length=60,nullable=false)
    private String nome;
    @ManyToOne(optional=false)
    @JoinColumn(name="Estado", referencedColumnName = "ID")
    private Estado estado;
    
    public Cidade() {
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado Estado) {
        this.estado = Estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
