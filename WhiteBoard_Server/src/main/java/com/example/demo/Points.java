package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "points")
public class Points {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "color")
    private int color;

    @Column(name = "fog")
    private boolean fog;

    @Column(name = "type")
    private String type;

    @Column(name = "width")
    private int width;

    @Column(name = "lx")
    private float lx;

    @Column(name = "mx")
    private float mx;

    @Column(name = "ly")
    private float ly;

    @Column(name = "my")
    private float my;


    // Геттеры
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public boolean isFog() {
        return fog;
    }

    public float getMx() {
        return mx;
    }

    public float getMy() {
        return my;
    }

    public float getLx() {
        return lx;
    }

    public float getLy() {
        return ly;
    }

    // Сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setFog(boolean fog) {
        this.fog = fog;
    }

    public void setMx(float mx) {
        this.mx = mx;
    }

    public void setMy(float my) {
        this.my = my;
    }

    public void setLx(float lx) {
        this.lx = lx;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }
}    
