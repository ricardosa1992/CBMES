/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "safo_funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SafoFuncionario.findAll", query = "SELECT s FROM SafoFuncionario s"),
    @NamedQuery(name = "SafoFuncionario.findByIdfuncionario", query = "SELECT s FROM SafoFuncionario s WHERE s.idfuncionario = :idfuncionario"),
    @NamedQuery(name = "SafoFuncionario.findByDataUltAlteracao", query = "SELECT s FROM SafoFuncionario s WHERE s.dataUltAlteracao = :dataUltAlteracao"),
    @NamedQuery(name = "SafoFuncionario.findByUsuarioUltAlteracao", query = "SELECT s FROM SafoFuncionario s WHERE s.usuarioUltAlteracao = :usuarioUltAlteracao"),
    @NamedQuery(name = "SafoFuncionario.findByVersao", query = "SELECT s FROM SafoFuncionario s WHERE s.versao = :versao"),
    @NamedQuery(name = "SafoFuncionario.findByAtivo", query = "SELECT s FROM SafoFuncionario s WHERE s.ativo = :ativo"),
    @NamedQuery(name = "SafoFuncionario.findByCelular", query = "SELECT s FROM SafoFuncionario s WHERE s.celular = :celular"),
    @NamedQuery(name = "SafoFuncionario.findByCidadeNascimento", query = "SELECT s FROM SafoFuncionario s WHERE s.cidadeNascimento = :cidadeNascimento"),
    @NamedQuery(name = "SafoFuncionario.findByCpf", query = "SELECT s FROM SafoFuncionario s WHERE s.cpf = :cpf"),
    @NamedQuery(name = "SafoFuncionario.findByAgenciaContaBanco", query = "SELECT s FROM SafoFuncionario s WHERE s.agenciaContaBanco = :agenciaContaBanco"),
    @NamedQuery(name = "SafoFuncionario.findByBancoContaBanco", query = "SELECT s FROM SafoFuncionario s WHERE s.bancoContaBanco = :bancoContaBanco"),
    @NamedQuery(name = "SafoFuncionario.findByBancoPisPasep", query = "SELECT s FROM SafoFuncionario s WHERE s.bancoPisPasep = :bancoPisPasep"),
    @NamedQuery(name = "SafoFuncionario.findByContaContaBanco", query = "SELECT s FROM SafoFuncionario s WHERE s.contaContaBanco = :contaContaBanco"),
    @NamedQuery(name = "SafoFuncionario.findByDataPisPasep", query = "SELECT s FROM SafoFuncionario s WHERE s.dataPisPasep = :dataPisPasep"),
    @NamedQuery(name = "SafoFuncionario.findByGeraPasep", query = "SELECT s FROM SafoFuncionario s WHERE s.geraPasep = :geraPasep"),
    @NamedQuery(name = "SafoFuncionario.findByNumeroPisPasep", query = "SELECT s FROM SafoFuncionario s WHERE s.numeroPisPasep = :numeroPisPasep"),
    @NamedQuery(name = "SafoFuncionario.findByTipoPagamentoContaBanco", query = "SELECT s FROM SafoFuncionario s WHERE s.tipoPagamentoContaBanco = :tipoPagamentoContaBanco"),
    @NamedQuery(name = "SafoFuncionario.findByDataIncorporacao", query = "SELECT s FROM SafoFuncionario s WHERE s.dataIncorporacao = :dataIncorporacao"),
    @NamedQuery(name = "SafoFuncionario.findByDataNascimento", query = "SELECT s FROM SafoFuncionario s WHERE s.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "SafoFuncionario.findByCategoriacnh", query = "SELECT s FROM SafoFuncionario s WHERE s.categoriacnh = :categoriacnh"),
    @NamedQuery(name = "SafoFuncionario.findByDatactpsidentidadep", query = "SELECT s FROM SafoFuncionario s WHERE s.datactpsidentidadep = :datactpsidentidadep"),
    @NamedQuery(name = "SafoFuncionario.findByDataCarteiraProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.dataCarteiraProfissional = :dataCarteiraProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByDataEmissaocnh", query = "SELECT s FROM SafoFuncionario s WHERE s.dataEmissaocnh = :dataEmissaocnh"),
    @NamedQuery(name = "SafoFuncionario.findByDataExpedicaoDocumentom", query = "SELECT s FROM SafoFuncionario s WHERE s.dataExpedicaoDocumentom = :dataExpedicaoDocumentom"),
    @NamedQuery(name = "SafoFuncionario.findByDataExpedicaorg", query = "SELECT s FROM SafoFuncionario s WHERE s.dataExpedicaorg = :dataExpedicaorg"),
    @NamedQuery(name = "SafoFuncionario.findByNumerocnh", query = "SELECT s FROM SafoFuncionario s WHERE s.numerocnh = :numerocnh"),
    @NamedQuery(name = "SafoFuncionario.findByNumeroCarteiraProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.numeroCarteiraProfissional = :numeroCarteiraProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByNumeroIdentidadeProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.numeroIdentidadeProfissional = :numeroIdentidadeProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByNumerorg", query = "SELECT s FROM SafoFuncionario s WHERE s.numerorg = :numerorg"),
    @NamedQuery(name = "SafoFuncionario.findByNumeroTituloEleitor", query = "SELECT s FROM SafoFuncionario s WHERE s.numeroTituloEleitor = :numeroTituloEleitor"),
    @NamedQuery(name = "SafoFuncionario.findByOrgaoExpeditorrg", query = "SELECT s FROM SafoFuncionario s WHERE s.orgaoExpeditorrg = :orgaoExpeditorrg"),
    @NamedQuery(name = "SafoFuncionario.findBySecaoTituloEleitor", query = "SELECT s FROM SafoFuncionario s WHERE s.secaoTituloEleitor = :secaoTituloEleitor"),
    @NamedQuery(name = "SafoFuncionario.findBySerieCarteiraProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.serieCarteiraProfissional = :serieCarteiraProfissional"),
    @NamedQuery(name = "SafoFuncionario.findBySerieIdentidadeProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.serieIdentidadeProfissional = :serieIdentidadeProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByTipoIdentidadeProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.tipoIdentidadeProfissional = :tipoIdentidadeProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByTiporg", query = "SELECT s FROM SafoFuncionario s WHERE s.tiporg = :tiporg"),
    @NamedQuery(name = "SafoFuncionario.findByUfcnh", query = "SELECT s FROM SafoFuncionario s WHERE s.ufcnh = :ufcnh"),
    @NamedQuery(name = "SafoFuncionario.findByUfCarteiraProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.ufCarteiraProfissional = :ufCarteiraProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByUfIdentidadeProfissional", query = "SELECT s FROM SafoFuncionario s WHERE s.ufIdentidadeProfissional = :ufIdentidadeProfissional"),
    @NamedQuery(name = "SafoFuncionario.findByUfrg", query = "SELECT s FROM SafoFuncionario s WHERE s.ufrg = :ufrg"),
    @NamedQuery(name = "SafoFuncionario.findByUfTituloEleitor", query = "SELECT s FROM SafoFuncionario s WHERE s.ufTituloEleitor = :ufTituloEleitor"),
    @NamedQuery(name = "SafoFuncionario.findByValidadecnh", query = "SELECT s FROM SafoFuncionario s WHERE s.validadecnh = :validadecnh"),
    @NamedQuery(name = "SafoFuncionario.findByZonaTituloEleitor", query = "SELECT s FROM SafoFuncionario s WHERE s.zonaTituloEleitor = :zonaTituloEleitor"),
    @NamedQuery(name = "SafoFuncionario.findByEmail", query = "SELECT s FROM SafoFuncionario s WHERE s.email = :email"),
    @NamedQuery(name = "SafoFuncionario.findByEstadoCivil", query = "SELECT s FROM SafoFuncionario s WHERE s.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "SafoFuncionario.findByFone", query = "SELECT s FROM SafoFuncionario s WHERE s.fone = :fone"),
    @NamedQuery(name = "SafoFuncionario.findByGrupoSanguineo", query = "SELECT s FROM SafoFuncionario s WHERE s.grupoSanguineo = :grupoSanguineo"),
    @NamedQuery(name = "SafoFuncionario.findByAnoPrimeiroEmprego", query = "SELECT s FROM SafoFuncionario s WHERE s.anoPrimeiroEmprego = :anoPrimeiroEmprego"),
    @NamedQuery(name = "SafoFuncionario.findByDataCenso", query = "SELECT s FROM SafoFuncionario s WHERE s.dataCenso = :dataCenso"),
    @NamedQuery(name = "SafoFuncionario.findByDataInatividade", query = "SELECT s FROM SafoFuncionario s WHERE s.dataInatividade = :dataInatividade"),
    @NamedQuery(name = "SafoFuncionario.findByEscolaridade", query = "SELECT s FROM SafoFuncionario s WHERE s.escolaridade = :escolaridade"),
    @NamedQuery(name = "SafoFuncionario.findByExisteTempoAverbado", query = "SELECT s FROM SafoFuncionario s WHERE s.existeTempoAverbado = :existeTempoAverbado"),
    @NamedQuery(name = "SafoFuncionario.findByMotivoInatividade", query = "SELECT s FROM SafoFuncionario s WHERE s.motivoInatividade = :motivoInatividade"),
    @NamedQuery(name = "SafoFuncionario.findByUfEmpregoAnterior", query = "SELECT s FROM SafoFuncionario s WHERE s.ufEmpregoAnterior = :ufEmpregoAnterior"),
    @NamedQuery(name = "SafoFuncionario.findByNacionalidade", query = "SELECT s FROM SafoFuncionario s WHERE s.nacionalidade = :nacionalidade"),
    @NamedQuery(name = "SafoFuncionario.findByNome", query = "SELECT s FROM SafoFuncionario s WHERE s.nome = :nome"),
    @NamedQuery(name = "SafoFuncionario.findByNomeGuerra", query = "SELECT s FROM SafoFuncionario s WHERE s.nomeGuerra = :nomeGuerra"),
    @NamedQuery(name = "SafoFuncionario.findByNomeMae", query = "SELECT s FROM SafoFuncionario s WHERE s.nomeMae = :nomeMae"),
    @NamedQuery(name = "SafoFuncionario.findByNomePai", query = "SELECT s FROM SafoFuncionario s WHERE s.nomePai = :nomePai"),
    @NamedQuery(name = "SafoFuncionario.findByNumeroFuncional", query = "SELECT s FROM SafoFuncionario s WHERE s.numeroFuncional = :numeroFuncional"),
    @NamedQuery(name = "SafoFuncionario.findByPaisNascimento", query = "SELECT s FROM SafoFuncionario s WHERE s.paisNascimento = :paisNascimento"),
    @NamedQuery(name = "SafoFuncionario.findByProntuariohpm", query = "SELECT s FROM SafoFuncionario s WHERE s.prontuariohpm = :prontuariohpm"),
    @NamedQuery(name = "SafoFuncionario.findByRacaCor", query = "SELECT s FROM SafoFuncionario s WHERE s.racaCor = :racaCor"),
    @NamedQuery(name = "SafoFuncionario.findBySexo", query = "SELECT s FROM SafoFuncionario s WHERE s.sexo = :sexo"),
    @NamedQuery(name = "SafoFuncionario.findByTipoCadastro", query = "SELECT s FROM SafoFuncionario s WHERE s.tipoCadastro = :tipoCadastro"),
    @NamedQuery(name = "SafoFuncionario.findByUfNascimento", query = "SELECT s FROM SafoFuncionario s WHERE s.ufNascimento = :ufNascimento"),
    @NamedQuery(name = "SafoFuncionario.findByPostoGraduacao", query = "SELECT s FROM SafoFuncionario s WHERE s.postoGraduacao = :postoGraduacao")})
