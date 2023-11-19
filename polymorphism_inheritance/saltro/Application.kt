package saltro

import saltro.nodes.*

fun renderMarkdownList(arr: List<Node>): String {
    return arr.joinToString(separator = "") { node -> node.render() }
}

fun main() {
    val markdownArr =
        listOf(
            Heading(HeadingDepth.H1, listOf(Text("Hello"))),
            Image("/test", "Image"),
            Paragraph(listOf(Text("This is a image.")))
        )
    println(renderMarkdownList(markdownArr))
}
