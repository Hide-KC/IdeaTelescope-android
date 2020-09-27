package work.kcs_labo.idea_telescope.application.idea

data class IdeaReadInputData(
  val ideaId: Long? = null,
  val ideaAuthorId: Long? = null,
  val ideaAuthorName: String? = null,
  val ideaTitle: String? = null,
  val ideaContent: String? = null,
  val ideaQuoted: Long? = null
) {
}