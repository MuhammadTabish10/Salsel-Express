package com.salsel.service;

import com.salsel.dto.ProductTypeDto;

import java.util.List;

public interface ProductTypeService {
    ProductTypeDto save(ProductTypeDto productTypeDto);
    List<ProductTypeDto> getAll();
    ProductTypeDto findById(Long id);
    ProductTypeDto findByCode(String code);
    void deleteById(Long id);
    ProductTypeDto update(Long id, ProductTypeDto productTypeDto);
}
