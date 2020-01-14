package com.itdr.service.impl;

import com.itdr.common.ResponseCode;
import com.itdr.dao.ProductDao;
import com.itdr.pojo.Product;
import com.itdr.service.ProductService;

import java.util.List;

/**
 * ClassName: ProductServcieImpl
 * 日期: 2020/1/14 15:34
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao = new ProductDao();

    @Override
    public ResponseCode getAllProduct() {
        List<Product> productList = productDao.selectAll();
        return ResponseCode.toSuccess(productList);
    }
}
