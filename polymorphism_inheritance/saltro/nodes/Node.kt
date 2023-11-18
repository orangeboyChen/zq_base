package saltro.nodes

abstract class Node(open val type: String) {
    open fun renderProps(): String {
        return ""
    }

    open fun render(): String {
        return "<${type} ${renderProps()} />"
    }
}