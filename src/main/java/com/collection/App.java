package com.collection;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.*;

import tools.jackson.databind.ObjectMapper;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.util.ArrayDeque;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // List
        // List<String> names = new ArrayList<>();
        // names.add("Budi");
        // names.add("Rizal");
        // names.add("Alvin");
        // names.add("Zakky");
        // names.add("Alvin");

        // System.out.println(names);

        // Set
        // Set<String> studentsKoda = new HashSet<>();
        // studentsKoda.add("Afif");
        // studentsKoda.add("Afif");
        // studentsKoda.add("Bando");

        // System.out.println(studentsKoda);
        // System.out.println(studentsKoda.size());

        // Map
        // Map<String, String> hewan = new HashMap<>();

        // hewan.put("Laut", "Anjing Laut");
        // hewan.put("Darat", "Anjing");

        // System.out.println(hewan.get("Anjing"));

        // Queue
        // Queue<String> queue = new ArrayDeque<>();
        // queue.offer("Nanang");
        // queue.offer("Nunung");
        // queue.offer("Neneng");
        // queue.offer("Nonong");
        // System.out.println(queue.poll());
        // System.out.println(queue.peek());

        // List<Account> accounts = new ArrayList<>();

        // accounts.add(new Account("ACC001", "Andi", 10000));
        // accounts.add(new Account("ACC002", "Budi", 2000_000));
        // accounts.add(new Account("ACC003", "Mandra", 20000));

        // System.out.println("Account List");

        // for (Account account : accounts) {
        // System.out.println(account.getAccountNumber() + " - " + account.getOwner());
        // }

        // Lamda Expression
        // List<Account> accounts = new ArrayList<>();

        // accounts.add(new Account("ACC001", "Andi", 10000));
        // accounts.add(new Account("ACC002", "Budi", 2000_000));
        // accounts.add(new Account("ACC003", "Mandra", 20000));

        // System.out.println("Lambda & Function Interface");
        // accounts.forEach(account -> {
        // System.out.println(account.getAccountNumber() + " - " + account.getOwner());
        // });

        // Map<String, Account> accountMap = new LinkedHashMap<>();

        // for (Account account : accounts) {
        // accountMap.put(account.getAccountNumber(), account);
        // }

        // Account selectedAccount = accountMap.get("ACC003");

        // if (selectedAccount != null) {
        // System.out.println("Pemilik: " + selectedAccount.getOwner());
        // }

        // ## Predicate<T>
        // Predicate<Account> eligible = account -> account.getBalance() >= 500_000;
        // System.out.println(eligible.test(accounts.get(0)));
        // System.out.println(eligible.test(accounts.get(1)));
        // System.out.println(isEligible(accounts.get(2)));

        // ## Function<T, R>
        // Account targetAccount = accounts.get(0);
        // Function<Account, String> getOwnerName = account -> account.getOwner();

        // System.out.println(getOwnerName.apply(accounts.get(0)));

        // Function<Account, Account> keepAsIs = Function.identity();
        // System.out.println("4. identity(): " +
        // keepAsIs.apply(targetAccount).getOwner());

        // Consumer<T>
        // Consumer<Account> cetakAccount = account ->
        // System.out.println(account.getOwner());

        // cetakAccount.accept(accounts.get(0));

        // Supllier
        // Supplier<String> getTittle = () -> "Account Management System";
        // System.out.println(getTittle.get());

        // STREAM API
        // ## Filter
        // List<Account> richAccounts = accounts.stream()
        // .filter(account -> account.getBalance() >= 500_000)
        // .toList();

        // richAccounts.forEach(account -> System.out.println(account.getOwner() +
        // account.getBalance()));

        // ## map()
        // List<String> ownerNames = accounts.stream()
        // .map(account -> account.getOwner()).toList();

        // System.out.println(ownerNames);

        // ## Sortred
        // List<Account> sortedAccounts = accounts.stream()
        // .sorted(Comparator.comparingDouble(Account::getBalance).reversed()).toList();
        // sortedAccounts
        // .forEach((account -> System.out.printf("%s : Rp %d%n",
        // account.getOwner(), account.getBalance())));

        // ## Reduce
        // double totalBalance = accounts.stream().map(Account::getBalance).reduce(0.0,
        // Double::sum);

        // System.out.printf("Total Saldo: Rp%.0f%n", totalBalance);

        // Optional
        // ## orElse()
        // Optional<Account> result = findAccount(accounts, "ACC999");
        // System.out.println(
        // result.map(Account::getOwner).orElse("Tidak ditemukan"));
        // System.out.println("Test");

        // try {
        // Account account = findAccount(accounts, "ACC001")
        // .orElseThrow(() -> new NoSuchElementException("Tidak ditemukan"));
        // System.out.println(account.getOwner());
        // } catch (NoSuchElementException e) {
        // System.out.println("Error : " + e.getMessage());
        // }

        // Reflection
        // showAccountMethods();

        // Serialization
        // try {
        // Account targetAccount = new Account("ACC001", "Andi", 200_000);

        // ObjectMapper objectMapper = new ObjectMapper();

        // String jsonResult = objectMapper.writeValueAsString(targetAccount);

        // System.out.println("======Hasil Serialization====");
        // System.out.println(jsonResult);

        // System.out.println("======Hasil Serialization (PRETTY PRINT)====");
        // String prettJson =
        // objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(targetAccount);

        // System.out.println(prettJson);
        // } catch (Exception e) {
        // System.out.println("Terjadi kesalah");
        // }
        // try {
        // System.out.println("Mulai Thread Tugas");
        // demoThread();

        // System.out.println("Mulai Executor Tugas");
        // demoExecutor();
        // System.out.println("Selesai Executor Tugas");
        // } catch (Exception e) {
        // System.out.println("Terjadi Kesalahan.. " + e.getMessage());
        // }
        // }

        // Thread
        // static void demoThread() throws InterruptedException {
        // Thread worker = new Thread(() -> {
        // System.out.println("Worker(Thread) sedang dijalankan");
        // });
        // worker.start();
        // worker.join();
        // System.out.println("Worker(Thread) sudah selsai!");
        // }

        // ExecutorService / ThreadPool
        // static void demoExecutor() throws Exception {
        // try (ExecutorService executor = Executors.newFixedThreadPool(1)) {
        // Future<String> taskA = executor.submit(() -> {
        // Thread.sleep(1000);
        // return "Task A: cek Saldo Andi";
        // });

        // Future<String> taskB = executor.submit(() -> {
        // Thread.sleep(9000);
        // return "Task B: cek Saldo Budi";
        // });

        // System.out.println(taskA.get());
        // System.out.println(taskB.get());

        // Garbage Collection
        System.out.println("=====DEMO JVM Memory=====");
        demoMemory();
    }

    static void demoMemory() {
        Account temporary = new Account("TEMP", "Sementara", 0);

        System.out.println("Pemilik akun: " + temporary.getOwner());

        temporary = null;

        System.out.println("Referensi temporary di lepas, Object bisa dibersihkan oleh Garbage Collection");
    }
    // }
    // Optional
    // ## orElse()
    // static Optional<Account> findAccount(
    // List<Account> accounts, String number) {
    // return accounts.stream().filter(account ->
    // account.getAccountNumber().equals(number)).findFirst();
    // }

    // Refrection
    // static void showAccountMethods() {
    // Method[] methods = Account.class.getDeclaredMethods();

    // for (Method method : methods) {
    // System.out.println("Method: " + method.getName());
    // }
    // }

    // static boolean isEligible(Account account) {
    // return account.getBalance() >= 500_000;
    // }
}
