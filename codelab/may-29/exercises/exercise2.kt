// Exercise 2: Simple To-Do List ✅
// Create a mutable list designed to store nullable String values, representing to-do items.
// Add a few to-do items (as Strings) to the list. Also, add a null value to the list.
// Write code to print each to-do item:
// Iterate through the list.
// For each item, use the Elvis operator (?:) to print "[No task description]" if the item is null. Otherwise, print the task.
// Implement a way to get the first task:
// Safely try to get the first element of the list.
// If the list is empty, print "No tasks in the list."
// If the list is not empty, print "First task: [task]". If that first task itself was null, ensure your code handles this gracefully (e.g., by using the Elvis operator again).

// Create a mutable list of nullable Strings
val todoList = mutableListOf<String?>("Exercise 1", "Exercise 2", null, "Exercise 4")

// Print all tasks
println("All tasks:")
for (task in todoList) {
    println(task ?: "[No task description]")
}

// Get and print the first task
println("\nFirst task:")
if (todoList.isEmpty()) {
    println("No tasks in the list.")
} else {
    println("First task: ${todoList.first() ?: "[No task description]"}")
}

