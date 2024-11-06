package Objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vaga {
    private Integer vaga;
    private Integer tamanho;
    private Boolean disponivel;
    public static List<Vaga> vagas = new ArrayList<Vaga>();

   
    public static void criarVaga(Scanner scan) {
        System.out.println("Digite o número da vaga:");
        Integer cod = scan.nextInt();
        System.out.println("Digite o tamanho da vaga:\n"
                + "1 - Pequeno\n"
                + "2 - Médio\n"
                + "3 - Grande");
        Integer tamanho = scan.nextInt();
        vagas.add(new Vaga(cod, tamanho));
    }

    public static void visualizarVagas() {
        Integer cont = 0;
        for (Vaga vaga : vagas) {
            cont++;
        }
        System.out.println("Número de vagas: " + cont);
        for (Vaga vaga : vagas) {
            System.out.println(vaga);
        }
    }

        public static boolean verifica(Integer vagaCod, Integer tamanho) {
        for (Vaga vaga : vagas) {
            if (vaga.vaga.equals(vagaCod) && vaga.tamanho.equals(tamanho)) {
                return true;  
            }
        }
        return false;
    }

   
    public static void ocupar(Integer vagaCod) {
        for (Vaga vaga : vagas) {
            if (vaga.vaga.equals(vagaCod)) {
                vaga.setDisponivel(false);  
                break;  
            }
        }
    }

   
    public static void desocupar(Integer vagaCod) {
        for (Vaga vaga : vagas) {
            if (vaga.vaga.equals(vagaCod)) {
                vaga.setDisponivel(false);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Vaga [Número: " + vaga + ", Tamanho: " + tamanho + ", Disponível: " + (disponivel ? "Sim" : "Não") + "]";
    }

    
    public Vaga(Integer vaga, Integer tamanho) {
        this.vaga = vaga;
        this.tamanho = tamanho;
        this.disponivel = true;  
    }

  
    public Integer getVaga() {
        return vaga;
    }

    public void setVaga(Integer vaga) {
        this.vaga = vaga;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
