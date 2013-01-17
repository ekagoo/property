/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eka.property.domain;

import java.util.Currency;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table
public class ItemProperty {
    @Id
    @GeneratedValue
    private Integer Id;
    
    private String alamat;
    
    private Currency harga;


    @ManyToOne
    @JoinColumn(name="id_tipe",nullable=false)
    private TipeProperty id_tipe;

    private String keterangan;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Currency getHarga() {
        return harga;
    }

    public void setHarga(Currency harga) {
        this.harga = harga;
    }

    public TipeProperty getId_tipe() {
        return id_tipe;
    }

    public void setId_tipe(TipeProperty id_tipe) {
        this.id_tipe = id_tipe;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
}
