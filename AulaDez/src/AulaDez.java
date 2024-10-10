import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AulaDez {
    private static final int INDEX_NOME = 0;
    private static final int INDEX_ENDERECO = 1;
    private static final int INDEX_EMAIL = 2;
    private static List<String> listaDoadores = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Little Tiger Revolution");
        Scanner leia = new Scanner(System.in);
        int opcaoMenu = 0;
        do{
            System.out.println("""
                    1 - Adicionar Cliente
                    2 - Exibir os Dados do Cliente
                    3 - Alterar Cliente
                    4 - Remover Cliente
                    5 - Realizar Doação
                    6 - Sair
                    """);
            opcaoMenu = leia.nextInt();
            if (opcaoMenu == 1){
                adicionar();

            }else if (opcaoMenu == 2){
                exibir();
            }

        } while (opcaoMenu != 6);
    }



    private static void exibir() {
        for (int i = 0; i < listaDoadores.size(); i++) {
            String[] retorno = new String[]{listaDoadores.get(i)};
            System.out.println(retorno [INDEX_NOME]);
            System.out.println(retorno [INDEX_ENDERECO]);
            System.out.println(retorno [INDEX_EMAIL]);


        }

    }

    private static void adicionar() {
        String[] doador = new String[3];
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um nome:");
        doador[INDEX_NOME] = leia.nextLine();
        System.out.println("Informe um endereço:");
        doador[INDEX_ENDERECO] = leia.nextLine();
        System.out.println("Informe um email:");
        doador[INDEX_EMAIL] = leia.nextLine();
        listaDoadores.add(Arrays.toString(doador));

    }
}


