// Exercise 5: Summing Nullable Scores 📊
// Create a read-only list of nullable Integers (List<Int?>) that contains a mix of integer scores and null values.
// Iterate through the list. For each element:
// If the element is not null, print "Score recorded: [score]".
// If the element is null, print "Attempt missed."
// Calculate the sum of all non-null scores in the list.
// Initialize a sum variable to 0.
// In your loop, only add the score to your sum if it's not null.
// Print the total sum: "Total score from recorded attempts: [sum]".
// BONUS: Create a new list that contains only the non-null scores from the original list. Print this new list.

// Create a read-only list of nullable integers
val scores = listOf<Int?>(85, null, 92, 78, null, 95, 88)

var totalScore = 0

println("Processing scores:")
for (score in scores) {
    if (score != null) {
        println("Score recorded: $score")
        // only add the score to your sum if it's not null.
        totalScore += score
    } else {
        println("Attempt missed.")
    }
}

println("\nTotal score from recorded attempts: $totalScore")

// BONUS: Create a new list that contains
// only the non-null scores from the original list. Print this new list.
val recordedScores = scores.filterNotNull()
println("\nBONUS: List of recorded scores: $recordedScores")


