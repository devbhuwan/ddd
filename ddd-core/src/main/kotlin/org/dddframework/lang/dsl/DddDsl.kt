package org.dddframework.lang.dsl

import org.dddframework.core.BoundedContexts
import org.dddframework.core.Ddds
import org.dddframework.lang.BoundedContext

/**
 * Allow to create easily a `BoundedContext<Domain>` from a Kotlin DSL
 *
 * @author Bhuwan Prasad Upadhyay
 * @see BoundedContextDsl
 * @since 1.0
 */

fun ddd(boundedContexts: DddDsl.() -> Unit) = DddDsl().apply(boundedContexts).adapter()

open class DddDsl {
	private val contexts = mutableListOf<BoundedContext>()
	fun adapter(): Any? {
		return null
	}

	fun boundedContext(name: String, f: DddDsl) {
		contexts += Ddds.context(BoundedContexts.GET(name, contexts), GatherMetaDataFunction { it })
	}

	class GatherMetaDataFunction(function: (it: BoundedContextDsl) -> Unit) {

	}


}