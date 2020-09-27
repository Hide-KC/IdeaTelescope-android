package work.kcs_labo.idea_telescope.domain.model.idea.db

import work.kcs_labo.idea_telescope.domain.model.idea.IdeaId

interface IdeaRepository {
  suspend fun isExist(ideaId: IdeaId): Boolean
  suspend fun getGUID(): Long
}