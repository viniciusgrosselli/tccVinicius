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
public class Funcionario extends Pessoa implements Serializable{
    
    @Column(length=40,nullable=true)
    private String cargo;
    @Column(length=50,nullable=true)
    private String funcao;

    public String getCargo() {
        return cargo;
    }
    
    
    public Funcionario(){
        
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
    
}
