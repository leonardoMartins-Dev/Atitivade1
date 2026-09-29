package Src.application;

import java.util.ArrayList;
import java.util.Scanner;

import Src.models.Atendimento;
import Src.models.Procedimento;
import Src.models.Sala;
import Src.models.Veterinario;



public class ClinicaApplication {
    public static void main(String[] args) {
        Veterinario leo = new Veterinario("leo", "13318833690", "cardiologista", 987451563 );
        Veterinario joao = new Veterinario("joao", "12338443690", "cardiologista", 987333563 );
        Veterinario Pedro = new Veterinario("Pedro", "13158453690", "Geral", 981749563 );

        Sala um = new Sala(1, 'a', 10, "grave");
        Sala dois = new Sala(2, 'b', 10, "medio");
        Sala tres = new Sala(3, 'c', 10, "suave");
        Sala [] salas = {um, dois, tres};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo, nome do animal, especie, nome do tutor, status e observacoes do atendimento (Para cada entrada digite e aperte Enter)");
        String codigo=sc.nextLine();
        String nomeAnimal=sc.nextLine();
        String especie=sc.nextLine();
        String nomeTutor=sc.nextLine();
        String status=sc.nextLine();
        String obs=sc.nextLine();
        Atendimento a = new Atendimento(codigo, nomeAnimal, especie, nomeTutor, status, obs);
        System.out.println("Para qual sala vc quer atribuir esse atendimento? (1,2,3)");
        int opcaoSala=sc.nextInt();
        for(int i = 0; i<salas.length; i++){
            if (salas[i].getNumero()=opcaoSala){
                salas[i].addAtendimento(a);
            }
        }


    }
}
