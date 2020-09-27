package work.kcs_labo.idea_telescope.domain.model.tag

data class Tag private constructor(
  val tagId: TagId,
  val tagLabel: TagLabel
) {

  class Builder {
    private var tagId: TagId? = null
    private var tagLabel: TagLabel? = null

    //TODO Tagのバリデーションの記述
    fun setTagId(tagId: TagId) = also {
      it.tagId = tagId
    }

    fun setTagLabel(tagLabel: TagLabel) = also {
      it.tagLabel = tagLabel
    }

    fun build() = Tag(
      tagId ?: TagId(),
      tagLabel ?: TagLabel()
    )
  }
}