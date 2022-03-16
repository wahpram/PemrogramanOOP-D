package com.Tugas;

import java.util.ArrayList;
import java.util.List;

public class ListType {
    public static void main(String[] args) {

        List<String> backPack = new ArrayList<>();

        backPack.add("Keyboard");
        backPack.add("Deskmat");
        backPack.add("Mouse");

        System.out.println("Isi sebelum : ");
        for (int i = 0; backPack.size() > i; i++){
            System.out.println("isi ke- "+(i+1) + " : "+backPack.get(i));
        }

        backPack.remove("Mouse");

        System.out.println("Isi sesudah : ");
        for (int i = 0; backPack.size() > i; i++){
            System.out.println("isi ke- "+(i+1) + " : "+backPack.get(i));
        }

    }
}
