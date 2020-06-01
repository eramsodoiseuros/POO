package com.company;

import javax.xml.stream.Location;
import java.io.Serializable;
import java.util.*;

public class Utilizador implements Serializable {
    private String id;
    private String nome;
    private String email;
    private String pwd;
    private int rating;
    private double localizacaoX;
    private double localizacaoY;
    private int estado;

    private Set<Encomenda> historico;

    public Utilizador(String id,String email, String pwd, String nome, int rating, double localizacaoX, double localizacaoY, Set<Encomenda> historico, int estado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pwd = pwd;
        this.rating = rating;
        this.localizacaoX = localizacaoX;
        this.localizacaoY = localizacaoY;
        this.historico = historico;
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Utilizador() {
        this.id = null;
        this.nome = null;
        this.email = null;
        this.pwd = null;
        this.rating = 0;
        this.localizacaoX = 0;
        this.localizacaoY = 0;
        this.historico = new HashSet<>() ;
        this.estado = 0;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setHistorico(Set<Encomenda> historico) {
        this.historico = historico;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getLocalizacaoX() {
        return localizacaoX;
    }

    public double getLocalizacaoY() {
        return localizacaoY;
    }


    public void setLocalizacaoX(double localizacaoX) {
        this.localizacaoX = localizacaoX;
    }

    public void setLocalizacaoY(double localizacaoY) {
        this.localizacaoY = localizacaoY;
    }


    public Set<Encomenda> getHistorico() {
        return historico;
    }

    public void setHistorico(TreeSet<Encomenda> historico) {
        this.historico = historico;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilizador that = (Utilizador) o;
        return rating == that.rating &&
                Double.compare(that.localizacaoX, localizacaoX) == 0 &&
                Double.compare(that.localizacaoY, localizacaoY) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(historico, that.historico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, rating, localizacaoX, localizacaoY, historico);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Utilizador{").append("id =").append(id)
                .append(", nome = ").append(nome)
                .append(", rating = ").append(rating)
                .append(", localizaçãoX = ").append(localizacaoX)
                .append(", localizaçãoY = ").append(localizacaoY)
                .append(", historico = ").append(historico)
                .append("}; \n");
        return sb.toString();
    }



}
