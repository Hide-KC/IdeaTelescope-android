package work.kcs_labo.idea_telescope.view.fragment;

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

/**
 * Created by hide1 on 2020/09/07.
 * ProjectName IdeaTelescope
 */

class QuoteIdeaDialogFragment : DialogFragment() {

  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
    return super.onCreateDialog(savedInstanceState)
  }

  companion object {
    fun getInstance(bundle: Bundle? = null): QuoteIdeaDialogFragment {
      val fragment = QuoteIdeaDialogFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}