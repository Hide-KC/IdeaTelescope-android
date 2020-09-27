package work.kcs_labo.idea_telescope.domain.service

class MediaService private constructor() {
  companion object {
    private var INSTANCE: MediaService? = null
    private val lock = Any()

    fun getInstance(): MediaService =
      INSTANCE ?: synchronized(lock) {
        INSTANCE ?: MediaService()
          .also { INSTANCE = it }
      }
  }
}