fun main() {
    val billieSong = Song("CHIHIRO", "Billie Eilish", 2024, 1_000_000)
    billieSong.printDescription()
    println(billieSong.isPopular)
}

class Song(
    val titulo: String,
    val artista: String,
    val añoPublicado: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000
        

    fun printDescription() {
        println("$titulo, performed by $artista, was released in $añoPublicado.")
    }
}
