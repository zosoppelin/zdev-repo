package com.springboot.demoSpringBoot.Controllers;

import com.springboot.demoSpringBoot.dao.interfaces.IProductoDAO;
import com.springboot.demoSpringBoot.dto.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoDAO productoDao;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Producto getProducto(@PathVariable Integer id){
        return productoDao.findById(id);
    }
}