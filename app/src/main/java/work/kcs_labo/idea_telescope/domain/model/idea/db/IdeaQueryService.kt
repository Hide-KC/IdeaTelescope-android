package work.kcs_labo.idea_telescope.domain.model.idea.db

import work.kcs_labo.idea_telescope.domain.model.idea.Idea
import work.kcs_labo.idea_telescope.domain.model.idea.IdeaId

interface IdeaQueryService {
  suspend fun getNewGUID(): IdeaId
  suspend fun createNewIdea(idea: Idea): Idea
}