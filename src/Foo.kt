class Foo
{
    private fun fooBar()
    {
        fun localGetBar(x: Int): Bar = Bar(x)

        val bar = localGetBar(42)
        println("X: " + bar. /* IntelliSense here */)
    }

    private data class Bar(val x: Int)
}