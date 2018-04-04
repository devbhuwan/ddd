package org.dddframework.generator

import de.neuland.jade4j.Jade4J.render
import org.springframework.core.io.ClassPathResource

object DDDs {

	fun domain(): String? {
		return render(ClassPathResource("templates/domains/domain.jade").url, HashMap())
	}

}