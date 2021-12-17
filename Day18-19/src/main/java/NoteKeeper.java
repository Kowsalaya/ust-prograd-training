import java.util.*;
public class NoteKeeper {
    Map<Integer, List<String>> map = new HashMap<>();
    Map<Integer, List<String>> tempTodoList = new HashMap<>();
    private final String statusCompleted = "COMPLETED";
    private final String statusPending = "NOT COMPLETED";
    private String status;
    public void addItemsInTodoList(int key, String item, String status) {
        map.put(key, Arrays.asList(item, status));
    }
    public Map<Integer, List<String>> getToTodoList() {
        return map;
    }
    public void removeItemsFromTodoList(int key) {
        tempTodoList.put(key, map.get(key));
        map.remove(key);
    }
    public Map<Integer, List<String>> unRemoveItemsFromTodoList() {
        map.putAll(tempTodoList);
        return map;
    }
    public Map<Integer, List<String>> toggleStatus(int key) {
        if (map.get(key).set(1, status) == statusCompleted) {
            status = statusPending;
        } else {
            status = statusCompleted;
        }
        map.get(key).set(1, status);
        return map;
    }
}






















//    public String addItemToMyToDoList(int itemNumber,String nameOfTheItemToBeAdded) {
//        return nameOfTheItemToBeAdded;
//    }
//
//    public String removeItemToMyToDoList(int itemNUmber,String nameOfTheItemToBeRemoved) {
//        return null;
//    }

