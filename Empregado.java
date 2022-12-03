package ProjetoSemana7;

public class Empregado {

    private String primeiroNome, sobrenome;
    private float salarioMensal, salarioAnual, salarioAnualReajustado;

    public Empregado(String primeiroNome, String sobrenome, float salarioMensal)
    {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public float salarioAnual() {
        float salarioAnual = this.salarioMensal * 12;
        return salarioAnual;
    }

       public float salarioAnualReajustado() {
        float salarioAnualReajustado = salarioAnual() * 1.1f;
        return salarioAnualReajustado;
    }
       
       /*Sei que este método não foi solicitado no enunciado, mas utilizei 
       com a intenção de simplificar o código.*/
       public String nomeCompleto() {
           String nomeCompleto = this.primeiroNome + " " + this.sobrenome;
           return nomeCompleto;
       }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0.0f;
        } else {
            this.salarioMensal = salarioMensal;
        }

    }
}
