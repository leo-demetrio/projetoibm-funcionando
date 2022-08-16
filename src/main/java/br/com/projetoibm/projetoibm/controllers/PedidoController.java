package br.com.projetoibm.projetoibm.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoibm.projetoibm.models.ClientModel;
import br.com.projetoibm.projetoibm.models.PedidoModel;
import br.com.projetoibm.projetoibm.services.ClientService;
import br.com.projetoibm.projetoibm.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	@Autowired
	PedidoService pedidoService;
	
	@Autowired
	ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<PedidoModel>> listClients() {
		return ResponseEntity.status(HttpStatus.OK).body(pedidoService.listPedidos());
	}
	
	@PostMapping
	public ResponseEntity<PedidoModel> saveClient(@RequestBody PedidoModel pedidoModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.save(pedidoModel));
	}
	
	@PutMapping("/{pedidoId}/cliente/{clienteId}")
	public ResponseEntity<Object> updateClient(@PathVariable(value = "pedidoId") int pedidoId, @PathVariable(value = "clienteId") int clienteId) {
	Optional<PedidoModel> pedidoModel = pedidoService.findById(pedidoId);
	Optional<ClientModel> clientModel = clientService.findById(clienteId);
	pedidoModel.get().setCliente(clientModel.get());	
	return ResponseEntity.status(HttpStatus.OK).body(pedidoService.save(pedidoModel.get()));
	}
}