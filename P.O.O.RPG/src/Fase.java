//Interface que determina os metodos basicos para todas as fases

public interface Fase {
    public void iniciar(Heroi heroi);
    public boolean isConcluida();
    public String getTipoDeCenario(TipoCenario cenario);
}
