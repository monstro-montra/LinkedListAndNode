import java.util.Arrays;

//Write a recursive method that counts the number of nodes in a chain of linked nodes.
//Write a recursive method that displays a portion of a given array backward. Consider the last entry in the portion first.
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

        System.out.println("Total amount of nodes: " + list.count() + "\n"); //print how many nodes are in the list.

        int[] array = {10, 20, 3, 40, 5, 7 ,8 , 79};
        System.out.println("Array: " + Arrays.toString(array));

        reverseArr(array, 2, array.length - 1);
        System.out.println("Reversed array: " + Arrays.toString(array));

    }

    public static void reverseArr(int[] arr, int startIndex, int endIndex){
        //Time complexity of this algorithm is technically O(N/2), but since multiplication/division of constants doesn't matter,
        //it is O(N). In this case, the starting index is 2, and the endIndex is 79, making the array {3, 40, 5, 7, 8, 79}.
        //Before swap: {3, 40, 5, 7, 8, 79}
        //Swap one: {79, 40, 5, 7, 8, 3}
        //Swap two: {79, 8, 5, 7, 40, 3}
        //Swap three: {79, 8, 7, 5, 40, 3}.
        //This means the algo only needs to swap three times, but the number of swaps depends entirely on how big the input (n) is.
        //It grows linearly.
        if(startIndex < endIndex){ //the base condition is one startIndex = endIndex.
            //swap values
            int temp = arr[startIndex]; //set temp int to the value at arr[startIndex]
            arr[startIndex] = arr[endIndex]; //set arr[startIndex] to arr[endIndex]
            arr[endIndex] = temp; //set arr[endIndex] to temp val.

            //call function recursively, except add one to the startIndex and subtract one from the endIndex.
            reverseArr(arr, startIndex + 1, endIndex - 1);
        }

    }


}