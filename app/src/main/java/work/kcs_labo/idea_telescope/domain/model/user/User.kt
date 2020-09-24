package work.kcs_labo.idea_telescope.domain.model.user

import work.kcs_labo.idea_telescope.domain.model.idea.IdeaId
import work.kcs_labo.idea_telescope.util.SystemClock

data class User(
  val userId: UserId,
  val userCreated: SystemClock,
  val userName: UserName,
  val userBio: UserBio,
  val userIcon: UserIcon,
  val userIdeas: List<IdeaId>,
  val userFollows: List<UserId>,
  val userFollowers: List<UserId>,
  val userKeeps: List<IdeaId>,
  val userTheme: UserTheme
) {
}