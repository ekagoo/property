/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eka.property.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table
public class TipeProperty {
    @Id
    @GeneratedValue
    private Integer id_peserta;
    
    private String nama;
    
}
