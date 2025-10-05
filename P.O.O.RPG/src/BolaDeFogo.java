//Ação de Combate para o mago

public class BolaDeFogo implements AcaoDeCombate {
    private String nomeAtaque;
    private int mana, danoBolaDeFogo;
    private double sorte;

    public BolaDeFogo(String nomeAtaque, int mana, double sorte, int danoBolaDeFogo) {
        this.nomeAtaque = nomeAtaque;
        this.mana = mana;
        this.sorte = sorte;
        this.danoBolaDeFogo = danoBolaDeFogo;
    }

    public String getNome() {
        return nomeAtaque;
    }

    public void executar(Combatente usuario, Combatente alvo) {
        if (mana > 0 && sorte > 0.2 && sorte <= 0.8) {
            System.out.println("O Mago abre seu grimorio e começa a conjurar um grande feitiço");
            System.out.println("Habataitara");
            System.out.println("Modoranai to itte");
            System.out.println("Mezashita no wa");
            System.err.println("Aoi aoi ano sora");
            System.out.println("Uma grande bola de fogo atinge os inimigos");
			alvo.receberDano(danoBolaDeFogo);
            mana--;
        }
        else if (mana > 0 && sorte <= 0.2) {
			System.out.println("O Mago tenta conjurar um feitiço, mas erra a pronúncia");
			System.out.println("O feitiço falha miseravelmente");
			System.out.println("O Mago acerta " + alvo.getNome() + " com o seu cajado");
			System.out.println(".............");
			System.out.println("Não parece muito efetivo");
			mana--;
		}
		else if (mana > 0 && sorte > 0.8) {
            System.out.println("O Mago abre seu grimorio e começa a conjurar um grande feitiço");
            System.out.println("Habataitara");
            System.out.println("Modoranai to itte");
            System.out.println("Mezashita no wa");
            System.err.println("Aoi aoi ano sora");
            System.out.println("Uma bola de fogo assustadoramente grande atinge os inimigos (dano crítico)");
			alvo.receberDano(danoBolaDeFogo*3);
			mana--;
		}
		else {
			System.out.println("A mana do Mago acabou...");
            System.out.println("O Mago acerta " + alvo.getNome() + " com o seu cajado");
            System.out.println(".............");
            System.out.println("Não parece muito efetivo");
			usuario.atacar(alvo);
        }
    }
}
