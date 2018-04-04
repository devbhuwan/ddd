package org.dddframework.generator

import org.dddframework.lang.dsl.boundedContext
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DDDsUnitTests {

	@Test
	internal fun createDomainCorrectly() {
		assertEquals("Hello Bhuwan", DDDs.domain())
	}

	fun orderManager() = boundedContext("orderManager") {

	}

}