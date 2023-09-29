package com.example.provan1_23_2;

import java.io.Serializable;

class AtividadeComplementar implements Serializable {
    String nomeEstudante;
    String emailInstitucional;
    String descricaoAtiv;
    String horasPret;
    String categoriaAtiv;

    public AtividadeComplementar(String nomeEstudante, String emailInstitucional, String descricaoAtiv, String horasPret, String categoriaAtiv) {
        this.nomeEstudante = nomeEstudante;
        this.emailInstitucional = emailInstitucional;
        this.descricaoAtiv = descricaoAtiv;
        this.horasPret = horasPret;
        this.categoriaAtiv = categoriaAtiv;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getDescricaoAtiv() {
        return descricaoAtiv;
    }

    public void setDescricaoAtiv(String descricaoAtiv) {
        this.descricaoAtiv = descricaoAtiv;
    }

    public String getHorasPret() {
        return horasPret;
    }

    public void setHorasPret(String horasPret) {
        this.horasPret = horasPret;
    }

    public String getCategoriaAtiv() {
        return categoriaAtiv;
    }

    public void setCategoriaAtiv(String categoriaAtiv) {
        this.categoriaAtiv = categoriaAtiv;
    }

    @Override
    public String toString() {
        return "Estudante: " + nomeEstudante + ".\nE-mail: " + emailInstitucional + ".\nDescrição da atividade: " + descricaoAtiv;
    }
}
