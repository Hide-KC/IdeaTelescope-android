package work.kcs_labo.idea_telescope.application.idea

import work.kcs_labo.idea_telescope.domain.model.Visibility
import work.kcs_labo.idea_telescope.domain.model.idea.IdeaContent
import work.kcs_labo.idea_telescope.domain.model.idea.IdeaId
import work.kcs_labo.idea_telescope.domain.model.idea.IdeaTheme
import work.kcs_labo.idea_telescope.domain.model.idea.IdeaTitle
import work.kcs_labo.idea_telescope.domain.model.media.MediaId
import work.kcs_labo.idea_telescope.domain.model.tag.TagId
import work.kcs_labo.idea_telescope.domain.model.user.UserId
import work.kcs_labo.idea_telescope.util.SystemClock

data class IdeaCreateInputData(
  val ideaAuthorId: UserId,
  val ideaCreated: SystemClock,
  val ideaTitle: IdeaTitle,
  val ideaContent: IdeaContent,
  val ideaTags: List<TagId>,
  val ideaMedias: List<MediaId>,
  val ideaQuoted: List<IdeaId>,
  val ideaTheme: IdeaTheme,
  val ideaVisibility: Visibility
) {

}