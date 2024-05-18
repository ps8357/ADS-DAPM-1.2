import java.util.ArrayList;
import java.util.List;

// Classe Mensagem
class Mensagem {
    private Contato remetente;
    private Contato destinatario;
    private String conteudo;
    private String tipo;

    public Mensagem(Contato remetente, Contato destinatario, String conteudo, String tipo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.tipo = tipo;
    }

    // Getters e Setters
}

// Classe Contato
class Contato {
    private String nome;
    private List<Mensagem> mensagens;

    public Contato(String nome) {
        this.nome = nome;
        this.mensagens = new ArrayList<>();
    }

    // Adiciona mensagem à lista de mensagens do contato
    public void adicionarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    // Getters e Setters
}

// Classe WhatsApp
class WhatsApp {
    private List<Contato> contatos;

    public WhatsApp() {
        this.contatos = new ArrayList<>();
    }

    // Adiciona contato à lista de contatos do WhatsApp
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Getters e Setters
}
