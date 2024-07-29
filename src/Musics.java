
public class Musics extends Informacao {
    private String musicaAtual;
    private boolean tocando;

    public void tocarMusica() {
	if (musicaAtual == null) {
	    mostrarInformacoes("Selecione uma musica antes de tocar");
	} else {
	    tocando = true;
	    mostrarInformacoes("Tocando a música " + musicaAtual);
	}
    }
    
    public void selecionarMusica(String musica) {
	musicaAtual = musica;
	mostrarInformacoes("Selecionado a música "+musica);
    }
    
    public void pausar() {
	if(tocando) {
	    tocando = false;
	    mostrarInformacoes("Musica pausada");
	}else {
	    mostrarInformacoes("Toque a musica antes");
	}
    }
    

}
