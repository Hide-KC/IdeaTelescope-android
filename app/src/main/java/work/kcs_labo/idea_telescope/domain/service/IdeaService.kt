package work.kcs_labo.idea_telescope.domain.service

import work.kcs_labo.idea_telescope.domain.model.idea.IdeaId
import work.kcs_labo.idea_telescope.domain.model.idea.db.IdeaQueryService
import work.kcs_labo.idea_telescope.domain.model.idea.db.IdeaRepository

class IdeaService private constructor(
  private val repository: IdeaRepository,
  private val queryService: IdeaQueryService
) {

  suspend fun getNewGUID(): IdeaId = queryService.getNewGUID()

  suspend fun isExist(ideaId: IdeaId): Boolean = repository.isExist(ideaId)

  companion object {
    private var INSTANCE: IdeaService? = null
    private val lock = Any()

    fun getInstance(repository: IdeaRepository, queryService: IdeaQueryService): IdeaService =
      INSTANCE ?: synchronized(lock) {
        INSTANCE ?: IdeaService(repository, queryService)
          .also { INSTANCE = it }
      }
  }
}