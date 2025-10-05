// Interface que determina metodos basicos para gerar fases

import java.util.ArrayList;

public interface GeradorDeFases {
    public ArrayList<FaseDeCombate> gerar(int quantidadeDeFases);
}
