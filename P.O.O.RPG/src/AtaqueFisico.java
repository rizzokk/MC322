//Ação de Combate padrão de todos os Combatentes

public class AtaqueFisico implements AcaoDeCombate {
    private String nomeAtaque;

    public AtaqueFisico(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public String getNome() {
        return nomeAtaque;
    }

    public void executar(Combatente usuario, Combatente alvo) {
        System.out.println("O Cultista atinge o heroi com uma facada");
        usuario.atacar(alvo);
    }
}
