public class Main {
    public static void main(String[] args) {
        P_caçadores Jin_woo = new P_caçadores();
        Jin_woo.nome = "Jin-Woo";
        Jin_woo.rank = "Rank E";
        Jin_woo.HP_max = 200;
        Jin_woo.HP = 200;
        Jin_woo.nivel = 1;
        Jin_woo.ataque = 10;
        Jin_woo.defesa = 20;

        P_monstros Goblin = new P_monstros();
        Goblin.nome = "Goblin";
        Goblin.rank = "Rank D";
        Goblin.HP_max = 150;
        Goblin.HP = 150;
        Goblin.ataque = 15;
        Goblin.defesa = 10;

        System.out.println("-----Status Caçador-----");
        Jin_woo.mostrar_status();

        System.out.println("\n-----Status Monstro-----");
        Goblin.status_monstro();

        System.out.println("\n-----Início da Batalha-----");

        int turno = 1;
        while (Jin_woo.HP > 0 && Goblin.HP > 0) {
            System.out.println("\n----------Round " + turno + "----------");

            Jin_woo.skill(Goblin);
            if (Goblin.HP <= 0) {
                System.out.println("\n----------"+Goblin.nome + " foi derrotado!----------");
                Jin_woo.subir_nivel();
                break;
            }

            Goblin.habilidade(Jin_woo);
            if (Jin_woo.HP <= 0) {
                System.out.println("----------"+Jin_woo.nome + " foi derrotado!----------");
                break;
            }

            turno++;
        }

        System.out.println("\n-----Status Final-----");
        Jin_woo.mostrar_status();
    }
}