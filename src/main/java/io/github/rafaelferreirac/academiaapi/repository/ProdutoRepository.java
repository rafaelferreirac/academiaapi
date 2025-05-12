package io.github.rafaelferreirac.academiaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rafaelferreirac.academiaapi.model.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
