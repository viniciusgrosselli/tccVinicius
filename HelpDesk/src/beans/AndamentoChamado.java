/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Vinicius
 */
@Entity
public class AndamentoChamado implements Serializable{
    
    @Id
    @SequenceGenerator(name="SEQ",allocationSize=1,sequenceName="SEQ_ID_CIDADE")
    @GeneratedValue(generator="SEQ", strategy= GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date data;
    @ManyToOne(optional=false)
    @JoinColumn(name="Chamado", referencedColumnName = "ID")
    private Chamado chamado;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEnvioEmail;

    public AndamentoChamado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }

    public Date getDataEnvioEmail() {
        return dataEnvioEmail;
    }

    public void setDataEnvioEmail(Date dataEnvioEmail) {
        this.dataEnvioEmail = dataEnvioEmail;
    }
    
    
}
