package br.com.gg.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {
    open fun showSnack(string: String, long: Boolean = false) {}
}
