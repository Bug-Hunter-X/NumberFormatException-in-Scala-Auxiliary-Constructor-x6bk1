# NumberFormatException in Scala Auxiliary Constructor

This repository demonstrates a common Scala error: `NumberFormatException` arising from an auxiliary constructor's attempt to parse a non-numeric string.

## Bug Description
The primary constructor `MyClass(val x: Int)` expects an integer.  The auxiliary constructor `this(s: String)` attempts to convert the input string `s` to an integer using `s.toInt`. If `s` cannot be parsed as an integer (e.g., "abc"), a `NumberFormatException` is thrown.

## Solution
The solution involves adding error handling to gracefully manage cases where the input string is not a valid integer.
