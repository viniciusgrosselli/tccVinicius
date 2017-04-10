/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;


/**
 *
 * @author Vinicius
 */
@Entity
public class PessoaFisica extends Pessoa implements Serializable{
   
    @Column(length=14,nullable=true,unique = true)
    private String cpf;
    @Column(length=10,nullable=true,unique = true)
    private String rg;
    
    public PessoaFisica(){
        
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
