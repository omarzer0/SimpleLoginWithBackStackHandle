package az.omar.jobtest.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import az.omar.jobtest.R
import az.omar.jobtest.utils.Utils.handleBackStack
import az.omar.jobtest.utils.Utils.toStartFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        handleBackStack(requireActivity(), viewLifecycleOwner, parentFragmentManager)
        btn_log_out_home_frag.setOnClickListener {
            toStartFragment(parentFragmentManager)
        }
    }
}