package work.kcs_labo.idea_telescope.domain.service

class UserService private constructor() {
  companion object {
    private var INSTANCE: UserService? = null
    private val lock = Any()

    fun getInstance(): UserService =
      INSTANCE ?: synchronized(lock) {
        INSTANCE ?: UserService()
          .also { INSTANCE = it }
      }
  }
}