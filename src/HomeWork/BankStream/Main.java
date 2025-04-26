package HomeWork.BankStream;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount("12345", "Иван Иванов", List.of(
                        new Transaction(LocalDate.of(2025, 1, 5), Transaction.Type.DEPOSIT, 500.0),
                        new Transaction(LocalDate.of(2025, 2, 10), Transaction.Type.WITHDRAWAL, 120.0)
                )),
                new BankAccount("67890", "Мария Петрова", List.of(
                        new Transaction(LocalDate.of(2025, 3, 1), Transaction.Type.DEPOSIT, 1500.0),
                        new Transaction(LocalDate.of(2025, 3, 5), Transaction.Type.WITHDRAWAL, 200.0),
                        new Transaction(LocalDate.of(2025, 3, 7), Transaction.Type.DEPOSIT, 300.0)
                )),
                new BankAccount("54321", "Олег Смирнов", List.of(
                        new Transaction(LocalDate.of(2025, 4, 1), Transaction.Type.WITHDRAWAL, 50.0)
                ))
        );


        List<Double> doubles = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .map(Transaction::getAmount)
                .collect(Collectors.toList());

        List<Transaction> typeList = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .filter(transaction -> transaction.getType() == Transaction.Type.DEPOSIT)
                .toList();

        List<Transaction> transactionList = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .filter(t -> t.getType() == Transaction.Type.WITHDRAWAL)
                .toList();


        accounts.stream()
                .map(BankAccount::getOwnerName)
                .forEach(System.out::println);

        List<Transaction> list = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .filter(transaction -> transaction.getAmount() > 1000)
                .toList();
//6
        List<Transaction> transactions = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .sorted(Comparator.comparing(Transaction::getAmount))
                .toList();

//8

    }
}
