/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */
package com.gravatar.restapi.models

import com.google.gson.annotations.SerializedName
import java.util.Objects

/**
 *
 *
 * @param associated Whether the entity is associated with the account.
 */

public class AssociatedResponse private constructor(
    // Whether the entity is associated with the account.
    @SerializedName("associated")
    public val associated: kotlin.Boolean,
) {
    override fun toString(): String = "AssociatedResponse(associated=$associated)"

    override fun equals(other: Any?): Boolean = other is AssociatedResponse &&
        associated == other.associated

    override fun hashCode(): Int = Objects.hash(associated)

    public class Builder {
        // Whether the entity is associated with the account.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var associated: kotlin.Boolean? = null

        public fun setAssociated(associated: kotlin.Boolean?): Builder = apply { this.associated = associated }

        public fun build(): AssociatedResponse = AssociatedResponse(associated!!)
    }
}

@JvmSynthetic // Hide from Java callers who should use Builder.
public fun AssociatedResponse(initializer: AssociatedResponse.Builder.() -> Unit): AssociatedResponse {
    return AssociatedResponse.Builder().apply(initializer).build()
}
