// Evento onde varias pedras rolam para cima do heroi, sendo que dependendo a sua sorte, ele sera capaz de escapar ou não

public class ArmadilhaDePedras implements Evento{
    
    private int dano;
    private double dificuldade;
    
    public ArmadilhaDePedras(int dano, double dificuldade) {
        this.dano = dano;
        this.dificuldade = dificuldade;
    }

    public boolean verificarGatilho(TipoCenario cenario) {
        if (TipoCenario.CAVERNA == cenario) {
            return true;
        }
        return false;
    }

    public void executar(Heroi heroi) {
        System.out.println("Assim que o herói dá o primeiro passo dentro da caverna, um som seco ecoa por entre as paredes de pedra\n" 
        + "— clac — como se alguma antiga engrenagem tivesse despertado de um longo sono. \n" 
        + "Por um breve instante, o silêncio reina... e então, o chão começa a tremer levemente.\n"
        + "De repente, um estrondo ensurdecedor rompe o ar, vindo das profundezas do túnel. \n" 
        + "Um rugido de pedra contra pedra. Das trevas à frente, uma avalanche de rochas se solta \n" 
        + "— não meras pedras soltas, mas blocos inteiros, cilíndricos e irregulares, rolando em alta velocidade em direção à entrada da caverna.");
        System.out.println("\n");
        if (heroi.getSorte() < dificuldade) {
            System.out.println("Num reflexo rápido, o herói avista uma fenda estreita na parede e se lança para o lado.\n" 
            + "As pedras passam rugindo a poucos centímetros de onde ele estava, levantando poeira e fazendo o chão tremer.\n" 
            + "Ele sai ileso, respirando com dificuldade, mas pronto para seguir em frente.");
            System.out.println("\n");
        }
        else {
            System.out.println("O herói corre, mas uma pedra menor o acerta na perna no último segundo.\n"
            + "Com dor, ele se joga atrás de uma saliência na parede. As rochas passam com fúria, e o silêncio retorna.\n" 
            + "Ele está vivo, mas ferido — a perna sangra, e caminhar será mais difícil agora.");
            System.out.println("O Heroi tomou " + dano + " de dano pelas pedras");
            heroi.receberDano(dano);
            System.out.println("\n");
        }
    }
}
