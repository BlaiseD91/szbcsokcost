/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Székely Balázs Csaba, 2024-02-24
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    public void mentesFajlba(Koltseg koltseg) {
        try {
            FileWriter fw = new FileWriter("adat.txt", true);
            fw.write(koltseg.szallitas.toString() + ":" + koltseg.uzlet.toString() + ":" + koltseg.javitas.toString() + "\n");
            fw.close(); 
        } catch (IOException e) {
            System.err.println("Hiba az adatok fájlba mentésénél! Részletek: " + e);
        }
    }
}
