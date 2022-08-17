package br.com.projetoibm.projetoibm.repositories;


import br.com.projetoibm.projetoibm.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.projetoibm.projetoibm.models.ClientModel;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
	boolean existsBycpf(String cpf);

	@Query(nativeQuery = true,
			value = "SELECT * FROM cliente")
	List<ClientModel> listClientes();

	@Query(nativeQuery = true,
			value = "SELECT * FROM cliente WHERE email LIKE (:pesquisa)")
	List<ClientModel> listClientesPorPalavra(String pesquisa);

	@Query(nativeQuery = true,
			value = "SELECT nome, sum(preco_produto) FROM produto group by nome")
	Integer listaProdutoGenerico();
}
