package com.ids.api.controller;

import com.google.gson.Gson;
import com.ids.api.service.ProductTransactionService;
import com.ids.api.dto.ProductTransactionDTO;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewDataController extends HttpServlet {

    private final ProductTransactionService service = new ProductTransactionService();
    private final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<ProductTransactionDTO> data = service.getViewData();

        Map<String, Object> response = new HashMap<>();
        response.put("data", data);
        response.put("status", List.of(
            Map.of("id", 0, "name", "SUCCESS"),
            Map.of("id", 1, "name", "FAILED")
        ));

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(gson.toJson(response));
    }
}
