package work.kcs_labo.idea_telescope.domain.model.idea

import work.kcs_labo.idea_telescope.domain.model.media.MediaId
import work.kcs_labo.idea_telescope.domain.model.tag.TagId
import work.kcs_labo.idea_telescope.domain.model.user.UserId
import work.kcs_labo.idea_telescope.util.SystemClock
import java.util.*

data class Idea private constructor(
  val ideaId: IdeaId,
  val ideaAuthorId: UserId,
  val ideaCreated: SystemClock,
  val ideaTitle: IdeaTitle,
  val ideaContent: IdeaContent,
  val ideaTags: List<TagId>,
  val ideaMedias: List<MediaId>,
  val ideaQuoted: List<IdeaId>,
  val ideaTheme: IdeaTheme
) {

  class Builder {
    private var ideaId: IdeaId? = null
    private var ideaAuthorId: UserId? = null
    private var ideaCreated: SystemClock? = null
    private var ideaTitle: IdeaTitle? = null
    private var ideaContent: IdeaContent? = null
    private var ideaTags: List<TagId>? = null
    private var ideaMedias: List<MediaId>? = null
    private var ideaQuoted: List<IdeaId>? = null
    private var ideaTheme: IdeaTheme? = null

    //TODO Ideaのバリデーションの記述
    fun setIdeaId(ideaId: IdeaId) = also {
      it.ideaId = ideaId
    }

    fun setIdeaAuthorId(ideaAuthorId: UserId) = also {
      it.ideaAuthorId = ideaAuthorId
    }

    fun setIdeaCreated(ideaCreated: SystemClock) = also {
      it.ideaCreated = ideaCreated
    }

    fun setIdeaTitle(ideaTitle: IdeaTitle) = also {
      it.ideaTitle = ideaTitle
    }

    fun setIdeaContent(ideaContent: IdeaContent) = also {
      it.ideaContent = ideaContent
    }

    fun setIdeaTags(ideaTags: List<TagId>) = also {
      it.ideaTags = ideaTags
    }

    fun setIdeaMedias(ideaMedias: List<MediaId>) = also {
      it.ideaMedias = ideaMedias
    }

    fun setIdeaQuoted(ideaQuoted: List<IdeaId>) = also {
      it.ideaQuoted = ideaQuoted
    }

    fun setIdeaTheme(ideaTheme: IdeaTheme) = also {
      it.ideaTheme = ideaTheme
    }

    fun build(): Idea = Idea(
      ideaId ?: IdeaId(),
      ideaAuthorId ?: UserId(),
      ideaCreated ?: object : SystemClock {
        override fun getTimeMillis(): Long = System.currentTimeMillis()
        override fun getLocale(): Locale = Locale.JAPAN
        override fun getTimeZone(): TimeZone = TimeZone.getTimeZone("Asia/Tokyo")
      },
      ideaTitle ?: IdeaTitle(),
      ideaContent ?: IdeaContent(),
      ideaTags ?: listOf(),
      ideaMedias ?: listOf(),
      ideaQuoted ?: listOf(),
      ideaTheme ?: IdeaTheme()
    )
  }
}