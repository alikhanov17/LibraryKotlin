import java.util.*

fun main() {

    val library = LibraryClass()
    val scanner = Scanner(System.`in`)
    while (true){
    println("1-> Add book")
    println("2-> List of Books")
    println("3-> Search books")
    println("4-> Remove book")

    var n = scanner.nextInt()
    when(n){
        1->{
library.add()
        }
        2->{
            library.list()
        }
        3->{
            library.search()
        }
        4->{
            library.remove()
        }

    }





}
}