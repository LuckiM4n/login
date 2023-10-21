package model;

// Construir um objeto de maneira flexível

// Template para Estruturar um método

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String perfil;

    public Usuario() {
    }

    // Construir um objeto de maneira flexível
    public Usuario id (int id){
        this.id = id;
        return this;
    }

    // Construir um objeto de maneira flexível
    public Usuario nome(String nome){
        this.nome = nome;
        return this;
    }

    // Construir um objeto de maneira flexível
    public Usuario email(String email){
        this.email = email;
        return this;
    }

    // Construir um objeto de maneira flexível
    public Usuario senha(String senha){
        this.senha = senha;
        return this;
    }

    // Construir um objeto de maneira flexível
    public Usuario perfil(String perfil){
        this.perfil = perfil;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }


}
