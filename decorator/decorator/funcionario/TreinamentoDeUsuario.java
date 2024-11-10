
package decorator.funcionario;

public class TreinamentoDeUsuario extends DecoradorDeAtividade
{

    public TreinamentoDeUsuario(double nh, double vh) {
        super("Treinamento De Usuario", nh, vh);
    }

    private double facaAlgo(){
        return this.numeroDeHoras * this.valorHora;
    }

    @Override
    public double calculaSalario() {
        return ((this.numeroDeHoras * this.valorHora)
                + this.componente.calculaSalario());
    }
}