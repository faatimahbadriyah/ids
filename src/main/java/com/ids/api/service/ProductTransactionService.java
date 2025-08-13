package com.ids.api.service;

import com.ids.api.model.ProductTransaction;
import com.ids.api.dto.ProductTransactionDTO;
import com.ids.api.repository.ProductTransactionRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductTransactionService {

    private final ProductTransactionRepository repository;

    public ProductTransactionService() {
        this.repository = new ProductTransactionRepository();
    }

    public List<ProductTransactionDTO> getViewData() {
        List<ProductTransaction> rawData = repository.getAllTransactions();

        return rawData.stream().map(tx -> new ProductTransactionDTO(
            tx.getId(),
            tx.getProductId(),
            tx.getProductName(),
            tx.getAmount(),
            tx.getCustomerName(),
            mapStatus(tx.getStatus()),
            tx.getTransactionDate(),
            tx.getCreateBy(),
            tx.getCreateOn()
        )).collect(Collectors.toList());
    }

    private String mapStatus(int status) {
        return status == 0 ? "SUCCESS" : "FAILED";
    }
}
