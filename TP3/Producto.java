package TP3;

public class Producto {
    private String IDproducto;
    private String nombreProducto;
    private String categoria;

    public Producto(String producto, String IDproducto) {
        this.nombreProducto = producto;
        this.IDproducto = IDproducto;
    }

    public Producto() {
    }

    public String getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(String IDproducto) {
        this.IDproducto = IDproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}