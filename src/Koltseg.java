/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Székely Balázs Csaba, 2024-02-24
 */

public class Koltseg {
    Double szallitas;
    Double uzlet;
    Double javitas;

    public Koltseg(String szallitas, String uzlet, String javitas) {
        try {
            this.szallitas = Double.parseDouble(szallitas);
            this.uzlet = Double.parseDouble(uzlet);
            this.javitas = Double.parseDouble(javitas);
        } catch (NumberFormatException e) {
            System.err.println("Hiba a megadott adatokban! Részletek: " + e);
        }
        
    }
    
}
