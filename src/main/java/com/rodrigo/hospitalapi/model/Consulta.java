package com.rodrigo.hospitalapi.model;

public class Consulta {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private String motivo;

    public Consulta(int id, Paciente paciente, Medico medico, String motivo) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.motivo = motivo;

    }

    public int getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
