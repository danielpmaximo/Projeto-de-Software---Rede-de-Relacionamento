import java.util.*;

public class Func {
    Scanner scan = new Scanner(System.in);

    String nome;
    String login;
    String senha;
    String comando_usuario;
    String nascimento;
    String pessoa_mensagem;
    String mensagem;
    String nome_comunidade;
    String assunto_comunidade;
    String usuario_comunidade;
    String rm_usuario_comunidade;
    //int cmd_comunidade;
    String entrar_comunidade;
    String pesquisa;
    String deletar;

    // Funcionalidade 1
    public void Nome(){
        nome = scan.nextLine();
        
    }
    public void Login(){
        login = scan.nextLine();
    }
    public void Senha(){
        senha = scan.nextLine();
    }
    
    // Funcionalidade 2
    public void Nascimento(){
        nascimento = scan.nextLine();
    }
    public void Cmd_Usuario(){
        comando_usuario = scan.nextLine();
    }

    //Funcionalidade 4
    public void PessoaMensagem(){
        pessoa_mensagem = scan.nextLine();
    }
    public void Mensagem(){
        mensagem = scan.nextLine();
    }

    //Funcionalidade 5
    public void NomeComunidade(){
        nome_comunidade = scan.nextLine();
    }
    public void AssuntoComunidade(){
        assunto_comunidade = scan.nextLine();
    }
    public void Add_Usuario_Comunidade(){
        usuario_comunidade = scan.nextLine();
    }
    public void Rm_Usuario_Comunidade(){
        rm_usuario_comunidade = scan.nextLine();
    }

    //Funcionalidade 6
    public void EntrarComunidade(){
        entrar_comunidade = scan.nextLine();
    }

    //Funcionalidade 7
    public void Pesquisa(){
        pesquisa = scan.nextLine();
    }

    //Funcionalidade 8
    public void Deletar(){
        deletar = scan.nextLine();
    }

}
