import java.util.*;

public class App {
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)) {
            Func funcionalidade = new Func(); //objeto
            int comando = teclado.nextInt();
            int cmd_comunidade;
            ArrayList<String> list_nomes = new ArrayList<String>();
            ArrayList<String> list_login = new ArrayList<String>();
            ArrayList<String> list_senha = new ArrayList<String>();
            ArrayList<String> list_comunidade = new ArrayList<String>();
            ArrayList<String> list_mensagens = new ArrayList<String>();

                // Funcionalidade 1
                while(comando != 0){
                    if(comando == 1){
                        System.out.print("Nome: ");
                        funcionalidade.Nome();
                        list_nomes.add(funcionalidade.nome);
                        System.out.print("Login: ");
                        funcionalidade.Login();
                        list_login.add(funcionalidade.login);
                        System.out.print("Senha: ");
                        funcionalidade.Senha();
                        list_senha.add(funcionalidade.senha);
                        System.out.println("Conta criada com sucesso!");
                        comando = teclado.nextInt();
                    }
                    //Funcionalidade 2
                    else if(comando == 2){
                    
                        System.out.print("Insira seu usuario: ");
                        funcionalidade.Cmd_Usuario();

                        if(list_login.contains(funcionalidade.comando_usuario)){
                            if(funcionalidade.nascimento == null){
                                System.out.print("Insira a sua data de nascimento: ");
                                funcionalidade.Nascimento();
                                }
                            else{
                                System.out.printf("Data de nascimento: %s\n", funcionalidade.nascimento);
                                System.out.print("Insira a nova data de nascimento: ");
                                funcionalidade.Nascimento();
                            }
                        }
                        else{
                            System.out.print("Insira um usuario valido\nInsira outro numero\n");
                        }
                    comando = teclado.nextInt();
                    }
                    //Funcionalidade 3

                    //Funcionalidade 4 - to do
                    else if(comando == 4){
                        System.out.print("Enviar mensagem para: ");
                        funcionalidade.PessoaMensagem();

                        if(list_login.contains(funcionalidade.pessoa_mensagem)){
                            System.out.printf("Envie sua mensagem para %s:\n", funcionalidade.pessoa_mensagem);
                            funcionalidade.Mensagem();
                            list_mensagens.add(funcionalidade.mensagem);
                        }
                        else{
                            System.out.print("Insira um usuario valido\nInsira outro numero\n");
                        }
                        comando = teclado.nextInt();
                    }
                    //Funcionalidade 5
                    else if(comando == 5){
                        if(funcionalidade.nome_comunidade == null){
                            System.out.print("Nome da comunidade: ");
                            funcionalidade.NomeComunidade();
                            System.out.print("Assunto da comunidade: ");
                            funcionalidade.AssuntoComunidade();
                        }

                        System.out.printf("Seja bem vindo a comunidade: %s. ", funcionalidade.nome_comunidade);
                        System.out.print("Digite 1 para adicionar um membro, digite 2 para remover um membro ou digite 0 para voltar: ");
                        cmd_comunidade = teclado.nextInt();
                        
                        while(cmd_comunidade != 0){
                            if(cmd_comunidade == 1){                               
                                System.out.print("Insira o usuario a ser adicionado: ");
                                funcionalidade.Add_Usuario_Comunidade();
                                if(list_login.contains(funcionalidade.usuario_comunidade)){
                                    System.out.printf("Usuario %s adicionado\n", funcionalidade.usuario_comunidade);
                                    list_comunidade.add(funcionalidade.usuario_comunidade);
                                }
                                else{
                                    System.out.print("Insira um usuario valido\nInsira outro numero\n");
                                }
                                cmd_comunidade = teclado.nextInt();
                            }
                            else if(cmd_comunidade == 2){
                                System.out.print("Insira o usuario a ser removido: ");
                                funcionalidade.Rm_Usuario_Comunidade();
                                if(list_comunidade.contains(funcionalidade.rm_usuario_comunidade)){
                                    list_comunidade.remove(funcionalidade.rm_usuario_comunidade);
                                    System.out.printf("O usuario %s foi removido\n", funcionalidade.rm_usuario_comunidade);
                                }
                                cmd_comunidade = teclado.nextInt();
                            }
                        }

                        comando = teclado.nextInt();
                    }

                    //Funcionalidade 6
                    else if(comando == 6){
                        System.out.print("Insira a comunidade que voce quer entrar: ");
                        funcionalidade.EntrarComunidade();
                        System.out.print("Insira seu usuario: ");
                        funcionalidade.Add_Usuario_Comunidade();

                        if(funcionalidade.nome_comunidade == funcionalidade.entrar_comunidade){
                            System.out.printf("Voce entrou na comunidade: %s\n", funcionalidade.nome_comunidade);
                            list_comunidade.add(funcionalidade.usuario_comunidade);
                        }
                        comando = teclado.nextInt();
                    }

                    //Funcionalidade 7 - falta amizades e mensagens
                    else if(comando == 7){
                        System.out.print("Insira o usuario que voce quer ver: ");
                        funcionalidade.Pesquisa();

                        if(list_login.contains(funcionalidade.pesquisa)){
                            System.out.println("Login: " + funcionalidade.pesquisa);
                            int i = list_login.indexOf(funcionalidade.pesquisa);
                            System.out.println("Nome: " + list_nomes.get(i));
                            if(list_comunidade.contains(funcionalidade.pesquisa)){
                                System.out.println("Eh membro da comunidade " + funcionalidade.nome_comunidade);
                            }
                        }
                        comando = teclado.nextInt();
                    }

                    //Funcionalidade 8 - falta amizades e mensagens
                    else if(comando == 8){
                        System.out.print("Insira seu nome de usuario para deletar: ");
                        funcionalidade.Deletar();
                        if(list_login.contains(funcionalidade.deletar)){
                            list_login.remove(funcionalidade.deletar);
                            int j = list_login.indexOf(funcionalidade.deletar);
                            list_nomes.remove(j);
                            list_senha.remove(j);
                            if(list_comunidade.contains(funcionalidade.deletar)){
                                list_nomes.remove(funcionalidade.deletar);
                            }
                        }
                        System.out.println("Usuario removido");
                    }

                }
        }   
    }
}
