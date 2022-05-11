public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        //Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.
        //Set the price and the name for each -- "mocha", "latte", "drip coffee" and "capuccino" (price is up to you!)
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.50;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.00;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.50;
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 3.00;

        // Order variables -- order1, order2 etc.
        //Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.
        //Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".
        Order order1 = new Order();
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        //Print the order1 variable to the console to see what happens.
        System.out.println(order1 + "\n");

        //Predict what will happen if you print order1.total
        //This should print out 0.0;
        System.out.println(order1.total + "\n");
        //Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
        for (Item i : order2.items){
            System.out.printf("Item Name: %s - Price: %s%n", i.name, i.price);
        }
        System.out.println(order2.total + "\n");

        //order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;
        for (Item i : order3.items){
            System.out.printf("Item Name: %s - Price: %s%n", i.name, i.price);
        }
        System.out.println(order3.total + "\n");

        //order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;
        for (Item i : order4.items){
            System.out.printf("Item Name: %s - Price: %s%n", i.name, i.price);
        }
        System.out.println(order4.total + "\n");

        //Cindhuri’s order is now ready. Update her status.
        order1.ready = true;
        System.out.println(order1.ready + "\n");

        //Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price*2;
        for (Item i : order4.items){
            System.out.printf("Item Name: %s - Price: %s%n", i.name, i.price);
        }
        System.out.println(order4.total + "\n");

        //Jimmy’s order is now ready. Update his status.
        order2.ready = true;
        System.out.println(order2.ready + "\n");

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
