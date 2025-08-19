public class Personagem {
    String nome;
    int HP_max;
    int HP;
    int nivel;

        void mostrar_ficha(){
            System.out.println("Nome: " +nome);
            System.out.println("Vida Máxima: " +HP_max);
            if(HP >0) {
                System.out.println("Vida: " + HP);
            } else{
                System.out.println("Vida: 0");
            }
            System.out.println("Nível: " +nivel);
            System.out.println("----------------------------");
        }

        void subir_nivel(int valor){
            nivel = nivel + valor;
            HP_max = HP_max+(valor * 5);
            HP += valor*5;
        }

        void sofrer_dano(int dano){
            HP -= dano;

        }
}