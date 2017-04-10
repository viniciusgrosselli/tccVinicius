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
public class Servico implements Serializable{
    @Id
    @SequenceGenerator(name="SEQ",allocationSize=1,sequenceName="SEQ_ID_SERVICOS")
    @GeneratedValue(generator="SEQ", strategy= GenerationType.AUTO)
    private Integer id;
    @Column(length=100, nullable=false)
    private String descricao;
    @ManyToOne(optional=false)
    @JoinColumn(name="Equipamento", referencedColumnName = "ID")
    private Equipamento equipamento;
    @Column(name="valor")
    private Double valor;

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    
    public Servico(){
        
    }

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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
    
}
