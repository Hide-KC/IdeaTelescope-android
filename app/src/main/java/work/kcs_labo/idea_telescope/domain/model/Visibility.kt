package work.kcs_labo.idea_telescope.domain.model

sealed class Visibility {
  object Private : Visibility()
  object Public : Visibility()
  object Deleted : Visibility()
}