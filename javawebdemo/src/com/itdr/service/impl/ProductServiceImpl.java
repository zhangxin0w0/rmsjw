package com.itdr.service.impl;

import com.itdr.common.ResponseCode;
import com.itdr.dao.ProductDao;
import com.itdr.pojo.Product;
import com.itdr.service.ProductService;
import com.mysql.jdbc.StringUtils;

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

    //商品模糊搜索
    @Override
    public ResponseCode fuzzySearch(String key) {
        if(StringUtils.isNullOrEmpty(key)){
            return ResponseCode.toDefeated("非法参数");
        }

        String keyWord = "%"+key+"%";
        List<Product> li = productDao.selectByPname(keyWord);
        return ResponseCode.toSuccess(li);
    }

    //新增商品
    @Override
    public ResponseCode addOne(String pname, String pnum, String price) {
        //参数非空判断
        //根据商品名称查询商品是否存在
        Product p = productDao.selectOneByPname(pname);
        if(p != null){
            return ResponseCode.toDefeated("商品已存在");
        }

        Double d = Double.parseDouble(price);
        Integer m = Integer.parseInt(pnum);
        //当商品不存在的时候再新增
        int i = productDao.insertOne(pname,d,m);
        return ResponseCode.toSuccess(i);
    }
}
