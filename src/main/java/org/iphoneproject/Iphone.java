package org.iphoneproject;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina na URL: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina atual...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionando " + musica);
    }
}
