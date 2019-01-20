package com.springboot.demoSpringBoot.dao.interfaces;

import com.springboot.demoSpringBoot.dto.Producto;

public interface IProductoDAO {
    Producto findById(Integer id);
}
