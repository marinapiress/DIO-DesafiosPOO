package Iphone;
import Iphone.SistemaOperacional.SistemaOperacional;
import java.util.Scanner;
public class Iphone {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SistemaOperacional iphone = new SistemaOperacional();

        printarMenu();
        int menu = scanner.nextInt();

        do {
            switch (menu) {
                case 1: {
                    iphone.menuReprodutorMusical();
                    int opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite a música que deseja ouvir: ");
                            String musica = scanner.next();
                            iphone.selecionarMusica(musica);
                            break;
                        case 2:
                            iphone.tocarMusica();
                            break;
                        case 3:
                            iphone.pausarMusica();
                            break;
                        case 4:
                            printarMenu();
                            menu = scanner.nextInt();
                            break;
                        default:
                            printarOpcaoInvalida();
                            break;
                    }
                    break;
                }
                case 2: {
                    iphone.menuAparelhoTelefonico();
                    int opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o número: ");
                            String numeroTelefone = scanner.next();
                            iphone.ligar(numeroTelefone);
                            break;
                        case 2:
                            iphone.atender();
                            break;
                        case 3:
                            iphone.correioDeVoz();
                            break;
                        case 4:
                            printarMenu();
                            break;
                        default:
                            printarOpcaoInvalida();
                            break;
                    }
                }
                case 3: {
                    iphone.menuNavegadorInternet();
                    int opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o endereço WEB: ");
                            String url = scanner.next();
                            iphone.exibirPagina(url);
                            break;
                        case 2:
                            iphone.atualizarPagina();
                            break;
                        case 3:
                            iphone.adicionarNovaPagina();
                            break;
                        case 4:
                            printarMenu();
                            break;
                        default:
                            printarOpcaoInvalida();
                            break;
                    }
                }
                case 0: {
                    System.out.println("ENCERRADO! Obrigado pela preferência!");
                    scanner.close();
                    break;
                }
            }
        }
        while (menu != 0 && menu < 5);
    }
    private static void printarOpcaoInvalida() {
        System.out.println("Opção Inválida, digite uma opção válida!");
    }

    private static void printarMenu() {
        System.out.println("-------------------------------");
        System.out.println("             MENU              ");
        System.out.println("-------------------------------");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Reprodutor Musical");
        System.out.println("2 - Aparelho Telefônico");
        System.out.println("3 - Navegador de Internet");
        System.out.println("0 - Encerrar");
        System.out.println("-------------------------------");
    }
}