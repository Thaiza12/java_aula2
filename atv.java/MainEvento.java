

public class MainEvento{
    public static void main(String[] args){
        //Criando um evento
        Evento evento = new Evento("Tech Conference", "2024-12-01", "Centro de Convenções", "Organização tech", 3, "Aula", "19:00", "22:00", "14");

        Evento evento1 = new Evento("Dance", "2025-02-01", "Academia ABC", "Organização fit", 6, "Aula", "19:00", "22:00", "18");
        Evento evento2 = new Evento("Aula Inglês", "2025-05-01", "Online", "Organização ingles", 5, "Aula", "08:00", "12:00", "10");
        Evento evento3 = new Evento("Curso de libras", "2025-12-01", "Uniaeso", "Organização libras", 2, "Aula", "13:00", "17:00", "14");
        Evento evento4 = new Evento("Show de MPB", "2025-12-05", "Centro de Convenções", "Organização tech", 10, "Show", "21:00", "04:00","18");
        Evento evento5 = new Evento("Aula de paraquedas", "2024-12-01", "Arpoador", "Organização paraquedas", 2, "Aula", "05:00", "06:00", "18");

        //Exibindo os detalhes do evento
        evento.exibirDetalhes();
        System.out.println();

        evento1.exibirDetalhes();
        System.out.println();

        evento2.exibirDetalhes();
        System.out.println();

        evento3.exibirDetalhes();
        System.out.println();

        evento4.exibirDetalhes();
        System.out.println();

        evento5.exibirDetalhes();
        System.out.println();

        //Adicionando participantes
        evento.adicionarParticipante("Alice");
        evento.adicionarParticipante("Bob");
        evento.adicionarParticipante("Carlos");

        evento1.adicionarParticipante("Rodrigo");
        evento2.adicionarParticipante("Paulo");
        evento3.adicionarParticipante("Thaiza");
        evento4.adicionarParticipante("Gabriel");
        evento5.adicionarParticipante("Gabriela");


        //Tentando adicionar mais participantes do que a capacidade permite
        evento.adicionarParticipante("Diana");
        System.out.println();

        //Consultando a disponibilidade de vagas
        evento.consultarDisponibilidade();
        System.out.println();

        //Removendo um participante
        evento.removerParticipante("Bob");
        evento.consultarDisponibilidade();
        System.out.println();

        //Cancelando o evento
        evento.cancelarEvento();
        evento.exibirDetalhes();
    }
}