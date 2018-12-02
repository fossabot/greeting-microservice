package de.debuglevel.omnitrackerdocumentation.rest.folder

data class FolderDTO(val name: String,
                     val path: String,
                     val fields: List<FieldDTO>)