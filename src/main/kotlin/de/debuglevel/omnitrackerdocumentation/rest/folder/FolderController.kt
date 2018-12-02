package de.debuglevel.omnitrackerdocumentation.rest.folder

import de.debuglevel.omnitrackerdatabasebinding.OmnitrackerDatabase
import de.debuglevel.omnitrackerdatabasebinding.models.StringTranslationLanguage
import de.debuglevel.omnitrackerdocumentation.rest.responsetransformer.JsonTransformer
import mu.KotlinLogging
import spark.kotlin.RouteHandler

object FolderController {
    private val logger = KotlinLogging.logger {}

    fun getList(): RouteHandler.() -> String {
        return {
            val folders = OmnitrackerDatabase().folders.values
                    .map { folder ->
                        FolderDTO(
                                folder.name,
                                folder.path,
                                folder.fields.values
                                        .map { field ->
                                            FieldDTO(
                                                    field.getName(StringTranslationLanguage.German),
                                                    field.getComment(StringTranslationLanguage.German),
                                                    field.getDescription(StringTranslationLanguage.German))
                                        })
                    }

            type(contentType = "application/json")
            JsonTransformer.render(folders)
        }
    }
}