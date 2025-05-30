// Exercise 4: Default Configuration Values ⚙️
// Declare two nullable variables: settingColorTheme (String) and settingFontSize (Int).
// Simulate loading these settings by assigning them values, or leaving one or both null.
// Determine the actual values to use:
// For actualColorTheme, use settingColorTheme if it's not null; otherwise, default to "Light".
// For actualFontSize, use settingFontSize if it's not null; otherwise, default to 12.
// You must use the Elvis operator (?:) for this.
// Print the actual settings being applied in the format: "Applying theme: [actualColorTheme], Font size: [actualFontSize]pt."

// Declare nullable configuration variables
val settingColorTheme: String? = "Dark"
val settingFontSize: Int? = null

// Apply default values using Elvis operator
val actualColorTheme = settingColorTheme ?: "Light"
val actualFontSize = settingFontSize ?: 12

// Print the actual settings being applied
println("Applying theme: $actualColorTheme, Font size: ${actualFontSize}pt.")

// Test with different combinations
println("\nTesting different configurations:")

// Case 1: Both settings provided
val theme1: String? = "Dark"
val fontSize1: Int? = 16
println("Case 1: ${theme1 ?: "Light"}, ${fontSize1 ?: 12}pt")

// Case 2: Both settings null
val theme2: String? = null
val fontSize2: Int? = null
println("Case 2: ${theme2 ?: "Light"}, ${fontSize2 ?: 12}pt")

// Case 3: Mixed (one provided, one null)
val theme3: String? = "Blue"
val fontSize3: Int? = null
println("Case 3: ${theme3 ?: "Light"}, ${fontSize3 ?: 12}pt")

