package com.dao;

import java.util.List;

import com.bank.Bank;

public interface BankDao 
{
int addBank(Bank bank);
boolean removeBank(int bid);
List<Bank> displayAllBanks();

}
