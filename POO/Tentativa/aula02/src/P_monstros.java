public class P_monstros {
    String nome;
    String rank;
    int HP_max;
    int HP;
    int ataque;
    int defesa;

    void status_monstro() {
        System.out.println("Monstro: " + nome);
        System.out.println("Vida máxima: " + HP_max);
        System.out.println("Vida: " + HP);
        System.out.println("Dificuldade: " + rank);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
    }

    void habilidade(P_caçadores caçador) {
        int dano_habilidade = 20;
        int dano_total = dano_habilidade + ataque;
        System.out.println(nome + " usou o Ataque Selvagem e causou " + dano_total + " de dano!");
        caçador.sofrer_dano(dano_total);
    }

    void sofrer_dano(int dano) {
        int dano_final = dano - defesa;
        if (dano_final < 0) dano_final = 0;
        HP -= dano_final;
        if (HP < 0) HP = 0;
        System.out.println(nome + " sofreu " + dano_final + " de dano. HP agora é " + HP);
    }
}