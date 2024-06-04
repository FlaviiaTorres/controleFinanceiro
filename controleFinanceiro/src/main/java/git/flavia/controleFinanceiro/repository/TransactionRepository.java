package git.flavia.controleFinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import git.flavia.controleFinanceiro.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
