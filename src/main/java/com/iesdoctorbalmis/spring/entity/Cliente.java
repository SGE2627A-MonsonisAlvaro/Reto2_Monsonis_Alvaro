package com.iesdoctorbalmis.spring.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private Long id;
    private String codigoCliente;
    private String nombre;
    private String email;
    private String telefono;
    private TipoCliente tipoCliente;
    private LocalDate fechaAlta;
}
