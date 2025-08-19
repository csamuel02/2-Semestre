public class Main {
    public static void main(String[] args) {
            Personagem P = new Personagem();
            P.nome = " Satsuo_oO";
            P.HP_max = 100;
            P.HP = P.HP_max;
            P.nivel = 1;
            P.mostrar_ficha();
            P.subir_nivel(10);
            P.sofrer_dano(0);
            P.mostrar_ficha();
    }
}