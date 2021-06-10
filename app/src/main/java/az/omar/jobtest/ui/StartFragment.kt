package az.omar.jobtest.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import az.omar.jobtest.R
import az.omar.jobtest.utils.Utils.toLoginFragment
import az.omar.jobtest.utils.Utils.toRegistrationFragment
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment(R.layout.fragment_start), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setClickListenerToViews()
    }

    private fun setClickListenerToViews() {
        btn_login_start_frag.setOnClickListener(this)
        btn_register_start_frag.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_login_start_frag -> toLoginFragment(parentFragmentManager)
            R.id.btn_register_start_frag -> toRegistrationFragment(parentFragmentManager)
        }
    }
}