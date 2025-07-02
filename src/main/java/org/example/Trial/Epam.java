package org.example.Trial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Epam {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, List.of(1,3,4)),
                new User(2, List.of(1,2,3,4,5,6)),
                new User(3, List.of(3,4)),
                new User(4, List.of(1,3,6)),
                new User(5, List.of(1,2,3,5)),
                new User(6, List.of(1,3,4,6))
        );

        Integer getMostSubscribedSubscriptionId = getMostSubscribedSubscriptionId(users);
        System.out.println(getMostSubscribedSubscriptionId);

        List<Integer> get3MostSubscribedSubscriptionId = get3MostSubscribedSubscriptionId(users);
        System.out.println(get3MostSubscribedSubscriptionId);
    }

    public static List<Map.Entry<Integer, Integer>> getSortedMap(List<User> users){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(User user: users){
            List<Integer> subscriptionIds = user.getSubscriptionIds();
            for(int i=0; i<subscriptionIds.size(); i++){
                if(freqMap.containsKey(subscriptionIds.get(i))){
                    freqMap.put(subscriptionIds.get(i), freqMap.get(subscriptionIds.get(i))+1);
                }else{
                    freqMap.put(subscriptionIds.get(i), 1);
                }
            }
        }
        //convert entry set to list
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        // Step 2: Sort the list by value
        entryList.sort(Map.Entry.comparingByValue());
        return entryList;
    }

    public static Integer getMostSubscribedSubscriptionId(List<User> users){
        List<Map.Entry<Integer, Integer>> sortedMap = getSortedMap(users);
        int N = sortedMap.size();
        return sortedMap.get(N-1).getKey();
    }

    public static List<Integer> get3MostSubscribedSubscriptionId(List<User> users){
        List<Map.Entry<Integer, Integer>> sortedMap = getSortedMap(users);
        int N = sortedMap.size();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<3;i++){
            result.add(sortedMap.get(N-i-1).getKey());
        }
        return result;
    }
}


class User{
    private int id;
    private List<Integer> subscriptionIds = new ArrayList<>();

    public User(int id, List<Integer> subscriptionIds) {
        this.id = id;
        this.subscriptionIds = subscriptionIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getSubscriptionIds() {
        return subscriptionIds;
    }

    public void setSubscriptionIds(List<Integer> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }
}