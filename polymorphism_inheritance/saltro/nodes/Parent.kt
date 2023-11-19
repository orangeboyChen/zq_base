package saltro.nodes

abstract class Parent<T : Node>(override val type: String, private val children: List<T>) : Node(type) {
    override fun render(): String {
        // 理论上不会走到
        if (type.isEmpty()) throw IllegalArgumentException("Type is empty")
        return """<$type>${
            children.joinToString(separator = "") { node -> node.render() }
        }</$type>"""
    }
}