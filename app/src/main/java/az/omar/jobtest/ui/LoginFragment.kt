package az.omar.jobtest.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import az.omar.jobtest.R
import az.omar.jobtest.utils.Utils.toHomeFragment
import az.omar.jobtest.utils.Utils.toRegistrationFragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setClickListenerToViews()
    }

    private fun setClickListenerToViews() {
        btn_log_in_login_frag.setOnClickListener(this)
        tv_skip_login_frag.setOnClickListener(this)
        tv_create_new_account_login_frag.setOnClickListener(this)
        tv_forget_password_login_frag.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_forget_password_login_frag,
            R.id.btn_log_in_login_frag,
            R.id.tv_skip_login_frag -> toHomeFragment(parentFragmentManager)

            R.id.tv_create_new_account_login_frag -> toRegistrationFragment(parentFragmentManager)
        }
    }
}