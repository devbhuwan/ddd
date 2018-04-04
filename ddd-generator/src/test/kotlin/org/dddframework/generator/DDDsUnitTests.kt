package org.dddframework.generator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DDDsUnitTests {

	@Test
	internal fun createDomainCorrectly() {
		assertEquals("", DDDs.domain())
	}
}