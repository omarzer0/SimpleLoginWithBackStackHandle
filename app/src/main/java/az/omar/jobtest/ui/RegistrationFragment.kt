package az.omar.jobtest.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import az.omar.jobtest.R
import az.omar.jobtest.utils.Utils.toHomeFragment
import az.omar.jobtest.utils.Utils.toLoginFragment
import kotlinx.android.synthetic.main.fragment_registration.*

class RegistrationFragment : Fragment(R.layout.fragment_registration), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setClickListenerToViews()
    }

    private fun setClickListenerToViews() {
        btn_register_register_frag.setOnClickListener(this)
        tv_skip_register_frag.setOnClickListener(this)
        tv_log_in_register_frag.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_register_register_frag, R.id.tv_skip_register_frag ->
                toHomeFragment(parentFragmentManager)
            R.id.tv_log_in_register_frag -> toLoginFragment(parentFragmentManager)
        }
    }

}