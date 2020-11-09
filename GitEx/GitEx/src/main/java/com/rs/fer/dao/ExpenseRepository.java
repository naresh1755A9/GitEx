package com.rs.fer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.fer.bean.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
