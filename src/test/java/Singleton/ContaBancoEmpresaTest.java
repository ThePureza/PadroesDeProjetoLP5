public class ContaBancoEmpresaTest {
    @Test

    public void deveRetornarNomeInstituicao() {

        ContaBancoEmpresa.getInstancia().setNomeInstituicao("Bradesco");
        AssertEquals("Bradesco", ContaBancoEmpresa.getInstancia().getNomeInstituicao());
    }

    public void deveRetornarConta() {

        ContaBancoEmpresa.getInstancia().setConta(1234123412341234);
        AssertEquals(1234123412341234, ContaBancoEmpresa.getInstancia().getConta());
    }

    public void deveRetornarAgencia() {

        ContaBancoEmpresa.getInstancia().setAgencia(1234);
        AssertEquals(1234, ContaBancoEmpresa.getInstancia().getAgencia());
    }

    public void deveRetornarNomeEmpresa() {

        ContaBancoEmpresa.getInstancia().setNomeEmpresa("Empresa Ltda");
        AssertEquals("Empresa Ltda", ContaBancoEmpresa.getInstancia().getNomeEmpresa());
    }

    public void deveRetornarCNPJ() {

        ContaBancoEmpresa.getInstancia().setCNPJ(12345678900000);
        AssertEquals(12345678900000, ContaBancoEmpresa.getInstancia().getCNPJ());
    }

    public void deveRetornarTipoConta() {

        ContaBancoEmpresa.getInstancia().setTipoConta("Conta Corrente");
        AssertEquals("Conta Corrente", ContaBancoEmpresa.getInstancia().getTipoConta());
    }
}