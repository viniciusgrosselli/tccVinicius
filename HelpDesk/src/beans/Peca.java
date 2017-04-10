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
public class Peca implements Serializable{
    
    @Id
    @SequenceGenerator(name="SEQ",allocationSize=1,sequenceName="SEQ_ID_PECA")
    @GeneratedValue(generator="SEQ", strategy= GenerationType.AUTO)
    private Integer id;
    @Column(length=100,nullable=false)
    private String descricao;
    @Column(name="valor")
    private Double valor;
    @Column(length=40, nullable=false)
    private String garantia;
    @Column(length=40, nullable=false)
    private String marca;
    @ManyToOne(optional=false)
    @JoinColumn(name="Equipamento", referencedColumnName = "ID")
    private Equipamento equipamento;
    
    
    public Peca(){
        
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    
    
}
