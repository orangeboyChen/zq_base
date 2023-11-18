package saltro.nodes

abstract class Parent<T : Node>(type: String, private val children: Array<out T>) : Node(type) {
    override fun render(): String {
        return """<$type>${
            children.fold(StringBuilder()) { str: StringBuilder, node: T -> str.append(node.render()) }
        }</$type>"""
    }
}