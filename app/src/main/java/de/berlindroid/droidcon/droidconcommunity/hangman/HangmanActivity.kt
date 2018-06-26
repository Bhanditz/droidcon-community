/*
 * Copyright 2018 GDG Community
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package de.berlindroid.droidcon.droidconcommunity.hangman

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import de.berlindroid.droidcon.droidconcommunity.R

class HangmanActivity : AppCompatActivity() {

    private val keyboard by lazy {
        mutableMapOf<String, Button>().apply {
            fun String.addButton() {
                put(this, createButton())
            }

            "Q".addButton()
            "W".addButton()
            "E".addButton()
            "R".addButton()
            "T".addButton()
            "Y".addButton()
            "U".addButton()
            "I".addButton()
            "O".addButton()
            "P".addButton()
            "A".addButton()
            "S".addButton()
            "D".addButton()
            "F".addButton()
            "G".addButton()
            "H".addButton()
            "J".addButton()
            "K".addButton()
            "K".addButton()
            "L".addButton()
            "Z".addButton()
            "X".addButton()
            "C".addButton()
            "V".addButton()
            "B".addButton()
            "N".addButton()
            "M".addButton()
        }
    }

    private fun String.createButton() = Button(this@HangmanActivity).apply { text = this@createButton }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)

        findViewById<GridLayout>(R.id.keyboard).apply {
            keyboard.forEach { (_, button) ->
                addView(button)
            }
        }
    }
}