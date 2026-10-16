package com.iesdoctorbalmis.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.iesdoctorbalmis.spring.model.Cliente;
import com.iesdoctorbalmis.spring.model.TipoCliente;

@Component
public class ClienteRepositorio {
    private List<Cliente> clientes = new ArrayList<>();
    private Long proximoId = 1L;

    public Cliente guardar(Cliente cliente) {
        cliente.setId(proximoId++);
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> buscarTodos() {
        return new ArrayList<>(clientes);
    }

    public Cliente buscarPorId(Long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente actualizar(Cliente clienteActualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(clienteActualizado.getId())) {
                clientes.set(i, clienteActualizado);
                return clienteActualizado;
            }
        }
        return null;
    }

    public boolean eliminar(Long id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Cliente> buscarPorTipo(TipoCliente tipo) {
        List<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getTipoCliente() == tipo) {
                resultado.add(cliente);
            }
        }
        return resultado;
    }

    public Integer contar() {
        return clientes.size();
    }
}
