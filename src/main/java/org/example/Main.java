package org.example;

import org.example.service.CryptoService;

public class Main {
    public static void main(String[] args) {
        CryptoService service = new CryptoService();
        service.run("-alg", "shift",
                "-mode", "dec",
                "-key", "10",
                "-data", "dbokcebo");
    }
}