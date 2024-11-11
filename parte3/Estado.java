public abstract class Estado {

    protected String estado;


    public Estado solicita() {
        return this;
    }

    public  Estado cotacao() {
        return this;
    }

    public Estado encomenda() {
        return this;
    }

    public Estado entrega() {
        return this;
    }

    public Estado paga() {
        return this;
    }
    public Estado rejeita() {
        return this;
    }
    public Estado cancela() {
        return this;
    }
    public Estado arquiva() {
        return this;
    }

}
