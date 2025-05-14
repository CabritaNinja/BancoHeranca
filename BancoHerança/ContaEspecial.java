public class ContaEspecial extends Conta{

    private double chequeEspecial;
    private PessoaFisica titular;

    
    public ContaEspecial(String senha, int numConta, PessoaFisica titular, int agencia, double chequeEspecial) {
        super(senha, numConta, agencia);
        this.chequeEspecial = chequeEspecial;
        this.titular = titular;
    }

    public boolean sacar( double valor){
        if(valor <= (super.getSaldo() + chequeEspecial) && valor >0){
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

    public PessoaFisica getTitular() {
        return titular;
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }

}
