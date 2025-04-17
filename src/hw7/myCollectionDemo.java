package hw7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class myCollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(200) - 100);
        }

        int minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }

        int temp = myCollection.get(minIndex);
        myCollection.set(minIndex, myCollection.get(maxIndex));
        myCollection.set(maxIndex, temp);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                int newRandom = rand.nextInt(901) + 100;
                myCollection.add(i, newRandom);
                break;
            }
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if(myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);

            }

        }

        System.out.println("Колекція після обробки:");
        for (int value : myCollection) {
            System.out.print(value + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("write k: ");
        int k = input.nextInt();
ArrayList<Integer> list1 = new ArrayList<>();
ArrayList<Integer> list2 = new ArrayList<>();
        if (k > myCollection.size()) {
            System.out.println("k is too big!");
            return;
        }
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }



        boolean evenFound = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                evenFound = true;
                break;
            }
        }
        if (!evenFound) {
            System.out.println("No even elements found.");
        }

        minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }

        if (minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }

    }
}
