package ex1;

public class Customer {
    String name;
    String email;
    int[] purchaseHistory;
    int purchaseCount;

    Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
    }

    void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        } else {
            System.out.println("array is full");
        }
    }

    int calculateTotalExpenditure() {
        int sum = 0;
        for (int i = 0; i < purchaseCount; i++) {
            sum += purchaseHistory[i];
        }
        return sum;
    }

    void displayPurchaseHistory() {
        System.out.print("Purchase history: ");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.print(purchaseHistory[i] + " ");
        }
        System.out.println();
    }
}

class PreferredCustomer extends Customer {
    double discountRate;

    PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    int applyDiscount(int amount) {
        return (int)(amount * (1 - discountRate));
    }

    @Override
    void addPurchase(int amount) {
        int discounted = applyDiscount(amount);
        super.addPurchase(discounted);
    }

    @Override
    void displayPurchaseHistory() {
        System.out.print("Discounted purchase history: ");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.print(purchaseHistory[i] + " ");
        }
        System.out.println();
    }
}