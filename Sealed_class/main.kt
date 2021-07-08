fun main(args: Array<String>) {
    println("What is your name?")
    val name = readLine()
    println("Hello, $name")

    //Cannot instantiate sealed class
    // val user1 = Employee() ---> Error

    val user:Employee = Employee.SeniorDev("Tariq",23)

    val message = when (user){
        Employee.JuniorDev -> TODO()
        is Employee.Manager -> TODO()
        is Employee.SeniorDev -> TODO()
        //No else condition is required in sealed class
    }
}

/*Cannot extend sealed classes like this becuase of resticted number of hierarchies
  e.g --> class dev :Employee()  --> Error */
