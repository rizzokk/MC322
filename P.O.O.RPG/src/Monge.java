// Classe concreta que representa um herói do tipo Monge.
// Implementa habilidades específicas de monge.

public class Monge extends Heroi{
    private int ataquesAdicionais, dano;

    public Monge(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca, nivel, experiencia);
        this.ataquesAdicionais = nivel + 1;
        if (super.checkArma()) {
            this.dano = 6 + forca + getArma().getDano();
        }
        else {
            this.dano = 6 + forca; 
        }
    }

    public void atacar(Personagem alvo) {
        System.out.println("O Monge acerta um golpe desarmado em " + alvo.getNome() + " e causa: " + dano + " de dano");
        receberDano(dano, alvo);
    }

    public void usarHabilidadeEspecial(Personagem alvo) {
        setSorte();
        if (getSorte() > 0.2 && getSorte() <= 0.8) {
            System.out.println("O Monge respira fundo e da uma enchurada de golpes no inimigo");
            int i;
            for (i=0; i < ataquesAdicionais; i++) {
                atacar(alvo);
            }
        }
        else if (getSorte() <= 0.2) {
            System.out.println("O Monge respira fundo, mas pensamentos malignos invadem a sua mente");
            System.out.println("O Monge perde a oportunidade de atacar nesse turno");
        }
        else if (getSorte() > 0.8) {
            System.out.println("O Monge respira fundo e se sente completamente em harmonia com o mundo ao seu redor");
            System.out.println("Seu golpe perfura corpo e alma de seus oponentes, 3x mais dano");
            int i;
            for (i=0; i < ataquesAdicionais; i++) {
                System.out.println("O Monge acerta um golpe desarmado em " + alvo.getNome() + " e causa: " + dano*3 + " de dano");
                receberDano(dano*3 , alvo);
            }
        }
    }
}