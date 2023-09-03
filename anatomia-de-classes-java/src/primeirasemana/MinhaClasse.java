package primeirasemana;

public class MinhaClasse {

public static void main (String [] args) {

    String primeiroNome = "Analécia";
    String ultimoNome = "Santos";

    String nomeCompleto = nomeCompleto (primeiroNome,ultimoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String ultimoNome) {
    return "Resultado do médoto: " + primeiroNome.concat(" ").concat(ultimoNome);
}

}
