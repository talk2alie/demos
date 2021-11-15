fun main(args: Array<String>) {
    displayAllProviders{
            key, value -> println("\t$key: $value")
    }
}

fun displayAllProviders(displayFunction: (String, String) -> Unit): Unit {
    val providers = getProviders();
    var count = 0;
    providers.forEach { provider ->
        println();
        println("${++count}: ${provider.name}");
        provider.forEach { key, value ->
            displayFunction(key.toString(), value.toString())
        }
    }
}

fun display(key: String, value: String): Unit {
    println("\t$key: $value")
}