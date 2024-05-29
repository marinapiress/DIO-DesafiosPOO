package Iphone.SistemaOperacional;

import Iphone.SistemaOperacional.InterfacesIphone.AparelhoTelefonico;
import Iphone.SistemaOperacional.InterfacesIphone.NavegadorInternet;
import Iphone.SistemaOperacional.InterfacesIphone.ReprodutorMusical;

public class SistemaOperacional  implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);
        System.out.println("Ligação concluída com Sucesso!");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida com Sucesso! ");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Ligação recusada! ");
        System.out.println("Iniciando Correio de Voz...");
    }
    @Override
    public void menuAparelhoTelefonico() {
        System.out.println("-------------------------------");
        System.out.println("      Aparelho Telefônico      ");
        System.out.println("-------------------------------");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Atender");
        System.out.println("3 - Correio de Voz");
        System.out.println("4 - Voltar ao Menu Principal");
        System.out.println("-------------------------------");
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println("URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("................................");
        System.out.println("Atualizando Página!");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Nova Página adicionada. ");
    }

    @Override
    public void menuNavegadorInternet() {
        System.out.println("-------------------------------");
        System.out.println("     Navegador de Internet     ");
        System.out.println("-------------------------------");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Acessar Página WEB");
        System.out.println("2 - Atualizar Página");
        System.out.println("3 - Adicionar Nova Página");
        System.out.println("4 - Voltar ao Menu Principal");
        System.out.println("-------------------------------");
    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void tocarMusica() {
        System.out.println("................................");
        System.out.println("Reproduzindo Música Selecionada!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada!");
    }

    @Override
    public void menuReprodutorMusical() {
        System.out.println("------------------------------");
        System.out.println("      Reprodutor Musical      ");
        System.out.println("------------------------------");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Selecionar Música");
        System.out.println("2 - Tocar Música");
        System.out.println("3 - Pausar Música");
        System.out.println("4 - Voltar ao Menu Principal");
        System.out.println("-------------------------------");
    }





}
