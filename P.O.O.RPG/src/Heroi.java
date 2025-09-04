// Classe abstrata que representa heróis jogáveis no RPG.
// Herda de Personagem e adiciona lógica de experiência, nível e habilidades especiais.

public abstract class Heroi extends Personagem {
    private int nivel , experiencia;

    public Heroi(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca);
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    private int redefinirNivel(int experiencia) {
        return experiencia/100;
    }

    public void ganharExperiencia(int expGanha) {
        experiencia = experiencia + expGanha;
        nivel = nivel + redefinirNivel(experiencia); 
    }

    @Override
    public void exibirStatus(Personagem alvo){
        super.exibirStatus(alvo);
        System.out.println("Experiencia: " + this.experiencia);
    }
    
    public abstract void usarHabilidadeEspecial(Personagem alvo);

}