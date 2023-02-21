package Projeto_NBA;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PerguntasNBA perguntas = new PerguntasNBA();

        LakersLogo lakers = new LakersLogo();

        TodosOsTimes timetodos = new TodosOsTimes();

        Celtics celtics = new Celtics();

        CuriosidadesTimes curiosos = new CuriosidadesTimes();



        do {
            perguntas.Perguntas();


            int opcao = scan.nextInt();

            switch (opcao) {


                case 1 : lakers.Logolakers();
                    celtics.TitulosCeltics();
                    break;



                case 2 :
                    timetodos.TodosTimes();
                    break;



                case 3 :
                    curiosos.NBAcuriosidades();

                default  :{
                }
            }




            System.out.println("Gostaria de repetir o programa ? (sim/nao)");

        }while (scan.next().equalsIgnoreCase("s"));
    }





}