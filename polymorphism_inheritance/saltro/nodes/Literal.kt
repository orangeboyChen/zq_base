package saltro.nodes

abstract class Literal(type: String, private val value: String) : Node(type) {
    override fun render(): String {
        return value
    }
}