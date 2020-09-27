package work.kcs_labo.idea_telescope.domain.service

class ReactionService private constructor() {
  companion object {
    private var INSTANCE: ReactionService? = null
    private val lock = Any()

    fun getInstance(): ReactionService =
      INSTANCE ?: synchronized(lock) {
        INSTANCE ?: ReactionService()
          .also { INSTANCE = it }
      }
  }
}