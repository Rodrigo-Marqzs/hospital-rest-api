package com.rodrigo.hospitalapi.model;

public class TesteConsulta {

    public static void main(String[] args) {

        Paciente paciente = new Paciente(
                "Rodrigo",
                "00000000000",
                "rodrigo@gmail.com");

        Paciente paciente2 = new Paciente(
                "Maria",
                "12345678911",
                "maria@gmail.com");

        Medico medico = new Medico(
                "John Frusciante",
                "Cardiologista",
                "1234");

        Consulta consulta = new Consulta(
                1,
                paciente,
                medico,
                "dor no peito");

        consulta.setMotivo("Falta de ar");
        consulta.setPaciente(paciente);


        System.out.println(consulta.getId());
        System.out.println(consulta.getPaciente().getNome());
        System.out.println(consulta.getMedico().getNome());
        System.out.println(consulta.getMotivo());


    }
}
