package br.com.projetoibm.projetoibm.controllers;

import br.com.projetoibm.projetoibm.models.ClientModel;
import br.com.projetoibm.projetoibm.models.ProdutoModel;
import br.com.projetoibm.projetoibm.repositories.ClientRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<ClientModel> listClientes(@RequestParam("pesquisa") String pesquisa){
        return clientRepository.listClientesPorPalavra(pesquisa);
    }
    @GetMapping("/generico")
    public Integer listaProdutoGenerico(){
        return clientRepository.listaProdutoGenerico();
    }
}
