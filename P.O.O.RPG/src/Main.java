// Classe principal do RPG.
// Responsável por iniciar o jogo, criar personagens, monstros e controlar o fluxo da batalha.

public class Main {

	public static void main(String[] args) {
		//Mago mago = new Mago("Severus Snape", 100, 15, 1, 0);
		Monge monge = new Monge("Shang Chi", 80, 10, 1, 0);
		Esqueleto esqueleto = new Esqueleto("esqueleto(com capacete de couro)", 55, 10, 25);
		Esqueleto esqueleto2 = new Esqueleto("esqueleto(com espada de bronze)", 45, 15, 25);
		Cultista cultista = new Cultista("Sombra", 100, 12, 50);

		
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
		
		Monstro[] monstros = {esqueleto, esqueleto2, cultista};
		
		System.out.println("--------「A BATALHA COMEÇA」--------");
		
		for (Monstro monstro : monstros) {
			while (monge.estaVivo(monge) && monstro.estaVivo(monstro)) {
				System.out.println("Um " + monstro.getNome() + " aparece!");
				monge.usarHabilidadeEspecial(monstro);
				if (monstro.estaVivo(monstro)) {
					monstro.atacar(monge);
				}

				if (!monge.estaVivo(monge)) {
					System.out.println("O Monge foi derrotado...\n" +
					"____Game Over____");
				} 

				else if (!monstro.estaVivo(monstro)) {
					System.out.println("✺ O Monge derrotou o " + monstro.getNome() + " e ganhou " + monstro.getXpConcedido() + " de experiência ✺");
					monge.ganharExperiencia(monstro.getXpConcedido());
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
}