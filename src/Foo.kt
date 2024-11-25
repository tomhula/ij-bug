class Foo
{
    private fun fooBar()
    {
        fun localGetBar(x: Int): Bar? = Bar(x)

        val bar = localGetBar(42) ?: return
        println("X: " + bar.)
    }

    private data class Bar(val x: Int)
}