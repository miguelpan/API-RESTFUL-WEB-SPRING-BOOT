package br.com.springboot.service.impl;

import br.com.springboot.domain.repository.Pedidos;
import br.com.springboot.service.PedidoServices;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceimpl implements PedidoServices {
    private Pedidos repository;

    public PedidoServiceimpl(Pedidos repository) {
        this.repository = repository;
    }
}
