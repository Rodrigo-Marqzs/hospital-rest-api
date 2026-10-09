package com.rodrigo.hospitalapi.model;

public class TesteMedico {

    public static void main(String[] args) {

        Medico medico = new Medico(
                "John Frusciante",
                "Cardiologista",
                "1234");

        medico.setEspecialidade("Neurologista");


        System.out.println(medico.getNome());
        System.out.println(medico.getCrm());
        System.out.println(medico.getEspecialidade());

    }
}
