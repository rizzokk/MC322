// Classe principal do RPG.
// Responsável por iniciar o jogo, criar personagens, monstros e controlar o fluxo da batalha.
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		//Mago mago = new Mago("Severus Snape", 800, 15, 1, 0);
		Monge monge = new Monge("Shang Chi", 170, 20, 1, 0);

		ArrayList<Fase> fases = ConstrutorDeCenario.gerarFases(10);

		
		System.out.println(
		  "Era uma noite escura, o céu estava coberto de nuvens e a lua não podia ser vista,\n"
		+ "a única luz vinha das tochas que o nosso herói carregava. Nessa noite,\n"
		+ "o monge da cidadela procurava ervas para fazer uma poção que o rei o havia requisitado.+\n"
		+ "Depois de horas de busca, o Herói avista o seu objetivo no topo da montanha conhecida como montanha da morte\n"
		+ "e decide então, subir a montanha para colher as ervas. Porém, ao chegar no topo da montanha,\n"
		+ "o monge se depara com um necromante que buscava as mesmas ervas.\n"
		+ "com o objetivo de ressuscitar um antigo rei demônio.\n"
		+ "percebendo as intenções do necromante, o monge decide enfrentá-lo.\n"
		+ "O necromante então invoca dois esqueletos para lutar contra o monge.\n");
		
		
		System.out.println("--------「A BATALHA COMEÇA」--------");
		for (Fase fase : fases) {
			for (Monstro monstro : fase.getMonstros()) {
				while (monge.estaVivo(monge) && monstro.estaVivo(monstro)) {
					System.out.println("Um " + monstro.getNome() + " aparece!");
					monge.usarHabilidadeEspecial(monstro);
					if (monstro.estaVivo(monstro)) {
						monstro.atacar(monge);
					}
					
					if (!monge.estaVivo(monge)) {
						System.out.println("O Monge foi derrotado...\n" +
						"--------「Game Over」--------\n");
					} 
					
					else if (!monstro.estaVivo(monstro)) {
						System.out.println("✺ O Monge derrotou o " + monstro.getNome() + " e ganhou " + monstro.getXpConcedido() + " de experiência ✺");
						monge.ganharExperiencia(monstro.getXpConcedido());
						if (monge.setSorte() > 0.5) {
							monge.equiparArma(monstro.largarArma());
						}
						else {
							System.out.println("O monstro não deixou nada para trás");
						}
					}
					
					System.out.println("\n");
					System.out.println("--------STATUS DO HEROI--------\n");
					monge.exibirStatus(monge);
					System.out.println("\n");
					System.out.println("--------STATUS DO MONSTRO--------\n");
					monstro.exibirStatus(monstro);
					System.out.println("----------------------------------");
					System.out.println("\n");
					
				}
				if (!monge.estaVivo(monge)) {
					break;
				}	
			}
			
		}
		if (monge.estaVivo(monge)) {
			System.out.println("--------「	VITORIA DO MONGE	」--------\n");
		}
	}
}