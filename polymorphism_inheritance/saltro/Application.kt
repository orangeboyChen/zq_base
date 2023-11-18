package saltro

import saltro.nodes.*

fun renderMarkdownList(arr: Array<Node>): String {
    return arr.fold(StringBuilder()) { str: StringBuilder, node: Node -> str.append(node.render()) }.toString()
}

fun main() {
    val markdownArr =
        arrayOf(
            Heading(HeadingDepth.H1, arrayOf(Text("Hello"))),
            Image("/test", "Image"),
            Paragraph(arrayOf(Text("This is a image.")))
        )
    println(renderMarkdownList(markdownArr))
}
