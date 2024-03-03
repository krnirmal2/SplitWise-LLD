package com.example.splitwise_inter.SplitwiseAlgorithm.algorithms;

import com.example.splitwise_inter.models.Transaction;

import java.util.HashMap;
import java.util.List;

public interface SettlementStrategy {
    List<Transaction> settleBalanceSheet(HashMap<String, Integer> balanceSheet);
}
