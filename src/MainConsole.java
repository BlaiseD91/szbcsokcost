/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Székely Balázs Csaba, 2024-02-24
 */

import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        fejlec();
        Koltseg koltseg = new Koltseg(bekeres("Szállítási"), bekeres("Üzleti"), bekeres("Javítási"));
        mentes(koltseg);
    }

    private void fejlec() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");     
    }

    private String bekeres(String koltsegnem) {
        Scanner sc = new Scanner(System.in);
        System.out.print("──────────────────────────────────────────\n" + koltsegnem + " költség: ");
        String adat = sc.nextLine();
        sc.close();
        return adat;
    }

    private void mentes(Koltseg koltseg) {
        Filehandler fh = new Filehandler();
        fh.mentesFajlba(koltseg);
    }
}
