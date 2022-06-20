package br.com.springboot.rest.controller;

import br.com.springboot.service.PedidoServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    private PedidoServices services;

    public PedidoController(PedidoServices services) {
        this.services = services;
    }
}
