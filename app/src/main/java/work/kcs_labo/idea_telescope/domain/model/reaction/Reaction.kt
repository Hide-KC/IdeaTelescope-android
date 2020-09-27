package work.kcs_labo.idea_telescope.domain.model.reaction

data class Reaction private constructor(
  val reactionId: ReactionId
) {

  class Builder {
    private var reactionId: ReactionId? = null

    //TODO Reactionのバリデーションの記述
    fun setReactionId(reactionId: ReactionId) = also {
      it.reactionId = reactionId
    }

    fun build() = Reaction(
      reactionId ?: ReactionId()
    )
  }
}