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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Vinicius
 */
@Entity
public class Equipamento implements Serializable{
    @Id
    @SequenceGenerator(name="SEQ",allocationSize=1,sequenceName="SEQ_ID_EQUIPAMENTO")
    @GeneratedValue(generator="SEQ", strategy= GenerationType.AUTO)
    private Integer id;
    @Column(length=100,nullable=false)
    private String descricao;
    @Column(length=40,nullable=false, unique=true)
    private String tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
