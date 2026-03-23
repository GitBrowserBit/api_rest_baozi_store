package com.example.apiRestBaoziStore.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiRestBaoziStore.model.Pedido;
import com.example.apiRestBaoziStore.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoRepository repository;

    public PedidoController(PedidoRepository pedidoRepository) {
        this.repository = pedidoRepository;
    }

    // buscar todos
    @GetMapping
    public List<Pedido> findAll() {
        return repository.findAll();
    }

    // buscar por id
    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // criar
    @PostMapping
    public Pedido create(@RequestBody Pedido pedido) {
        return repository.save(pedido);
    }

    // atualizar
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @RequestBody Pedido pedido) {
        return repository.findById(id).map(record -> {

        	record.setClienteId(pedido.getClienteId());
        	record.setProdutoId(pedido.getProdutoId());
            record.setQuantidade(pedido.getQuantidade());

            Pedido updated = repository.save(record);
            return ResponseEntity.ok(updated);

        }).orElse(ResponseEntity.notFound().build());
    }

    // deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        return repository.findById(id).map(record -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}