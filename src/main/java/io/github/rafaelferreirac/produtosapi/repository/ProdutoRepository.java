package io.github.rafaelferreirac.produtosapi.repository;

import io.github.rafaelferreirac.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
