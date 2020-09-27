package work.kcs_labo.idea_telescope.domain.service

class TagService private constructor() {
  companion object {
    private var INSTANCE: TagService? = null
    private val lock = Any()

    fun getInstance(): TagService =
      INSTANCE ?: synchronized(lock) {
        INSTANCE ?: TagService()
          .also { INSTANCE = it }
      }
  }
}