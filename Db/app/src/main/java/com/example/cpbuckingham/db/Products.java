package com.example.cpbuckingham.db;

/**
 * Created by cpbuckingham on 3/9/16.
 */
public class Products {

    private int _id;
    private String _productname;

    public Products(String productname) {
        this._productname = productname;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }
}
