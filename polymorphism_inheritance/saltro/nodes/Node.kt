package saltro.nodes

abstract class Node(open val type: String) {
    open fun renderProps(): String {
        return ""
    }

    open fun render(): String {
        // 理论上不会走到
        if (type.isEmpty()) throw IllegalArgumentException("Type is empty")
        return "<${type} ${renderProps()} />"
    }
}