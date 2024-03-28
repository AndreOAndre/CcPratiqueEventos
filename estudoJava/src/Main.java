import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Login> usuario = new ArrayList<>();
        ArrayList<Events> evento = new ArrayList<>();
        String opcao;
        boolean rodando = true;

        while (rodando) {
            System.out.println("==== BEM VINDO ====");
            System.out.println("[1] Cadastrar usuário");
            System.out.println("[2] Lista de eventos");
            System.out.println("[3] Criar evento");
            System.out.println("[4] Sair");
            opcao = scanner.nextLine();


            switch (opcao) {
                case "1": {
                    System.out.println("==== CADASTRO DE USUÁRIO ====");
                    System.out.println("digite o email:");
                    String email = scanner.nextLine();

                    System.out.println("digite a senha:");
                    String senha = scanner.nextLine();

                    System.out.println("digite a cidade:");
                    String cidade = scanner.nextLine();

                    Login u = new Login();
                    u.atribuirEmail(email);
                    u.atribuirSenha(senha);
                    u.atribuirCidade(cidade);

                    usuario.add(u);
                    System.out.println("Cadastro realizado! :D");
                    break;
                }
                case "2": {
                    System.out.println("==== LISTA DE EVENTOS ====");

                    for (int i = 0; i < evento.size(); i++) {
                        Events events = evento.get(i);

                        // Verifica se a categoria do evento é null
                        if (events.getCategoria() == null) {
                            System.out.println("Categoria do evento #" + (i+1) + " é null!");
                        }

                        System.out.println("nome: " + evento.get(i).getNome());
                        System.out.println("horario: " + evento.get(i).getHorario());
                        System.out.println("categoria: " + evento.get(i).getCategoria());
                        System.out.println("endereço: " + evento.get(i).getEndereco());
                        System.out.println("descricao: " + evento.get(i).getDescricao());
                        System.out.println("cidade: " + evento.get(i).getCidade());
                    }


                    break;
                }
                case "3": {
                    System.out.println("==== CADASTRO DE EVENTO ====");
                    System.out.print("nome do evento: ");
                    String nomeEvento = scanner.nextLine();

                    System.out.print("horario do evento: ");
                    String horarioEvento = scanner.nextLine();

                    while (horarioEvento.trim().isEmpty()) {
                        System.out.println("Por favor, forneça um horário válido para o evento: ");
                        horarioEvento = scanner.nextLine();
                    }
                    System.out.println("Horário do evento definido como: " + horarioEvento);

                    System.out.println("categoria do evento: ");
                    String categoriaEvento = "";

                    System.out.println("[1] festa");
                    System.out.println("[2] evento esportivo");
                    System.out.println("[3] show");
                    System.out.println("[4] palestras");
                    opcao = scanner.nextLine();

                    switch (opcao) {
                        case "1": {
                            categoriaEvento = "festa";
                            break;
                        }
                        case "2": {
                            categoriaEvento = "evento esportivo";

                            break;
                        }
                        case "3": {
                            categoriaEvento = "show";
                            break;
                        }
                        case "4": {
                            categoriaEvento = "palestras";
                            break;
                        }
                    }
                    System.out.println(categoriaEvento);
                    System.out.print("endereco do evento:");
                    String enderecoEvento = scanner.nextLine();

                    System.out.print("descrição do evento:");
                    String descricaoEvento = scanner.nextLine();

                    System.out.print("cidade do evento:");
                    String cidadeEvento = scanner.nextLine();

                    Events events = new Events();
                    events.atribuirNomeEvento(nomeEvento);
                    events.atribuirhorarioEvento(horarioEvento);
                    events.atribuirEnderecoEvento(enderecoEvento);
                    events.atribuirCidadeEvento(cidadeEvento);
                    events.atribuirDescricaoEvento(descricaoEvento);
                    evento.add(events);
                    System.out.println("Evento cadastrado! :D");

                    System.out.println("Categoria do evento antes de atribuir: " + categoriaEvento);
                    events.atribuirCategoriaEvento(categoriaEvento);
                    System.out.println("Categoria do evento após atribuir: " + events.getCategoria());
                    break;
                }
                case "4": {
                    rodando = false;
                    System.out.println("Você saiu com sucesso!");
                    break;
                }


            }


//        Login conta = new Login();
//        conta.login = "teste";
//        conta.senha =  "teste";
//        conta.cidade = "sp";
//        conta.dados();
//        conta.validaDados();
//
//
//
//        Events evento1 = new Events();
//        evento1.nome = "festa na lage";
//        evento1.hora = "15:30";
//        evento1.data = "15/04/2024";
//        evento1.endereco = "rua teste 123, brasil";
//        evento1.cidade = "sp";
//        evento1.valor = 0.0;
//        evento1.criaEvents();
//
//
//        Events evento2 =  new Events();
//        evento2.nome = "bigode grosso";
//        evento2.hora = "12:00";
//        evento2.data = "30/04/2000";
//        evento2.endereco = "all bilau";
//        evento2.cidade = "sp";
//        evento2.valor = 15.50;
//        evento2.criaEvents();
        }


    }

}