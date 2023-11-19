package saltro.nodes

import saltro.mixin.Alternative
import saltro.mixin.Resource

class Image(override val url: String, override val alt: String?) : Node("img"), Resource, Alternative {
    override fun renderProps(): String {
        if (alt.isNullOrEmpty()) return """src="$url""""
        return """src="$url" alt="$alt""""
    }
}
