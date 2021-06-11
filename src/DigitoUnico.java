import java.util.Scanner;

public class DigitoUnico {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String valor1 = "", valor2 = "";

        System.out.println("Digite numero*: ");
        valor1 = scanner.nextLine();

        System.out.println("Digite o segundo numero (Opcional): ");
        valor2 = scanner.nextLine();

        ValidaValores(valor1, valor2);
    }

    private static void DigitoUnico(String valor1, String valor2){
        int v1 = 0, v2 = 0;
        if(valor2 == null){
            somaValores(valor1, null);
        }else{
            somaValores(valor1, valor2);
        }
    }

    private static int somaValores(String valor1, String valor2){
        int v1 = 0;
        if(valor2 == null){
            if (valor1.length() == 1) {
                return Integer.parseInt(valor1);
            }else {
                for (int i = 0; i < valor1.length(); i++) {
                    v1 += Integer.parseInt(valor1.substring(i, i + 1));
                }
                System.out.println("DigitoUnico("+ valor1 +") = "+v1);
                return somaValores(v1+"", null);
            }
        }else{
            String p = "", aux = "";
            if (valor1.length() == 1) {
                return Integer.parseInt(valor1);
            }else {
                for (int i = 0; i < Integer.parseInt(valor2); i++) {
                    p += valor1 + " ";
                    aux += valor1;
                }
                System.out.println("n="+valor1+" e k="+valor2+" -> p="+p);
                System.out.println(somaValores(aux, null));
                return somaValores(v1+"", null);
            }
        }

    }

    private static void ValidaValores(String valor1, String valor2){
        if(valor2.equals("")){
            if(valor1.matches("[0-9]+")){
                DigitoUnico(valor1, null);
            }
        }else {
            if(valor1.matches("[0-9]+") && valor2.matches("[0-9]+")){
                DigitoUnico(valor1, valor2);
            }
        }
    }
}