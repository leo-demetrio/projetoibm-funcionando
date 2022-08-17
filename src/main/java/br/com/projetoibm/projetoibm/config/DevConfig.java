package br.com.projetoibm.projetoibm.config;

import br.com.projetoibm.projetoibm.models.ClientModel;
import br.com.projetoibm.projetoibm.models.PedidoModel;
import br.com.projetoibm.projetoibm.models.ProdutoModel;
import br.com.projetoibm.projetoibm.repositories.ClientRepository;
import br.com.projetoibm.projetoibm.repositories.PedidoRepository;
import br.com.projetoibm.projetoibm.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;


@Configuration

public class DevConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clienteRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;
    private LocalDate data = LocalDate.now();

    @Override
    public void run(String... args) throws Exception {
        ClientModel cliente1 = new ClientModel(null, "Maria Brown", "988888888", "maria@gmail.com", "Av Leo Borges");
        ClientModel cliente2 = new ClientModel(null, "Lais Brown", "988888888", "lais@gmail.com", "Av Leo Borges");

        PedidoModel pedido1 = new PedidoModel(null, this.data, cliente1);
        PedidoModel pedido2 = new PedidoModel(null, this.data, cliente2);


        ProdutoModel p1 = new ProdutoModel(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);
        ProdutoModel p2 = new ProdutoModel(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);
        ProdutoModel p3 = new ProdutoModel(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);


        clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
        pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

    }
}