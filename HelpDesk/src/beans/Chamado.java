/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author Vinicius
 */
@Entity
public class Chamado implements Serializable {

    @Id
    @SequenceGenerator(name = "SEQ", allocationSize = 1, sequenceName = "SEQ_ID_CHAMADO")
    @GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(length = 150, nullable = true)
    private String problema;
    @Column(length = 15, nullable = true)
    private String prioridade;
    @Column(length = 150, nullable = true)
    private String observacoes;
    @Column(length = 150, nullable = true)
    private String resolucao;
    @Column(length = 150, nullable = true)
    private String obspeca;
    @Column(length = 50, nullable = true)
    private String status = "Aberto";
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataMarcada;
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataAbertura;
    @Column(length = 100, nullable = true)
    private Double orcamento;
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataFechamento;
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataOrcamento;
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataAlteracao;
    @ManyToOne(optional = true)
    @JoinColumn(name = "Servico", referencedColumnName = "ID")
    private Servico servico;
    @ManyToOne(optional = true)
    @JoinColumn(name = "Peca", referencedColumnName = "ID")
    private Peca peca;
    @ManyToOne(optional = true)
    @JoinColumn(name = "Equipamento", referencedColumnName = "ID")
    private Equipamento equipamento;
    @ManyToOne(optional = true)
    @JoinColumn(name = "Pessoa", referencedColumnName = "ID")
    private Pessoa pessoa;
    @ManyToOne(optional = true)
    @JoinColumn(name = "Funcionario", referencedColumnName = "ID")
    private Funcionario funcionario;

    public Chamado() {

        super();
        dataAbertura = new Date();
        

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getObspeca() {
        return obspeca;
    }

    public void setObspeca(String obspeca) {
        this.obspeca = obspeca;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public void setDataOrcamento(Date dataOrcamento) {
        this.dataOrcamento = dataOrcamento;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Date getDataMarcada() {
        return dataMarcada;
    }

    public void setDataMarcada(Date dataMarcada) {
        this.dataMarcada = dataMarcada;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }
}
