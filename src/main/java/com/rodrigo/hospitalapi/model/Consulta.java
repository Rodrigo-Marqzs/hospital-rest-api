package com.rodrigo.hospitalapi.model;

import jakarta.persistence.*;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Medico medico;
    private String motivo;

    public Consulta(Paciente paciente, Medico medico, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.motivo = motivo;

    }

    protected Consulta(){

    }

    public Long getId() {
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
