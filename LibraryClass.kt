import java.util.*


class LibraryClass :Library {

    inline fun <reified T> removeItem(array: Array<T>, value: Any): Array<T> {
        return array.filter { it != value }.toTypedArray()
    }

    data class LibraryClass(var name: String, var price: Int, var year: Int) {
        fun show() {

            println("Name $name")
            println("Price $price")
            println("Year $year")
        }
    }


    private var scanner = Scanner(System.`in`)
    private var list = arrayOfNulls<LibraryClass>(100)
    var namearr = arrayListOf<LibraryClass>()
    var count = 0


    override fun add() {
        try {


            print("Name:")
            val name = scanner.next()
            print("Price:")
            val price = scanner.nextInt()
            print("Year:")
            val year = scanner.nextInt()
            val libraryClass = LibraryClass(name, price, year)
            list[count] = libraryClass
            count++
        }catch (e:Exception){
            println()
        }
    }

    override fun list() {
        try {
            for (i in 0..count) {
                println(list[i]!!.show())
            }
        } catch (e: Exception) {
            println()
        }

    }

    override fun search() {
        print("Enter name ")
        var name = scanner.next()
        val book: LibraryClass? = list.find { it!!.name == name }
        println(book)
    }


    override fun remove() {
        var name  = scanner.next()
list = removeItem(list,name)



    }
       

    }





