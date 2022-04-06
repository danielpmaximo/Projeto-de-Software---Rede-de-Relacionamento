import java.util.*;

public class Mensagem {
    String loginRemetente, loginDestinatario, mensagem;
    Scanner scan = new Scanner(System.in);

    public void MensagemDestinatario(){
        loginDestinatario = scan.nextLine();   
    }
    public void MensagemRemetente(){
        loginRemetente = scan.nextLine();   
    }
}
