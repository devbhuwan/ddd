package org.dddframework.lang.dsl

import org.dddframework.lang.Domain

/**
 * Allow to create easily a `BoundedContext<Domain>` from a Kotlin DSL
 *
 * @author Bhuwan Prasad Upadhyay
 * @see BoundedContextDsl
 * @since 1.0
 */

fun boundedContext(name: String, domains: BoundedContextDsl.() -> Unit) = BoundedContextDsl().apply(domains).adapter()

open class BoundedContextDsl {
	private val domains = mutableListOf<Domain>()

	fun adapter(): Any? {
		return null
	}

	fun models(function: () -> Unit) {

	}

	fun model(s: String, function: () -> Unit) {

	}

	fun <T> property(name: String, type: Class<T>) {

	}

}

@Target(AnnotationTarget.EXPRESSION)
annotation class ValueObject
