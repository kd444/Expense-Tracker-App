package expensetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import expensetrackerapi.entity.Expense;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
