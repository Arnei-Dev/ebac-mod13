package br.com.arneidev.ebacmod13;

import java.util.ArrayList;
import java.util.List;

public class RunProgram {
    public static void main(String args[]){
        infoPessoaJuridica();
        infoPessoaFisica();
    }

    private static void infoPessoaJuridica() {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
       // List<Pessoa>listaPessoaJurica = new ArrayList<>();
        pessoaJuridica.setId(01L);
        pessoaJuridica.setNome("MDias Soluçoes");
        pessoaJuridica.setCnpj("26.135.002/0001-06");
        pessoaJuridica.setRamoAtividade("Transportes");
        pessoaJuridica.setInscricaoEstadual("00X.23.586.63");
        pessoaJuridica.setFundacao("21/02/1991");
        System.out.println("N° DE REGISTRO "+pessoaJuridica.getId()+"\nEMPRESA: "+pessoaJuridica.getNome()+"\nCNPJ "+pessoaJuridica.getCnpj());
        System.out.println("------------------------------------------------------");
    }

    private static void infoPessoaFisica() {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setId(02L);
        pessoaFisica.setNome("Angelo Petrez");
        pessoaFisica.setCpf("223.584.895-65");
        pessoaFisica.setIdade(25);
        pessoaFisica.setOcupacao("Mecânico");
        System.out.println("N° DE REGISTRO "+pessoaFisica.getId()+" \nNome: "+pessoaFisica.getNome()+" \nCPF: "+pessoaFisica.getCpf());
    }
}
