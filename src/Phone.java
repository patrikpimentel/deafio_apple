import java.util.ArrayList;
import java.util.List;

public class Phone extends Informacao {

    private List<String> contatos;
    
    public Phone() {
	contatos = new ArrayList<>();
    }

    public void ligar(String numero) {
	mostrarInformacoes("Ligando para "+ numero);
    }
    
    public void atender() {
	mostrarInformacoes("Atendendo ...");
    }
    
    public void iniciarCorreiodeVoz() {
	mostrarInformacoes("Iniciando correio de voz ...");
    }

}
