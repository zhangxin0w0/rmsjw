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

    //商品下架
    @Override
    public ResponseCode toType(String id) {
        //参数非空判断
        if(id == null || "".equals(id)){
            return ResponseCode.toDefeated("非法参数！");
        }

        int i = Integer.parseInt(id);
        //查找商品
        Product p = productDao.selectById(i);
        if(p == null){
            return ResponseCode.toDefeated("商品不存在！");
        }
        //修改商品信息
        int i2 = productDao.updateById(i);
        if(i2<0){
            return ResponseCode.toDefeated("商品下架失败！");
        }

        return ResponseCode.toSuccess(i2);
    }
}
