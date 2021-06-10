package az.omar.jobtest.utils

import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleOwner
import az.omar.jobtest.R
import az.omar.jobtest.ui.HomeFragment
import az.omar.jobtest.ui.LoginFragment
import az.omar.jobtest.ui.RegistrationFragment
import az.omar.jobtest.ui.StartFragment

object Utils {

    private const val LOGIN_FRAGMENT_NAME = "Login Fragment"
    private const val REGISTRATION_FRAGMENT_NAME = "Registration Fragment"
    private const val HOME_FRAGMENT_NAME = "Home Fragment"

    private fun transitionFragment(
        parentFragmentManager: FragmentManager,
        fragment: Fragment,
        stackName: String
    ) {
        parentFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.fade_in,
                R.anim.fade_out
            )
            .add(
                R.id.fl_main_container,
                fragment
            ).addToBackStack(stackName).commit()
    }

    fun toHomeFragment(parentFragmentManager: FragmentManager) {
        transitionFragment(parentFragmentManager, HomeFragment(), HOME_FRAGMENT_NAME)
    }

    fun toRegistrationFragment(parentFragmentManager: FragmentManager) {
        transitionFragment(
            parentFragmentManager, RegistrationFragment(), REGISTRATION_FRAGMENT_NAME
        )
    }

    fun toLoginFragment(parentFragmentManager: FragmentManager) {
        transitionFragment(
            parentFragmentManager, LoginFragment(), LOGIN_FRAGMENT_NAME
        )
    }

    fun toStartFragment(parentFragmentManager: FragmentManager) {
        parentFragmentManager.beginTransaction()

            .add(
                R.id.fl_main_container,
                StartFragment()
            ).commit()
        emptyBackStack(parentFragmentManager)
    }

    private fun emptyBackStack(parentFragmentManager: FragmentManager) {
        for (i in 0 until parentFragmentManager.backStackEntryCount)
            parentFragmentManager.popBackStack()
    }

    fun handleBackStack(
        activity: FragmentActivity,
        viewLifecycleOwner: LifecycleOwner,
        parentFragmentManager: FragmentManager
    ) {
        activity.onBackPressedDispatcher.addCallback(viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    toStartFragment(parentFragmentManager)
                }
            })
    }
}