package com.springboot.demoSpringBoot.dao;

import com.springboot.demoSpringBoot.dao.interfaces.IProductoDAO;
import com.springboot.demoSpringBoot.dto.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoDAO implements IProductoDAO {

    @Override
    public Producto findById(Integer id) {
        return new Producto(id,"MacBook Pro 15", 195000d);
    }
}
