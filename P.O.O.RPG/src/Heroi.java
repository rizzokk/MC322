public abstract class Heroi extends Personagem {
    private int nivel , experiencia;

    public Heroi(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca);
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    private void ganharExperiencia(int expGanha) {
        experiencia = experiencia + expGanha;    
    }

    @Override
    public void exibirStatus(Personagem alvo){
        super.exibirStatus(alvo);
        System.out.println("Experiencia: " + this.experiencia);
    }
    
    public abstract void usarHabilidadeEspecial(Personagem alvo);

}