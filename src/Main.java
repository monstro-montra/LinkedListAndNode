//Write a recursive method that counts the number of nodes in a chain of linked nodes.
public class Main {
    public static void main(String[] args) {
        //driver code
        LinkedList<Object> list = new LinkedList<>(); //instantiate a linkedlist of objects
        //add values to list.
        list.add(555);
        list.add("yes");
        list.add(4);
        list.add(6);
        list.add("purple");
        list.add(5.765432);

        list.show(); //show list

        System.out.println("Total amount of nodes: " + list.count()); //print how many nodes are in the list.

    }


}