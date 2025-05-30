// Exercise 3: Item Prices 💰
// Create an array of String to store item names. Initialize it with a few item names.
// Create a second array of nullable Doubles (Double?) to store the corresponding prices. This allows for some items to not have a price listed yet. Initialize it with some prices and at least one null, ensuring both arrays have the same number of elements.
// Write code to print the details for a specific item by index:
// Choose an index programmatically (e.g., assign it to a variable).
// Safely access the item name from the first array and its price from the second array using this index.
// Print a message like: "Item: [Name], Price: $[Price]"
// If the price is null for that item, print "Item: [Name], Price: Not available".
// If the chosen index is out of bounds for the arrays, print "Invalid item index."


// Create arrays for items and their prices
val items = arrayOf("Laptop", "Smartphone", "Headphones", "Tablet")
val prices = arrayOf<Double?>(999.99, 699.99, null, 499.99)

// Function to print item details at a specific index
fun printItemDetails(index: Int) {
    if (index < 0 || index >= items.size) {
        println("Invalid item index.")
        return
    }

    val itemName = items[index]
    val price = prices[index]
    
    println("Item: $itemName, Price: ${price?.let { "$$it" } ?: "Not available"}")
}

// Test with different indices
println("Testing item details:")
printItemDetails(0)  // Valid index with price
printItemDetails(2)  // Valid index with null price
printItemDetails(4)  // Invalid index