public class SafoFuncionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfuncionario")
    private Integer idfuncionario;
    @Basic(optional = false)
    @Column(name = "data_ult_alteracao")
    @Temporal(TemporalType.DATE)
    private Date dataUltAlteracao;
    @Basic(optional = false)
    @Column(name = "usuario_ult_alteracao")
    private String usuarioUltAlteracao;
    @Basic(optional = false)
    @Column(name = "versao")
    private int versao;
    @Column(name = "ativo")
    private String ativo;
    @Column(name = "celular")
    private String celular;
    @Column(name = "cidade_nascimento")
    private String cidadeNascimento;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "agencia_conta_banco")
    private String agenciaContaBanco;
    @Column(name = "banco_conta_banco")
    private String bancoContaBanco;
    @Column(name = "banco_pis_pasep")
    private String bancoPisPasep;
    @Column(name = "conta_conta_banco")
    private String contaContaBanco;
    @Column(name = "data_pis_pasep")
    @Temporal(TemporalType.DATE)
    private Date dataPisPasep;
    @Column(name = "gera_pasep")
    private String geraPasep;
    @Column(name = "numero_pis_pasep")
    private String numeroPisPasep;
    @Column(name = "tipo_pagamento_conta_banco")
    private String tipoPagamentoContaBanco;
    @Column(name = "data_incorporacao")
    @Temporal(TemporalType.DATE)
    private Date dataIncorporacao;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "categoriacnh")
    private String categoriacnh;
    @Column(name = "datactpsidentidadep")
    @Temporal(TemporalType.DATE)
    private Date datactpsidentidadep;
    @Column(name = "data_carteira_profissional")
    @Temporal(TemporalType.DATE)
    private Date dataCarteiraProfissional;
    @Column(name = "data_emissaocnh")
    @Temporal(TemporalType.DATE)
    private Date dataEmissaocnh;
    @Column(name = "data_expedicao_documentom")
    @Temporal(TemporalType.DATE)
    private Date dataExpedicaoDocumentom;
    @Column(name = "data_expedicaorg")
    @Temporal(TemporalType.DATE)
    private Date dataExpedicaorg;
    @Column(name = "numerocnh")
    private String numerocnh;
    @Column(name = "numero_carteira_profissional")
    private String numeroCarteiraProfissional;
    @Column(name = "numero_identidade_profissional")
    private String numeroIdentidadeProfissional;
    @Basic(optional = false)
    @Column(name = "numerorg")
    private String numerorg;
    @Column(name = "numero_titulo_eleitor")
    private String numeroTituloEleitor;
    @Column(name = "orgao_expeditorrg")
    private String orgaoExpeditorrg;
    @Column(name = "secao_titulo_eleitor")
    private String secaoTituloEleitor;
    @Column(name = "serie_carteira_profissional")
    private String serieCarteiraProfissional;
    @Column(name = "serie_identidade_profissional")
    private String serieIdentidadeProfissional;
    @Column(name = "tipo_identidade_profissional")
    private String tipoIdentidadeProfissional;
    @Column(name = "tiporg")
    private String tiporg;
    @Column(name = "ufcnh")
    private String ufcnh;
    @Column(name = "uf_carteira_profissional")
    private String ufCarteiraProfissional;
    @Column(name = "uf_identidade_profissional")
    private String ufIdentidadeProfissional;
    @Column(name = "ufrg")
    private String ufrg;
    @Column(name = "uf_titulo_eleitor")
    private String ufTituloEleitor;
    @Column(name = "validadecnh")
    @Temporal(TemporalType.DATE)
    private Date validadecnh;
    @Column(name = "zona_titulo_eleitor")
    private String zonaTituloEleitor;
    @Column(name = "email")
    private String email;
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "fone")
    private String fone;
    @Column(name = "grupo_sanguineo")
    private String grupoSanguineo;
    @Column(name = "ano_primeiro_emprego")
    private String anoPrimeiroEmprego;
    @Column(name = "data_censo")
    @Temporal(TemporalType.DATE)
    private Date dataCenso;
    @Column(name = "data_inatividade")
    @Temporal(TemporalType.DATE)
    private Date dataInatividade;
    @Column(name = "escolaridade")
    private String escolaridade;
    @Column(name = "existe_tempo_averbado")
    private String existeTempoAverbado;
    @Column(name = "motivo_inatividade")
    private String motivoInatividade;
    @Column(name = "uf_emprego_anterior")
    private String ufEmpregoAnterior;
    @Column(name = "nacionalidade")
    private String nacionalidade;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "nome_guerra")
    private String nomeGuerra;
    @Column(name = "nome_mae")
    private String nomeMae;
    @Column(name = "nome_pai")
    private String nomePai;
    @Basic(optional = false)
    @Column(name = "numero_funcional")
    private String numeroFuncional;
    @Column(name = "pais_nascimento")
    private String paisNascimento;
    @Column(name = "prontuariohpm")
    private String prontuariohpm;
    @Column(name = "raca_cor")
    private String racaCor;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "tipo_cadastro")
    private String tipoCadastro;
    @Column(name = "uf_nascimento")
    private String ufNascimento;
    @Column(name = "posto_graduacao")
    private Integer postoGraduacao;
    @JoinColumn(name = "idlotacao", referencedColumnName = "idlotacao")
    @ManyToOne(optional = false)
    private SafoLotacao idlotacao;
    @JoinColumn(name = "idpostograducao", referencedColumnName = "idpostograducao")
    @ManyToOne(optional = false)
    private SafoPostoGraducao idpostograducao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "safoIdfuncionario")
    private List<Militar> militarList;

    public SafoFuncionario() {
    }

    public SafoFuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public SafoFuncionario(Integer idfuncionario, Date dataUltAlteracao, String usuarioUltAlteracao, int versao, String numerorg, String nome, String numeroFuncional) {
        this.idfuncionario = idfuncionario;
        this.dataUltAlteracao = dataUltAlteracao;
        this.usuarioUltAlteracao = usuarioUltAlteracao;
        this.versao = versao;
        this.numerorg = numerorg;
        this.nome = nome;
        this.numeroFuncional = numeroFuncional;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Date getDataUltAlteracao() {
        return dataUltAlteracao;
    }

    public void setDataUltAlteracao(Date dataUltAlteracao) {
        this.dataUltAlteracao = dataUltAlteracao;
    }

    public String getUsuarioUltAlteracao() {
        return usuarioUltAlteracao;
    }

    public void setUsuarioUltAlteracao(String usuarioUltAlteracao) {
        this.usuarioUltAlteracao = usuarioUltAlteracao;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgenciaContaBanco() {
        return agenciaContaBanco;
    }

    public void setAgenciaContaBanco(String agenciaContaBanco) {
        this.agenciaContaBanco = agenciaContaBanco;
    }

    public String getBancoContaBanco() {
        return bancoContaBanco;
    }

    public void setBancoContaBanco(String bancoContaBanco) {
        this.bancoContaBanco = bancoContaBanco;
    }

    public String getBancoPisPasep() {
        return bancoPisPasep;
    }

    public void setBancoPisPasep(String bancoPisPasep) {
        this.bancoPisPasep = bancoPisPasep;
    }

    public String getContaContaBanco() {
        return contaContaBanco;
    }

    public void setContaContaBanco(String contaContaBanco) {
        this.contaContaBanco = contaContaBanco;
    }

    public Date getDataPisPasep() {
        return dataPisPasep;
    }

    public void setDataPisPasep(Date dataPisPasep) {
        this.dataPisPasep = dataPisPasep;
    }

    public String getGeraPasep() {
        return geraPasep;
    }

    public void setGeraPasep(String geraPasep) {
        this.geraPasep = geraPasep;
    }

    public String getNumeroPisPasep() {
        return numeroPisPasep;
    }

    public void setNumeroPisPasep(String numeroPisPasep) {
        this.numeroPisPasep = numeroPisPasep;
    }

    public String getTipoPagamentoContaBanco() {
        return tipoPagamentoContaBanco;
    }

    public void setTipoPagamentoContaBanco(String tipoPagamentoContaBanco) {
        this.tipoPagamentoContaBanco = tipoPagamentoContaBanco;
    }

    public Date getDataIncorporacao() {
        return dataIncorporacao;
    }

    public void setDataIncorporacao(Date dataIncorporacao) {
        this.dataIncorporacao = dataIncorporacao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCategoriacnh() {
        return categoriacnh;
    }

    public void setCategoriacnh(String categoriacnh) {
        this.categoriacnh = categoriacnh;
    }

    public Date getDatactpsidentidadep() {
        return datactpsidentidadep;
    }

    public void setDatactpsidentidadep(Date datactpsidentidadep) {
        this.datactpsidentidadep = datactpsidentidadep;
    }

    public Date getDataCarteiraProfissional() {
        return dataCarteiraProfissional;
    }

    public void setDataCarteiraProfissional(Date dataCarteiraProfissional) {
        this.dataCarteiraProfissional = dataCarteiraProfissional;
    }

    public Date getDataEmissaocnh() {
        return dataEmissaocnh;
    }

    public void setDataEmissaocnh(Date dataEmissaocnh) {
        this.dataEmissaocnh = dataEmissaocnh;
    }

    public Date getDataExpedicaoDocumentom() {
        return dataExpedicaoDocumentom;
    }

    public void setDataExpedicaoDocumentom(Date dataExpedicaoDocumentom) {
        this.dataExpedicaoDocumentom = dataExpedicaoDocumentom;
    }

    public Date getDataExpedicaorg() {
        return dataExpedicaorg;
    }

    public void setDataExpedicaorg(Date dataExpedicaorg) {
        this.dataExpedicaorg = dataExpedicaorg;
    }

    public String getNumerocnh() {
        return numerocnh;
    }

    public void setNumerocnh(String numerocnh) {
        this.numerocnh = numerocnh;
    }

    public String getNumeroCarteiraProfissional() {
        return numeroCarteiraProfissional;
    }

    public void setNumeroCarteiraProfissional(String numeroCarteiraProfissional) {
        this.numeroCarteiraProfissional = numeroCarteiraProfissional;
    }

    public String getNumeroIdentidadeProfissional() {
        return numeroIdentidadeProfissional;
    }

    public void setNumeroIdentidadeProfissional(String numeroIdentidadeProfissional) {
        this.numeroIdentidadeProfissional = numeroIdentidadeProfissional;
    }

    public String getNumerorg() {
        return numerorg;
    }

    public void setNumerorg(String numerorg) {
        this.numerorg = numerorg;
    }

    public String getNumeroTituloEleitor() {
        return numeroTituloEleitor;
    }

    public void setNumeroTituloEleitor(String numeroTituloEleitor) {
        this.numeroTituloEleitor = numeroTituloEleitor;
    }

    public String getOrgaoExpeditorrg() {
        return orgaoExpeditorrg;
    }

    public void setOrgaoExpeditorrg(String orgaoExpeditorrg) {
        this.orgaoExpeditorrg = orgaoExpeditorrg;
    }

    public String getSecaoTituloEleitor() {
        return secaoTituloEleitor;
    }

    public void setSecaoTituloEleitor(String secaoTituloEleitor) {
        this.secaoTituloEleitor = secaoTituloEleitor;
    }

    public String getSerieCarteiraProfissional() {
        return serieCarteiraProfissional;
    }

    public void setSerieCarteiraProfissional(String serieCarteiraProfissional) {
        this.serieCarteiraProfissional = serieCarteiraProfissional;
    }

    public String getSerieIdentidadeProfissional() {
        return serieIdentidadeProfissional;
    }

    public void setSerieIdentidadeProfissional(String serieIdentidadeProfissional) {
        this.serieIdentidadeProfissional = serieIdentidadeProfissional;
    }

    public String getTipoIdentidadeProfissional() {
        return tipoIdentidadeProfissional;
    }

    public void setTipoIdentidadeProfissional(String tipoIdentidadeProfissional) {
        this.tipoIdentidadeProfissional = tipoIdentidadeProfissional;
    }

    public String getTiporg() {
        return tiporg;
    }

    public void setTiporg(String tiporg) {
        this.tiporg = tiporg;
    }

    public String getUfcnh() {
        return ufcnh;
    }

    public void setUfcnh(String ufcnh) {
        this.ufcnh = ufcnh;
    }

    public String getUfCarteiraProfissional() {
        return ufCarteiraProfissional;
    }

    public void setUfCarteiraProfissional(String ufCarteiraProfissional) {
        this.ufCarteiraProfissional = ufCarteiraProfissional;
    }

    public String getUfIdentidadeProfissional() {
        return ufIdentidadeProfissional;
    }

    public void setUfIdentidadeProfissional(String ufIdentidadeProfissional) {
        this.ufIdentidadeProfissional = ufIdentidadeProfissional;
    }

    public String getUfrg() {
        return ufrg;
    }

    public void setUfrg(String ufrg) {
        this.ufrg = ufrg;
    }

    public String getUfTituloEleitor() {
        return ufTituloEleitor;
    }

    public void setUfTituloEleitor(String ufTituloEleitor) {
        this.ufTituloEleitor = ufTituloEleitor;
    }

    public Date getValidadecnh() {
        return validadecnh;
    }

    public void setValidadecnh(Date validadecnh) {
        this.validadecnh = validadecnh;
    }

    public String getZonaTituloEleitor() {
        return zonaTituloEleitor;
    }

    public void setZonaTituloEleitor(String zonaTituloEleitor) {
        this.zonaTituloEleitor = zonaTituloEleitor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAnoPrimeiroEmprego() {
        return anoPrimeiroEmprego;
    }

    public void setAnoPrimeiroEmprego(String anoPrimeiroEmprego) {
        this.anoPrimeiroEmprego = anoPrimeiroEmprego;
    }

    public Date getDataCenso() {
        return dataCenso;
    }

    public void setDataCenso(Date dataCenso) {
        this.dataCenso = dataCenso;
    }

    public Date getDataInatividade() {
        return dataInatividade;
    }

    public void setDataInatividade(Date dataInatividade) {
        this.dataInatividade = dataInatividade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getExisteTempoAverbado() {
        return existeTempoAverbado;
    }

    public void setExisteTempoAverbado(String existeTempoAverbado) {
        this.existeTempoAverbado = existeTempoAverbado;
    }

    public String getMotivoInatividade() {
        return motivoInatividade;
    }

    public void setMotivoInatividade(String motivoInatividade) {
        this.motivoInatividade = motivoInatividade;
    }

    public String getUfEmpregoAnterior() {
        return ufEmpregoAnterior;
    }

    public void setUfEmpregoAnterior(String ufEmpregoAnterior) {
        this.ufEmpregoAnterior = ufEmpregoAnterior;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNumeroFuncional() {
        return numeroFuncional;
    }

    public void setNumeroFuncional(String numeroFuncional) {
        this.numeroFuncional = numeroFuncional;
    }

    public String getPaisNascimento() {
        return paisNascimento;
    }

    public void setPaisNascimento(String paisNascimento) {
        this.paisNascimento = paisNascimento;
    }

    public String getProntuariohpm() {
        return prontuariohpm;
    }

    public void setProntuariohpm(String prontuariohpm) {
        this.prontuariohpm = prontuariohpm;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(String tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public String getUfNascimento() {
        return ufNascimento;
    }

    public void setUfNascimento(String ufNascimento) {
        this.ufNascimento = ufNascimento;
    }

    public Integer getPostoGraduacao() {
        return postoGraduacao;
    }

    public void setPostoGraduacao(Integer postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
    }

    public SafoLotacao getIdlotacao() {
        return idlotacao;
    }

    public void setIdlotacao(SafoLotacao idlotacao) {
        this.idlotacao = idlotacao;
    }

    public SafoPostoGraducao getIdpostograducao() {
        return idpostograducao;
    }

    public void setIdpostograducao(SafoPostoGraducao idpostograducao) {
        this.idpostograducao = idpostograducao;
    }

    @XmlTransient
    public List<Militar> getMilitarList() {
        return militarList;
    }

    public void setMilitarList(List<Militar> militarList) {
        this.militarList = militarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncionario != null ? idfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SafoFuncionario)) {
            return false;
        }
        SafoFuncionario other = (SafoFuncionario) object;
        if ((this.idfuncionario == null && other.idfuncionario != null) || (this.idfuncionario != null && !this.idfuncionario.equals(other.idfuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.SafoFuncionario[ idfuncionario=" + idfuncionario + " ]";
    }
    
}
