package expensetrackerapi.service;

import java.util.List;

import expensetrackerapi.entity.Expense;

public interface ExpenseService {
    
    List<Expense> getAllExpenses();

}
