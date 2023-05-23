package co.edu.sena.javaavanzado.model.repository;

import co.edu.sena.javaavanzado.model.Products;
import co.edu.sena.javaavanzado.model.User;
import co.edu.sena.javaavanzado.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsRepositoryImpl implements Repository<Products>{

    private String sql = null;
    @Override
    public List<Products> listAllObj() throws SQLException {
        sql = "SELECT p.product_id, p.product_name, p.product_value, p.category_id FROM products_tbl p ORDER BY p.product_name;";
        List<Products> products = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ){
            while ( rs.next() ) {
                Products u = createObj(rs);
                products.add( u );
            }
        }
        return products;
    }

    @Override
    public Products byIdObj(Integer id) throws SQLException {
        sql = "SELECT  p.product_id, p.product_name, p.product_value, p.category_id FROM products_tbl p WHERE p.product_id = ?";
        Products products = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    products = createObj(rs);
                }
            }
        }
        return products;
    }

    @Override
    public Integer saveObj(Products products) throws SQLException {
        int rowsAffected = 0;

        if (products.getProduct_id() != null && products.getProduct_id() > 0){
            sql = "UPDATE products_tbl SET product_name = ?, product_value = ?, category_id = ? WHERE product_id = ?";
        } else {
            sql = "INSERT INTO products_tbl (product_name, product_value, category_id)" +
                    "VALUES(UPPER(?), UPPER(?), ?);";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, products.getProduct_name());
            ps.setString(2, products.getProduct_value());
            ps.setInt(3, products.getCategory_id());
            if (products.getProduct_id() != null && products.getProduct_id() > 0){
                ps.setInt(4, products.getProduct_id());
            }

            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "DELETE FROM products_tbl WHERE product_id = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public Products createObj(ResultSet rs) throws SQLException {
        Products products = new Products();
        products.setProduct_id(rs.getInt("product_id"));
        products.setProduct_name(rs.getString("product_name"));
        products.setProduct_value(rs.getString("product_value"));
        products.setCategory_id(rs.getInt("category_id"));
        return products;
    }
}
