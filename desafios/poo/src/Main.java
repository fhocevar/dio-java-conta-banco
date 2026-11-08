
public class Main {

    public static void main(String[] args) {

        iPhone iphone = new iPhone();

        System.out.println("=== REPRODUTOR MUSICAL ===");
        iphone.selecionarMusica("Imagine");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n=== APARELHO TELEFONICO ===");
        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n=== NAVEGADOR INTERNET ===");
        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
