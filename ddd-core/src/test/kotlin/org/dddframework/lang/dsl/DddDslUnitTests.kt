package org.dddframework.lang.dsl

import java.math.BigDecimal

internal class DddDslUnitTests {

	fun dddDsl() = ddd {
		boundedContext("OrderManager") {
			models {
				@ValueObject
				model("Orders") {
					property("amount", BigDecimal.ZERO.javaClass)
					property("description", "".javaClass)
				}
			}
		}

	}

}
