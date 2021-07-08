sealed class Employee {

    //Flexibility to handle different state of subclasses i.e, Manager, SeniorDev, JuniorDev
    data class Manager(val name:String,val id:Int):Employee()
    class SeniorDev(val name:String, val age:Int):Employee()
    object JuniorDev:Employee()
}