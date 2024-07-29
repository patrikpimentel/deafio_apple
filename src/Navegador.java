
public class Navegador extends Informacao {
    private String paginaAtual;

    public void exibirPagina(String url) {
	paginaAtual = url;
	mostrarInformacoes("Mostrando pagina");
    }
    
    public void adicionarNovaAba(String pagina) {
	mostrarInformacoes("Adicionado a pagina "+pagina);
    }
    
    public void atualizarPagina() {
	mostrarInformacoes("Atualizando pagina \nPagina atualizada");
    }
}
