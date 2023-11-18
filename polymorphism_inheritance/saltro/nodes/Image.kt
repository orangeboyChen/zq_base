package saltro.nodes

import saltro.mixin.Alternative
import saltro.mixin.Resource

class Image(override val url: String, override val alt: String?) : Node("img"), Resource, Alternative {
    override val title: String? = null

    override fun renderProps(): String {
        return """src="$url" alt="$alt""""
    }
}
