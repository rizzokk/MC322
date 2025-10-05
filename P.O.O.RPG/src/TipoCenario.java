// Enum que define os tipos de cenarios de uma fase, sua descrição e seu nome

public enum TipoCenario {
    
    FLORESTA("Era uma noite escura, o céu estava coberto de nuvens e a lua não podia ser vista,\n"
		+ "a única luz vinha das tochas que o nosso herói carregava. Nessa noite,\n"
		+ "o monge da cidadela procurava ervas para fazer uma poção que o rei o havia requisitado.+\n"
		+ "Depois de horas de busca, o Herói avista o seu objetivo no topo da montanha conhecida como montanha da morte\n"
		+ "e decide então, subir a montanha para colher as ervas. Porém, ao chegar no topo da montanha,\n"
		+ "o monge se depara com um necromante que buscava as mesmas ervas.\n"
		+ "com o objetivo de ressuscitar um antigo rei demônio.\n"
		+ "percebendo as intenções do necromante, o monge decide enfrentá-lo."),
    MONTANHA("No alto do cume da montanha, o mundo parece distante. O vento sopra frio e constante, carregando o cheiro das árvores \n"
        + "lá embaixo e o sussurro dos antigos. Rochas negras e cobertas de musgo cercam o topo, onde cresce uma única árvore retorcida, solitária, como um guardião \n" 
        + "silencioso. Daqui, é possível ver a vastidão da floresta se estendendo como um mar escuro, pontilhado por neblina e luzes errantes que dançam ao longe.\n" 
        + "O céu, mais próximo do que nunca, parece pesado com estrelas — e algo além delas observa de volta."),
    CAVERNA("A entrada da caverna se abre como a boca de uma fera adormecida, escondida entre raízes grossas e pedras cobertas de limo.\n" 
        + "Lá dentro, o ar é úmido e denso, carregado com o cheiro metálico da terra antiga. Gotas de água ecoam pelas paredes escuras, quebrando o silêncio com um ritmo quase ritual.\n" 
        + "Estalactites pendem como presas afiadas, e marcas esquecidas — talvez garras, talvez runas — cobrem as rochas mais profundas.\n" 
        + "Algo se move mais adiante, longe da luz, onde nem mesmo o som ousa entrar.");

    private final String descricao;
    
    TipoCenario(String descricao) {
        this.descricao = descricao;
    }

    String getDescricao() {
        return descricao;
    }
}
