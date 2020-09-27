package work.kcs_labo.idea_telescope.application.idea.interactor

import androidx.lifecycle.Lifecycle
import kotlinx.coroutines.*
import work.kcs_labo.idea_telescope.application.idea.*
import work.kcs_labo.idea_telescope.domain.model.idea.Idea
import work.kcs_labo.idea_telescope.domain.model.idea.db.IdeaQueryService
import work.kcs_labo.idea_telescope.domain.model.idea.db.IdeaRepository
import work.kcs_labo.idea_telescope.domain.service.IdeaService
import kotlin.coroutines.CoroutineContext

class IdeaInteractor(
  private val repository: IdeaRepository,
  private val queryService: IdeaQueryService
) : IdeaUseCase, CoroutineScope {

  override val coroutineContext: CoroutineContext
    get() = Dispatchers.IO + job

  private val job = Job()

  override suspend fun create(data: IdeaCreateInputData): IdeaCreateOutputData {
    val ideaService = IdeaService.getInstance(repository, queryService)

    val result = withContext(coroutineContext) {
      val ideaId = ideaService.getNewGUID()
      val builder = Idea.Builder()
        .setIdeaId(ideaId)
        .setIdeaAuthorId(data.ideaAuthorId)
        .setIdeaCreated(data.ideaCreated)
        .setIdeaTitle(data.ideaTitle)
        .setIdeaContent(data.ideaContent)
        .setIdeaTags(data.ideaTags)
        .setIdeaMedias(data.ideaMedias)
        .setIdeaQuoted(data.ideaQuoted)
        .setIdeaTheme(data.ideaTheme)
        .setVisibility(data.ideaVisibility)

      val buildIdea = builder.build()

      queryService.createNewIdea(buildIdea)
    }

    return IdeaCreateOutputData(result.ideaId.id)
  }

  override suspend fun read(data: IdeaReadInputData): List<IdeaReadOutputData> {
    TODO("Not yet implemented")
  }

  override suspend fun update(data: IdeaUpdateInputData): IdeaUpdateOutputData {
    TODO("Not yet implemented")
  }

  override suspend fun delete(data: IdeaDeleteInputData): IdeaDeleteOutputData {
    TODO("Not yet implemented")
  }

  override suspend fun onDestroy(lifecycle: Lifecycle) {
    if (coroutineContext.isActive) coroutineContext.cancel(CancellationException("cause: ${lifecycle.currentState.name}"))
  }
}