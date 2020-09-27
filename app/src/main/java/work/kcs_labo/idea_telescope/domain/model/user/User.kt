package work.kcs_labo.idea_telescope.domain.model.user

import work.kcs_labo.idea_telescope.domain.model.Visibility
import work.kcs_labo.idea_telescope.domain.model.idea.IdeaId
import work.kcs_labo.idea_telescope.util.SystemClock
import java.util.*

data class User private constructor(
  val userId: UserId,
  val userCreated: SystemClock,
  val userName: UserName,
  val userBio: UserBio,
  val userIcon: UserIcon,
  val userIdeas: List<IdeaId>,
  val userFollows: List<UserId>,
  val userFollowers: List<UserId>,
  val userKeeps: List<IdeaId>,
  val userTheme: UserTheme,
  val userVisibility: Visibility
) {

  class Builder {
    private var userId: UserId? = null
    private var userCreated: SystemClock? = null
    private var userName: UserName? = null
    private var userBio: UserBio? = null
    private var userIcon: UserIcon? = null
    private var userIdeas: List<IdeaId>? = null
    private var userFollows: List<UserId>? = null
    private var userFollowers: List<UserId>? = null
    private var userKeeps: List<IdeaId>? = null
    private var userTheme: UserTheme? = null
    private var userVisibility: Visibility = Visibility.Public

    //TODO Userのバリデーションの記述
    fun setUserId(userId: UserId) = also {
      it.userId = userId
    }

    fun setUserCreated(userCreated: SystemClock) = also {
      it.userCreated = userCreated
    }

    fun setUserName(userName: UserName) = also {
      it.userName = userName
    }

    fun setUserBio(userBio: UserBio) = also {
      it.userBio = userBio
    }

    fun setUserIcon(userIcon: UserIcon) = also {
      it.userIcon = userIcon
    }

    fun setUserIdeas(userIdeas: List<IdeaId>) = also {
      it.userIdeas = userIdeas
    }

    fun setUserFollows(userFollows: List<UserId>) = also {
      it.userFollows = userFollows
    }

    fun setUserFollowers(userFollowers: List<UserId>) = also {
      it.userFollowers = userFollowers
    }

    fun setUserKeeps(userKeeps: List<IdeaId>) = also {
      it.userKeeps = userKeeps
    }

    fun setUserTheme(userTheme: UserTheme) = also {
      it.userTheme = userTheme
    }

    fun setVisibility(userVisibility: Visibility) = also {
      it.userVisibility = userVisibility
    }

    fun build(): User = User(
      userId ?: UserId(),
      userCreated ?: object : SystemClock {
        override fun getTimeMillis(): Long = System.currentTimeMillis()
        override fun getLocale(): Locale = Locale.JAPAN
        override fun getTimeZone(): TimeZone = TimeZone.getTimeZone("Asia/Tokyo")
      },
      userName ?: UserName(),
      userBio ?: UserBio(),
      userIcon ?: UserIcon(),
      userIdeas ?: listOf(),
      userFollows ?: listOf(),
      userFollowers ?: listOf(),
      userKeeps ?: listOf(),
      userTheme ?: UserTheme(),
      userVisibility
    )
  }
}
