package work.kcs_labo.idea_telescope.domain.model.media

data class Media private constructor(
  val mediaId: MediaId,
  val mediaContent: MediaContent
) {

  class Builder {
    private var mediaId: MediaId? = null
    private var mediaContent: MediaContent? = null

    //TODO Mediaのバリデーションの記述
    fun setMediaId(mediaId: MediaId) = also {
      it.mediaId = mediaId
    }

    fun setMediaContent(mediaContent: MediaContent) = also {
      it.mediaContent = mediaContent
    }

    fun build(): Media = Media(
      mediaId ?: MediaId(),
      mediaContent ?: MediaContent()
    )
  }
}