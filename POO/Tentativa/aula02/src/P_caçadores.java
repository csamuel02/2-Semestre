public class P_caçadores {
    String nome;
    String rank;
    int HP_max;
    int HP;
    int nivel;
    int ataque;
    int defesa;

    void mostrar_status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida máxima: " + HP_max);
        System.out.println("Vida: " + HP);
        System.out.println("Nível: " + nivel);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Rank: " + rank);
    }

    void skill(P_monstros monstro) {
        int dano_skill = 30;
        int dano_total = dano_skill + ataque;
        System.out.println(nome + " usou o Corte Rápido e causou " + dano_total + " de dano!");
        monstro.sofrer_dano(dano_total);
    }

    void sofrer_dano(int dano) {
        int dano_final = dano - defesa;
        if (dano_final < 0) dano_final = 0;
        HP -= dano_final;
        if (HP < 0) HP = 0;
        System.out.println(nome + " sofreu " + dano_final + " de dano. HP agora é " + HP);
    }

    void subir_nivel() {
        nivel++;
        ataque += 3;
        defesa += 2;
        HP_max += 20;
        HP = HP_max;
        System.out.println("\n"+nome + " subiu para o nível " + nivel);
    }
}