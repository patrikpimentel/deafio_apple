# Diagrama das classes
classDiagram
    class Telefone {
        -nome : String
        -descricao : String
    }

    class Navegador {
        -paginaAtual : String
        +exibirPagina(String url) : void
        +adicionarNovaAba(String pagina) : void
        +atualizarPagina() : void
    }

    class Phone {
        -contatos : List<String>
        +ligar(String numero) : void
        +atender() : void
        +iniciarCorreioDeVoz() : void
    }

    class Musics {
        -musicaAtual : String
        -tocando : boolean
        +tocarMusica() : void
        +selecionarMusica(String musica) : void
        +pausar() : void
    }

    class Informacoes {
        +mostrarInformacao(String) : void
    }

    Telefone "1" --> "1" Navegador
    Telefone "1" --> "1" Phone
    Telefone "1" --> "1" Musics
    Navegador --> Informacoes
    Phone --> Informacoes
    Musics --> Informacoes

 
