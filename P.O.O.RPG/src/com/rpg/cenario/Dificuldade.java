package com.rpg.cenario;

public enum Dificuldade {
    FACIL(3, 1, 1),
    MEDIO(5, 2, 3),
    DIFICIL(8, 3, 4);

    private final int quantMonstros, multDificuldade, multXP;

    Dificuldade(int quantMonstros, int multDificuldade, int multXP) {
        this.quantMonstros = quantMonstros;
        this.multDificuldade = multDificuldade;
        this.multXP = multXP;
    }

    int getQuantMontros() {
        return quantMonstros;
    }

    int getMultDificuldade() {
        return multDificuldade;
    }

    int getMultXP() {
        return multXP;
    }
}

