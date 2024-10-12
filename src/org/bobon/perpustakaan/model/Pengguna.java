/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bobon.perpustakaan.model;

/**
 *
 * @author theo
 */
public class Pengguna {
    private String nama;
    private String email;
    private long id;

    public Pengguna(String nama, String email, long id) {
        this.nama = nama;
        this.email = email;
        this.id = id;
    }
        
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
}
