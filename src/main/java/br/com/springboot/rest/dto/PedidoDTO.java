package br.com.springboot.rest.dto;

import br.com.springboot.domain.entity.ItemPedido;

import java.math.BigDecimal;
import java.util.List;

public class PedidoDTO {
    private Integer cliente;
    private BigDecimal total;
    private List<ItemPedidoDTO> items;
}
