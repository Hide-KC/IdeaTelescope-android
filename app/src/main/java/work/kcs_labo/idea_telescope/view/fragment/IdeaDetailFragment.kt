package work.kcs_labo.idea_telescope.view.fragment;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Created by hide1 on 2020/09/07.
 * ProjectName IdeaTelescope
 */

class IdeaDetailFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return super.onCreateView(inflater, container, savedInstanceState)
  }

  companion object {
    fun getInstance(bundle: Bundle? = null): IdeaDetailFragment {
      val fragment = IdeaDetailFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}