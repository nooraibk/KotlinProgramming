package functions.extensions

fun main() {
    val industry = Industry(
        name = "PSO",
        type = "Petroleum"
    )

    industry {
        println(industry.name)
        println(industry.type)
    }
}

data class Industry(
    var name: String? = null,
    var type: String? = null
)

fun industry(industry: Industry.() -> Unit): Industry = Industry().apply(industry)
