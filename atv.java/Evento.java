

import java.util.ArrayList;

public class Evento{
    // Atributos
    // Usado encapsulamento 
    private String nomeEvento;                  //Nome do evento
    private String data;                        //Data do evento
    private String local;                       //Local do evento
    private String organizadores;               //Lista de organizadores
    private ArrayList<String> participantes;    // Lista de participantes
    private int capacidade;                     //Capacidade de pessoas no evento
    private String tipoDeEvento;                //Estilo do evento
    private String horaDeInicio;                //Hora de início do evento
    private String horaFinal;                   //Hora do final do evdento
    private String indicacaoIdade;              // Classificação etária do evento

    //Construtor
    public Evento(String nomeEvento, String data, String local, String organizadores, int capacidade, String tipoDeEvento, String horaDeInicio, String horaFinal, String indicacaoIdade){
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.local = local;
        this.organizadores = organizadores;
        this.participantes = new ArrayList<>(); // Incializa a lista de participantes
        this.capacidade = capacidade;
        this.tipoDeEvento = tipoDeEvento;
        this.horaDeInicio = horaDeInicio;
        this.horaFinal = horaFinal;
        this.indicacaoIdade = indicacaoIdade;
    }

    //Método para adicionar um participante
    public boolean adicionarParticipante(String participante){
        if(participantes.size() < capacidade){
            participantes.add(participante);
            System.out.println(participante + " foi adicionado ao evento" + nomeEvento + ".");
            return true;
        }else {
            System.out.println("Não foi possível adicionar" + participante + ". Evento está lotado.");
            return false;
        }
    }

    // Método para remover um participante
    public boolean removerParticipante(String participante) {
        if( participantes.remove(participante)){
            System.out.println(participante + "foi removido do evento" + nomeEvento + ".");
            return true;
        } else {
            System.out.println(participante + "não está registrado no evento" + nomeEvento + ".");
            return false;
        }
    }

    // Método para consultar disponibilidade

    // Usado abstração 
    public void consultarDisponibilidade(){
        int vagasDisponiveis = capacidade - participantes.size();
        System.out.println("O evento" + nomeEvento + "tem" + vagasDisponiveis + "vagas disponíveis.");
    }

    // Método para cancelar o evento
    public void cancelarEvento(){
        participantes.clear(); // Remove todos os participantes
        System.out.println("O evento" + nomeEvento + "foi cancelado. Todos os participantes foram removidos.");
    }

    //Método para exibir informações do evento ( Opcional para teste)
    //usado Polimorfismo
    public void exibirDetalhes(){
        System.out.println("Nome do evento" + nomeEvento);
        System.out.println("Data:" + data);
        System.out.println("Local:" + local);
        System.out.println("Organizadores:" + organizadores);
        System.out.println("Capacidade:" + capacidade);
        System.out.println("Participantes inscritos:" + participantes.size());
        System.out.println("Tipo de evento:" + tipoDeEvento);
        System.out.println("Hora de Início:" + horaDeInicio);
        System.out.println("Hora Final:" + horaFinal);
        System.out.println("Indicado para qual idade:" + indicacaoIdade);
    }
}



//Encapsulamento: Protege os dados e garante que a manipulação seja feita através de métodos controlados.
//Construtores: Inicializam os objetos com valores específicos.
//Abstração: Esconde detalhes de implementação e apresenta apenas o necessário para interagir com o objeto.
//Polimorfismo (potencial): Permite que métodos em classes derivadas tenham comportamentos diferentes, mesmo com o mesmo nome.
