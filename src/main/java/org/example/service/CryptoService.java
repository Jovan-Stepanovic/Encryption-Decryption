package org.example.service;

import org.example.crypto.Cryptographer;
import org.example.crypto.CryptographerFactory;
import org.example.model.Request;
import org.example.repository.Repository;

public class CryptoService {
    public void run(String ... args) {
        Request request = new Request(args);

        Cryptographer cryptographer = CryptographerFactory.createCryptographer(request.getAlgorithm());
        String processedData = cryptographer.processData(
                request.getData(),
                request.getKey(),
                request.getOperation()
        );

        printData(processedData, request.getOutputFileName());
    }

    private void printData(String data, String outputFile) {
        if (outputFile == null) {
            System.out.println(data);
        } else {
            Repository.writeDataToFile(outputFile, data);
        }
    }
}
