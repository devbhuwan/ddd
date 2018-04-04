package org.dddframework.generator

import org.jtwig.JtwigModel
import org.jtwig.JtwigTemplate

/**
 * A common util class for ddd related source code generator.
 * {@link }
 *
 * @author Bhuwan Prasad Upadhyay
 * @since 1.0.0
 */
object DDDs {

	fun domain(): String? {
		return JtwigTemplate.classpathTemplate("templates/domains/domain.twig")
				.render(JtwigModel.newModel().with("name", "Bhuwan"))
	}

}