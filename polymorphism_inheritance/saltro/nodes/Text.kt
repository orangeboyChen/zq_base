package saltro.nodes

import saltro.contentmodel.PhrasingContent

class Text(value: String) : Literal("text", value), PhrasingContent
