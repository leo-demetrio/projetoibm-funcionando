package br.com.projetoibm.projetoibm.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoibm.projetoibm.DTOs.PedidoDTO;
import br.com.projetoibm.projetoibm.models.PedidoModel;
import br.com.projetoibm.projetoibm.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<PedidoModel>> listClients() {
		return ResponseEntity.status(HttpStatus.OK).body(pedidoService.listPedidos());
	}
	
	
	@PostMapping
	public ResponseEntity<PedidoModel> saveClient(@RequestBody PedidoDTO pedidoDTO) {
		var pedidoModel = new PedidoModel();
		BeanUtils.copyProperties(pedidoDTO, pedidoModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.save(pedidoModel));
	}
}
