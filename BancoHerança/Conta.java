
abstract public class Conta {

     private String senha, banco;
     private int numConta, agencia;
     private double saldo;

     public Conta(String senha, String banco, int numConta, int agencia) {
        this.senha = senha;
        this.banco = banco;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

     public Conta(String senha, int numConta, int agencia) {
        this.senha = senha;
        this.banco = "";
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

     public String getSenha() {
         return senha;
     }

     public void setSenha(String senha) {
         this.senha = senha;
     }

     public int getNumConta() {
         return numConta;
     }

     public void setNumConta(int numConta) {
         this.numConta = numConta;
     }

     public int getAgencia() {
         return agencia;
     }

     public void setAgencia(int agencia) {
         this.agencia = agencia;
     }

     public double getSaldo() {
        return saldo;
    }

    public String getBanco() {
        return banco;
    }

     public void setBanco(String banco) {
         this.banco = banco;
     }

    public boolean depositar( double valor ){

        if(valor > 0){
        saldo = valor + saldo;
        return true;
        }else{
            return false;
        }
    }

    public void SubtrairSaldo(double valor){
        saldo = saldo - valor;
    }

    public void AdicionarSaldo(double valor){
        saldo = saldo + valor;
    }
     abstract public boolean sacar( double valor);
     abstract public boolean trasferencia(Conta acao , double valor );    
}
