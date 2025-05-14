public class ContaCorrente extends Conta{

    private PessoaFisica titular;

    public ContaCorrente(String senha, int numConta, PessoaFisica titular, int agencia) {
        super(senha, numConta, agencia);
        this.titular = titular;
    }

    public boolean sacar( double valor){
        if( super.getSaldo() - valor >= 0 && valor >0){
            super.SubtrairSaldo(valor);

            return true;

        }else{
            return false;
        }
    }

    public boolean trasferencia(Conta acao , double valor ){

        if( super.getSaldo() - valor > 0 && valor > 0){

            acao.AdicionarSaldo(valor);

            super.SubtrairSaldo(valor);

            return true;

        }else{
        return false;
         }  
    }

    public PessoaFisica getTitular() {
        return titular;
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }    

}
