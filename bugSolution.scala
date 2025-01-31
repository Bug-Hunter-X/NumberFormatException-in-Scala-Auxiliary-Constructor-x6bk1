```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Error: Invalid input string. Using default value 0.")
        this(0) // Or handle the error as needed
    }
  }
}

val obj = new MyClass("123")
println(obj.x) // Output: 123

val obj2 = new MyClass("abc")
println(obj2.x) // Output: Error: Invalid input string. Using default value 0. 0
```