package com.Tugas;

class Backpack {
    private String nama;
    private double berat;

    public Backpack(String nama, double berat){
        this.nama = nama;
        this.berat = berat;
    }

    @Override
    public String toString(){
        return "Barang : " +nama+ ", berat : "+berat;
    }
}
