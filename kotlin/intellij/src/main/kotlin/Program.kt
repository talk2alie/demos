fun main(args: Array<String>) {
    println("Hello, World!");
    val min = min(1, 2);
    print("The minimum value between 1 and 2 is $min");
}

fun min(a: Int, b: Int): Int {
    return if(a<b) a else b;
}