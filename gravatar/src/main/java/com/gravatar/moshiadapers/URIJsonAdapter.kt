package com.gravatar.moshiadapers

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.net.URI

internal class URIJsonAdapter : TypeAdapter<URI>() {
    override fun write(out: JsonWriter, value: URI) {
        out.value(value.toString())
    }

    override fun read(input: JsonReader): URI {
        return URI(input.nextString())
    }
}
