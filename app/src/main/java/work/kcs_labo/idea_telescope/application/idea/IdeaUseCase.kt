package work.kcs_labo.idea_telescope.application.idea

import androidx.lifecycle.Lifecycle

interface IdeaUseCase {
  suspend fun create(data: IdeaCreateInputData): IdeaCreateOutputData
  suspend fun read(data: IdeaReadInputData): List<IdeaReadOutputData>
  suspend fun update(data: IdeaUpdateInputData): IdeaUpdateOutputData
  suspend fun delete(data: IdeaDeleteInputData): IdeaDeleteOutputData
  suspend fun onDestroy(lifecycle: Lifecycle)
}