package br.com.gg.app

import android.util.Log
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    open fun showSnack(string: String, long: Boolean = false) {
        (activity as? BaseActivity)?.showSnack(string, long)
            ?: Log.d("BaseFragment", "Not child of BaseActivity")
    }
}