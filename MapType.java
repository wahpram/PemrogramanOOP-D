package com.Tugas;

import java.util.HashMap;
import java.util.Map;

public class MapType {
    public static void main(String[] args) {
        Map<String, Backpack> backpacks = new HashMap();
        backpacks.put("index-1", new Backpack("Keyboard", 500.5));
        backpacks.put("index-2", new Backpack("Mouse", 500.5));
        backpacks.put("index-3", new Backpack("Deskmat", 500.5));
        backpacks.put("index-1", new Backpack("MiniKeyboard", 500.5));
        backpacks.put("index-5", new Backpack("Speaker", 500.5));

        System.out.println("Barang Sebelum : (ukuran= "+backpacks.size()+")");
        for (String index : backpacks.keySet()){
            System.out.println("\t " +index+" "+backpacks.get(index));
        }

        backpacks.remove("index-3");

        System.out.println("\nBarang Sesudah : (ukuran= "+backpacks.size()+")");
        for (String index : backpacks.keySet()){
            System.out.println("\t " +index+" "+backpacks.get(index));
        }
    }

}
