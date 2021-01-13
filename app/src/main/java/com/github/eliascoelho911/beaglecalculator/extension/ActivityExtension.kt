package com.github.eliascoelho911.beaglecalculator.extension

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, text, duration).show()