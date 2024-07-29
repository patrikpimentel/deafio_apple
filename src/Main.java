
public class Main {

    public static void main(String[] args) {
	Phone phone = new Phone();
	Navegador navegador = new Navegador();
	Musics musics = new Musics();

	musics.selecionarMusica("musica qualquer");
	musics.tocarMusica();
	musics.pausar();

	phone.ligar("0000000x00");

    }

}
