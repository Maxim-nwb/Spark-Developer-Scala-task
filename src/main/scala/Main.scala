import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {

    //1
    println("---------- Task 1 - 2 ----------")

    val age: Int = 25;
    val weight: Double = 65.3;
    val name: String = "Max";
    val is_student: Boolean = true;

    //2

    println(s"age: $age, weight: $weight, name: $name, isStudent: $is_student")

    //3
    println("---------- Task 3 - 4 ----------")

    def sum(a: Int, b: Int): Int = a + b

    //4

    println(sum(2, 8))

    //5
    println("---------- Task 5 - 6 ----------")

    val isYang = (age: Int) => if (age < 30) "Молодой" else "Взрослый"

    //6

    println(isYang(age))

    //7
    println("---------- Task 7 ----------")

    (1 to 10).foreach(println(_))

    //8
    println("---------- Task 8 ----------")

    val sudentNames: List[String] = "Max" :: "Igor" :: "Oleg" :: "Anna" :: Nil

    sudentNames.foreach(println(_))

    //9
    println("---------- Task 9 ----------")

    def student_info(): Unit = {

      var student_age: Int = 0
      var student_name: String = ""
      var student_is_student: Boolean = false

      var exception = false

      do {
        try {
          print("Set your age: ")
          student_age = readInt()

          student_name = readLine("Set your  name: ")

          print("Set your status (if student set 1, if not = 0) : ")
          val student_status: Int = readInt()
          if (student_status == 1) student_is_student = true
          else if (student_status == 0) student_is_student = false
          else exception = false

          exception = false
        }
        catch {
          case _ =>
            exception = true;
        }
      } while (exception)

      println(isYang(student_age))

      println(s"age: $student_age name: $student_name, is student: $student_is_student")
    }

    student_info()

    //10
    println("---------- Task 10 ----------")

    val ints: List[Int] = (1 to 10).toList
    ints.foreach(i => print(i + " "))

    //11
    println("\n ---------- Task 11 ----------")

    val intsPow: List[Int] = for {i <- ints} yield i * i
    intsPow.foreach(i => print(i + " "))

    //12
    println("\n ---------- Task 12 ----------")

    val intsEven: List[Int] = for {i <- ints if i % 2 == 0} yield i
    intsEven.foreach(i => print(i + " "))

  }
}