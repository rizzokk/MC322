import java.util.ArrayList;

public class FaseDeCombate implements Fase {

	private int nivel;
	private TipoCenario ambiente;
	private ArrayList<Monstro> monstro;
	
	public FaseDeCombate(int nivel, TipoCenario ambiente) {
		this.nivel = nivel;
		this.ambiente = ambiente;
		this.monstro = new ArrayList<Monstro>();
	}

	public TipoCenario getAmbiente() {
		return ambiente;
	}

	public int getNivelFase() {
		return nivel;
	}

	public ArrayList<Monstro> getMonstros() {
		return monstro;
	}

	public boolean isConcluida() {
		if (!monstro.get(0).estaVivo(monstro.get(0))) {
			monstro.remove(monstro.get(0));
		}
		return monstro.isEmpty();
	}

	public void iniciar(Heroi heroi) {
		System.out.println("--------「" + ambiente + "」--------");
		System.out.println("\n");
		System.out.println(ambiente.getDescricao());
		System.out.println("\n");
		for (Monstro monstroAtual : monstro) {
			while (heroi.estaVivo(heroi) && monstroAtual.estaVivo(monstroAtual)) {
				System.out.println("Um " + monstroAtual.getNome() + " aparece!");
				heroi.escolherAcao(monstroAtual);
				if (monstroAtual.estaVivo(monstroAtual)) {
					monstroAtual.escolherAcao(heroi);
				}
				
				if (!heroi.estaVivo(heroi)) {
					System.out.println("O Monge foi derrotado...\n" +
					"\n--------「Game Over」--------\n");
				} 
				
				else if (!monstroAtual.estaVivo(monstroAtual)) {
					System.out.println("✺ O Monge derrotou o " + monstroAtual.getNome() + " e ganhou " + monstroAtual.getXpConcedido() + " de experiência ✺");
					heroi.ganharExperiencia(monstroAtual.getXpConcedido());
					if (heroi.setSorte() > 0.5) {
						heroi.equiparArma(monstroAtual.droparLoot());
					}
					else {
						System.out.println("O monstro não deixou nada para trás");
					}
				}
				
				System.out.println("\n");
				System.out.println("--------STATUS DO HEROI--------\n");
				heroi.exibirStatus();
				System.out.println("\n");
				System.out.println("--------STATUS DO MONSTRO--------\n");
				monstroAtual.exibirStatus();
				System.out.println("----------------------------------");
				System.out.println("\n");
				
			}
			if (!heroi.estaVivo(heroi)) {
				break;
			}	
		}
	}

	public String getTipoDeCenario(TipoCenario cenario) {
		return cenario.getDescricao();
	}

	public FaseDeCombate getFase(int nivel, TipoCenario ambiente) {
		FaseDeCombate fase = new FaseDeCombate(nivel, ambiente);
		for (int i = 0; i <= nivel + 1; i++) {
			if (i < 2) {
				Esqueleto esqueleto = new Esqueleto("esqueleto", 23, 3, 25);
				fase.monstro.add(esqueleto);
			}
			else if (2 <= i && i < 4) {
				Esqueleto esqueleto = new Esqueleto("esqueleto gigante", 110, 8, 75);
				fase.monstro.add(esqueleto);
			}
			else {
				Cultista cultista = new Cultista("Sombra", 100, 15, 100);
				fase.monstro.add(cultista);
			}
		}
		
		return fase;
	}

}
