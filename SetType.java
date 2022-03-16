package com.Tugas;

import java.util.*;

public class SetType {
    public static void main(String[] args) {

        Set<String> backpack = new HashSet<>();

        backpack.add("Mouse");
        backpack.add("Mouse");
        backpack.add("Keyboard");
        backpack.add("Mouse");
        backpack.add("Deskmat");

        System.out.println("Barang sebelum (ukuran = " +backpack.size()+ ")");

        //menampilkan urutan type dengan iterator
        for (Iterator iterator = backpack.iterator(); iterator.hasNext();){
            System.out.println("\t "+iterator.next());
        }

        backpack.remove("Keyboard");

        System.out.println("Barang sesudah (ukuran = " +backpack.size()+ ")");

        for (Iterator iterator = backpack.iterator(); iterator.hasNext();){
            System.out.println("\t "+iterator.next());
        }

    }
}
