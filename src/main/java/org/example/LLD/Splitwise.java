package org.example.LLD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return name != null ? name.hashCode() : 0;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; //check for reference
//        if (obj == null || getClass() != obj.getClass()) return false; //check for null and class type
//        User user = (User) obj; //typecast
//        return name != null && name.equals(user.name); //check for name equality
//    }
}

class Expense {
    private Map<Long, Integer> paidUserAmountMap;
    private Map<Long, Integer> hadToPayUserAmountMap;

    public Expense(Map<Long, Integer> paidUserAmountMap, Map<Long, Integer> hadToPayUserAmountMap) {
        this.paidUserAmountMap = paidUserAmountMap;
        this.hadToPayUserAmountMap = hadToPayUserAmountMap;
    }

    public Map<Long, Integer> getPaidUserAmountMap() {
        return paidUserAmountMap;
    }

    public void setPaidUserAmountMap(Map<Long, Integer> paidUserAmountMap) {
        this.paidUserAmountMap = paidUserAmountMap;
    }

    public Map<Long, Integer> getHadToPayUserAmountMap() {
        return hadToPayUserAmountMap;
    }

    public void setHadToPayUserAmountMap(Map<Long, Integer> hadToPayUserAmountMap) {
        this.hadToPayUserAmountMap = hadToPayUserAmountMap;
    }
}

class Pair {
    private Long id;
    private Integer amount;

    public Pair(Long id, Integer amount) {
        this.id = id;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        List<User> paidUserLists = List.of(
                new User(1L, "Akhil"),
                new User(2L, "Sheetal")
        );

        List<User> owedUserList = List.of(
                new User(3L, "Prateek"),
                new User(4L, "Srishti"),
                new User(5L, "Aunty")
        );

        Map<Long, Integer> paidUserMap = new HashMap<>();
        for(int i=0; i<paidUserLists.size(); i++) {
            paidUserMap.put(paidUserLists.get(i).getId(), (i+1) * 1000); // 1000, 2000
        }



        Map<Long, Integer> owedUserMap = Map.of(
                owedUserList.get(0).getId(), -700,
                owedUserList.get(1).getId(), -1100,
                owedUserList.get(2).getId(), -1200
        );

        Expense expense = new Expense(paidUserMap, owedUserMap);
        settleUpAmount(expense);
    }

    public static void settleUpAmount(Expense expense) {
        Map<Long, Integer> paidUserMap = expense.getPaidUserAmountMap();
        Map<Long, Integer> hadToPayUserMap = expense.getHadToPayUserAmountMap();
        Stack<Pair> paidUserStack = new Stack<>();
        Stack<Pair> hadToPayUserStack = new Stack<>();
        for (Map.Entry<Long, Integer> map : paidUserMap.entrySet()) {
            paidUserStack.push(new Pair(map.getKey(), map.getValue()));
        }


        for (Map.Entry<Long, Integer> map : hadToPayUserMap.entrySet()) {
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
                System.out.println(hadToPayUser.getId() + " will pay " + Math.abs(hadToPayUser.getAmount()) + " to " + paidUser.getId());
                hadToPayUserStack.pop();
                paidUserStack.pop();
            } else if (paidUser.getAmount() > Math.abs(hadToPayUser.getAmount())) {
//                System.out.println("else");
                System.out.println(hadToPayUser.getId() + " will pay " + Math.abs(hadToPayUser.getAmount()) + " to " + paidUser.getId());
                hadToPayUserStack.pop();
                paidUserStack.pop();
                paidUserStack.push(new Pair(paidUser.getId(), paidUser.getAmount() + hadToPayUser.getAmount()));
            } else {
//                System.out.println("else else");
                System.out.println(hadToPayUser.getId() + " will pay " + Math.abs(hadToPayUser.getAmount()) + " to " + paidUser.getId());
                hadToPayUserStack.pop();
                paidUserStack.pop();
                hadToPayUserStack.push(new Pair(hadToPayUser.getId(), paidUser.getAmount() + hadToPayUser.getAmount()));
                //+1000 - 1200
            }
        }

    }
}
