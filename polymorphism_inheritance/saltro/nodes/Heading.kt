package saltro.nodes

import saltro.contentmodel.PhrasingContent

enum class HeadingDepth {
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
}

class Heading<T>(private val depth: HeadingDepth, children: List<T>) :
    Parent<T>("heading", children) where T : Node, T : PhrasingContent {
    override val type: String
        get() = when (depth) {
            HeadingDepth.H1 -> "h1"
            HeadingDepth.H2 -> "h2"
            HeadingDepth.H3 -> "h3"
            HeadingDepth.H4 -> "h4"
            HeadingDepth.H5 -> "h5"
            HeadingDepth.H6 -> "h6"
        }
}