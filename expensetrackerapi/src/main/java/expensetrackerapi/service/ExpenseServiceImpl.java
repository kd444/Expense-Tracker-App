package expensetrackerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expensetrackerapi.entity.Expense;
import expensetrackerapi.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepo;
    
    @Override
    public List<Expense> getAllExpenses() {
        // TODO Auto-generated method stub
        return expenseRepo.findAll();
    }

}
