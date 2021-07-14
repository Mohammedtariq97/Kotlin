class BaseImpl(val x:Int):Base {
    override fun printMe() {
        println(x)  //implementation
    }

}

class Derived(b:Base) : Base by b //delegation