package com.iesdoctorbalmis.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long id;
    private String referencia;
    private String descripcion;
    private BigDecimal precioVenta;
    private BigDecimal precioCosto;
    private String imagen;
    private Integer stock;
}