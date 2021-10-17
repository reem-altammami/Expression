    fun main(args: Array < String > ) {
        // exception using to handle the errors happening at run time
        try { //between try curly braces write the code maybe had error to generate an exception
            var number = 15 / 0
        } catch (e: ArithmeticException) {/*here we catch the exception from try block
        (e is variable take value from class ArithmeticException based the exception)*/

            println("Error! because $e")
        }
    }
