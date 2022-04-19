public class ContaBancoEmpresa {
    //Padrao Singleton
    private ContaBancoEmpresa() {};

    private static ContaBancoEmpresa instancia = new ContaBancoEmpresa();

    public static ContaBancoEmpresa getInstancia() {
        return instancia;
    }

    private String nomeInstituicao;
    private Integer conta;
    private Integer agencia;
    private String nomeEmpresa;
    private Integer cnpj;
    private String tipoConta;

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}