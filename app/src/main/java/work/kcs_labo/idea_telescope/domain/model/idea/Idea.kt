package work.kcs_labo.idea_telescope.domain.model.idea

import work.kcs_labo.idea_telescope.domain.model.media.MediaId
import work.kcs_labo.idea_telescope.domain.model.tag.TagId
import work.kcs_labo.idea_telescope.domain.model.user.UserId
import work.kcs_labo.idea_telescope.util.SystemClock

data class Idea(
  val ideaId: IdeaId,
  val ideaAuthor: UserId,
  val ideaCreated: SystemClock,
  val ideaTitle: IdeaTitle,
  val ideaContent: IdeaContent,
  val ideaTags: List<TagId>,
  val ideaMedias: List<MediaId>,
  val ideaQuoted: List<IdeaId>,
  val ideaTheme: IdeaTheme
) {
}