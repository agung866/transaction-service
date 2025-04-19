package com.example.demo.controller;

import com.example.demo.model.request.PostProductRequest;
import com.example.demo.service.PostProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    PostProductService postProductService;

    @PostMapping("/insert-product")
    public void postProductService(@RequestBody List<PostProductRequest> request){
        postProductService.execute(request);
    }

}
