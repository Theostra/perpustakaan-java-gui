/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bobon.perpustakaan.model;

/**
 *
 * @author PCL-B00-00
 */
public class Pustakawan extends Pengguna{
    
    public Pustakawan(String nama, String email, long id) {
        super(nama, email, id);
    }
    
    public boolean tambahBuku(){
        return true;
    }
    
    public boolean hapusBuku(){
        return true;
    }
    
    public boolean PerbaharuiBuku(){
        return true;
    }
    
    public boolean lihatbukuPinjam(){
        return true;
    }
}
