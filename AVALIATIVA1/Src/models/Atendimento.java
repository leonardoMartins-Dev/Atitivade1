package Src.models;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private LocalDate data;
    private LocalDateTime horario;
    private String status;
    private String obs;

    public Atendimento(String codigo, String nomeAnimal,String especie,String nomeTutor, String status, String obs){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data=LocalDate.now();
        this.horario=LocalDateTime.now();
        this.status = status;
        this.obs = obs;
    }

    public void exibir(){
        System.out.println(codigo);
        System.out.println(nomeAnimal);
        System.out.println(especie);
        System.out.println(nomeTutor);
        System.out.println(data);
        System.out.println(status);
        System.out.println(obs);
    }



    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getNomeTutor() {
        return nomeTutor;
    }
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalDateTime getHorario() {
        return horario;
    }
    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
}
