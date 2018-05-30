package com.example.user.mahasiswacobacoba.model;

/**
 * Created by user on 23/05/2018.
 */

public class Mahasiswa {
    private String nama, nim, email, foto;

    public Mahasiswa (){}

    public Mahasiswa(String nama, String nim, String email, String foto){
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    //mendapatkan variabel nama
    public String getNama(){
        return nama;
    }

    //mengisi varibel nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mendapatkan variabel nim
    public String getNim(){
        return nim;
    }

    //mengisi varibel nim
    public void setNim(String nim){
        this.nim = nim;
    }

    //mendapatkan variabel email
    public String getEmail(){
        return email;
    }

    //mengisi varibel email
    public void setEmail(String email){
        this.email = email;
    }

    //mendapatkan variabel foto
    public String getFoto(){
        return foto;
    }

    //mengisi varibel foto
    public void setFoto(String foto){
        this.foto = foto;
    }
}
