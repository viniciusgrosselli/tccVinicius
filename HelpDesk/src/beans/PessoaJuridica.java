/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Vinicius
 */
@Entity
public class PessoaJuridica extends Pessoa implements Serializable{
    
    @Column(length=17,nullable=true, unique = true)
    private String ie;
    @Column(length=18,nullable=true, unique = true)
    private String cnpj;
    
    public PessoaJuridica(){
        
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
    
}
