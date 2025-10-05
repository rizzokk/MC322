//Ação de Combate para o monge

public class SocoVeloz implements AcaoDeCombate {
    private String nomeAtaque;
    public SocoVeloz(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public String getNome() {
        return nomeAtaque;
    }

    public void executar(Combatente usuario, Combatente alvo) {
        usuario.atacar(alvo);
    }

}
