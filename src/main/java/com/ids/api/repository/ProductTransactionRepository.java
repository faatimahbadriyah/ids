package com.ids.api.repository;

import com.ids.api.model.ProductTransaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;

public class ProductTransactionRepository {

    private Connection connection;

    public ProductTransactionRepository() {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/main/resources/application.properties"));

            String url = props.getProperty("db.url");
            String username = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException("❌ Failed to connect to database", e);
        }
    }

    public List<ProductTransaction> getAllTransactions() {
        List<ProductTransaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM product_transaction";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ProductTransaction tx = new ProductTransaction(
                    rs.getLong("id"),
                    rs.getString("product_id"),
                    rs.getString("product_name"),
                    rs.getInt("amount"),
                    rs.getString("customer_name"),
                    rs.getInt("status"),
                    rs.getString("transaction_date"),
                    rs.getString("create_by"),
                    rs.getString("create_on")
                );
                transactions.add(tx);
            }

        } catch (SQLException e) {
            throw new RuntimeException("❌ Failed to fetch transactions", e);
        }

        return transactions;
    }
}
