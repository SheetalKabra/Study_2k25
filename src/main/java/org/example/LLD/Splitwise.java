package org.example.LLD;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //check for reference
        if (obj == null || getClass() != obj.getClass()) return false; //check for null and class type
        User user = (User) obj; //typecast
        return name != null && name.equals(user.name); //check for name equality
    }
}

class Expense {
    private Map<User, Integer> paidUserAmountMap;
    private Map<User, Integer> hadToPayUserAmountMap;

    public Expense(Map<User, Integer> paidUserAmountMap, Map<User, Integer> hadToPayUserAmountMap) {
        this.paidUserAmountMap = paidUserAmountMap;
        this.hadToPayUserAmountMap = hadToPayUserAmountMap;
    }

    public Map<User, Integer> getPaidUserAmountMap() {
        return paidUserAmountMap;
    }

    public void setPaidUserAmountMap(Map<User, Integer> paidUserAmountMap) {
        this.paidUserAmountMap = paidUserAmountMap;
    }

    public Map<User, Integer> getHadToPayUserAmountMap() {
        return hadToPayUserAmountMap;
    }

    public void setHadToPayUserAmountMap(Map<User, Integer> hadToPayUserAmountMap) {
        this.hadToPayUserAmountMap = hadToPayUserAmountMap;
    }
}

class Pair {
    private User user;
    private Integer amount;

    public Pair(User user, Integer amount) {
        this.user = user;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

public class Splitwise {
    public static void main(String[] args) {

        Map<User, Integer> paidUserMap = new HashMap<>();
        paidUserMap.put(new User("Akhil"), 1000);
        paidUserMap.put(new User("Sheetal"), 2000);


        Map<User, Integer> hadToPayUserMap = new HashMap<>();
        hadToPayUserMap.put(new User("Prateek"), -700);
        hadToPayUserMap.put(new User("Srishti"), -1100);
        hadToPayUserMap.put(new User("Aunty"), -1200);

        Expense expense = new Expense(paidUserMap, hadToPayUserMap);
        settleUpAmount(expense);
    }

    public static void settleUpAmount(Expense expense) {
        Map<User, Integer> paidUserMap = expense.getPaidUserAmountMap();
        Map<User, Integer> hadToPayUserMap = expense.getHadToPayUserAmountMap();
        Stack<Pair> paidUserStack = new Stack<>();
        Stack<Pair> hadToPayUserStack = new Stack<>();
        for (Map.Entry<User, Integer> map : paidUserMap.entrySet()) {
            paidUserStack.push(new Pair(map.getKey(), map.getValue()));
        }


        for (Map.Entry<User, Integer> map : hadToPayUserMap.entrySet()) {
            hadToPayUserStack.push(new Pair(map.getKey(), map.getValue()));
        }

        boolean isSettled = false;
        while (!paidUserStack.empty()) {
            //pick one user from paidMap, and pick one user from hadToPayMap
            Pair paidUser = paidUserStack.peek();
            Pair hadToPayUser = hadToPayUserStack.peek();
//            System.out.println(paidUser.getAmount()+", "+hadToPayUser.getAmount());
            if (paidUser.getAmount() == Math.abs(hadToPayUser.getAmount())) {
//                System.out.println("if");
                System.out.println(hadToPayUser.getUser().getName() + " will pay " + Math.abs(hadToPayUser.getAmount()) + " to " + paidUser.getUser().getName());
                hadToPayUserStack.pop();
                paidUserStack.pop();
            } else if (paidUser.getAmount() > Math.abs(hadToPayUser.getAmount())) {
//                System.out.println("else");
                System.out.println(hadToPayUser.getUser().getName() + " will pay " + Math.abs(hadToPayUser.getAmount()) + " to " + paidUser.getUser().getName());
                hadToPayUserStack.pop();
                paidUserStack.pop();
                paidUserStack.push(new Pair(paidUser.getUser(), paidUser.getAmount() + hadToPayUser.getAmount()));
            } else {
//                System.out.println("else else");
                System.out.println(hadToPayUser.getUser().getName() + " will pay " + Math.abs(hadToPayUser.getAmount()) + " to " + paidUser.getUser().getName());
                hadToPayUserStack.pop();
                paidUserStack.pop();
                hadToPayUserStack.push(new Pair(hadToPayUser.getUser(), paidUser.getAmount() + hadToPayUser.getAmount()));
                //+1000 - 1200
            }
        }

    }
}
