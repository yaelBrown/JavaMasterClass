package Arrays;

// arrL = arrayList

import java.util.ArrayList;

// CRUD operations for an arrayList
// functionality should be in the class where the arrayList is

public class ArrayListLesson {

    public static void main(String[] args) {

        // Lists are a sequence of numbers
        // Arrays are apart of lists, Array extend List. List is an interface
        // List extends Collection interface

        // ArrayList's are resizable arrays.

        // arrL.addAll creates a copy of the arrL

        // Convert arrayList to regular array
//       String[] myArray = new String[groceryList.getGroceryList().size()];
//       myArray = groceryList.getGroceryList().toArray(myArray);

        // .contains(e) method returns of a boolean if e is in the arrayList

        // arrL.remove(arrL.indexOf(e)) - quickly removes elements if they are present.
        
        // can use forEach loop for arrL

        // arrL.get(0).method() - when you specify the item in the array you can use its methods
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    // The <E> is the datatype of the element.
    // Don't to add datatype on the new ArrayList<>();
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Add item to arraylist
    public void addGroceryItem(String item) {

        // arr.add(item to add)
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i)); // arr.get(index) get, get's the element in that array list at that index
        }
    }

    private void modifygroceryItem(String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // Updates the item. Position first then the actual element
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    private void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position); // Removes the item from arrayList at the actual index.
    }

//    public String findItem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem); // finds and returns int of the index of matching item
//        if (position >= 0) {
//            return groceryList.get(position); // using the found index, does a get of the item in the arraylist.
//        }
//        return null;
//    }

    // Used to return the index and use in the overloaded modifyGrocery Item method.
    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    // When referencing a item outside of the arraylist you will get IndexOutOfBoundsException
    // When you search for indexOf something that does not exist, it will return int -1
}