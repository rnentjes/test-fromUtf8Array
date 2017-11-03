fun main(args: Array<String>) {
    val array = ByteArray(100)
    array[0] = 'H'.toByte()
    array[1] = 'e'.toByte()
    array[2] = 'l'.toByte()
    array[3] = 'l'.toByte()
    array[4] = 'o'.toByte()

    val str = kotlin.text.fromUtf8Array(array, 0, 5)

    println("Hello: '$str'")
    println("Str length: ${str.length}")
}
