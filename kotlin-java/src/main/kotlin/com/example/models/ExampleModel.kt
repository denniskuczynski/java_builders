package com.example.models

data class ExampleModel(
    val name: String = "",
    val favoriteNumbers: List<Int> = emptyList()
) {
    private constructor(builder: Builder) : this(builder.name, builder.favoriteNumbers)

    class Builder {
        var name: String = ""
            private set

        var favoriteNumbers: List<Int> = emptyList()
            private set

        fun name(name: String) = apply { this.name = name }

        fun favoriteNumbers(favoriteNumbers: List<Int>) = apply { this.favoriteNumbers = favoriteNumbers }

        fun build() = ExampleModel(this)
    }
}
