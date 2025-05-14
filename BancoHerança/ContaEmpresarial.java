public class ContaEmpresarial extends Conta{

    private double chequeEspecial;
    private PessoaJuridica titular;
    
    public ContaEmpresarial(String senha, int numConta, PessoaJuridica titular, int agencia, double chequeEspecial) {
        super(senha, numConta, agencia);
        this.chequeEspecial = chequeEspecial;
        this.titular = titular;
    }

    public boolean sacar( double valor){
        if(valor <= super.getSaldo() + chequeEspecial && valor >0){
            super.SubtrairSaldo(valor);

            return true;

        }else{
            return false;
        }
    }

    public boolean trasferencia(Conta acao , double valor ){

        if(valor <= super.getSaldo() + chequeEspecial && valor >0){

            acao.AdicionarSaldo(valor);

            super.SubtrairSaldo(valor);

            return true;

        }else{
        return false;
         }  
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(long chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public PessoaJuridica getTitular() {
        return titular;
    }

    public void setTitular(PessoaJuridica titular) {
        this.titular = titular;
    }

}
