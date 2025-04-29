package HomeWork.BankStream;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//1
          List<Double> doubles = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .map(Transaction::getAmount)
                .collect(Collectors.toList());
//2
        List<Transaction> typeList = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .filter(transaction -> transaction.getType() == Transaction.Type.DEPOSIT)
                .toList();
//3
        List<LocalDate> localDates = accounts.stream()
                .flatMap(l -> l.getTransactions().stream())
                .filter(t -> t.getType() == Transaction.Type.WITHDRAWAL)
                .map(Transaction::getDate)
                .toList();
        System.out.println(localDates);

//4
        Stream<String> stringStream = accounts.stream()
                .map(BankAccount::getOwnerName);
        stringStream
                .forEach(System.out::println);

 //5

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
        Map<String, Integer> stringIntegerMap = accounts.stream()
                .collect(Collectors.toMap(BankAccount::getAccountNumber, bankAccount -> bankAccount.getTransactions().size()));
        System.out.println(stringIntegerMap);

        //9
        boolean anyMatch = accounts.stream()
                .anyMatch(bankAccount -> bankAccount.getTransactions().isEmpty());

        //10

        Set<String> set = accounts.stream()
                .filter(bankAccount -> bankAccount.getTransactions().stream()
                        .anyMatch(transaction -> transaction.getType() == Transaction.Type.DEPOSIT))
                .map(BankAccount::getOwnerName)
                .collect(Collectors.toSet());
        System.out.println(set);


    }
}
