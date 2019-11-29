package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Space
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addRow(view: View) {

        val textview2 = TextView(this)
        val textview1 = TextView(this)
        if ((texttwo.text.toString().isNullOrEmpty() || textone.text.toString().isNullOrEmpty())) {
            return
        }else{
            val tableRow = TableRow(getApplicationContext())
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            layoutParams.setMargins(0, 4, 4, 4)
            textview1.setText(texttwo.text.toString())


            textview1.layoutParams = layoutParams

            textview1.setBackgroundColor(resources.getColor(R.color.pink))
            val spaceone = Space(applicationContext)


            textview2.layoutParams = layoutParams
            textview2.setText(textone.text.toString())

            textview2.setBackgroundColor(resources.getColor(R.color.pink))

            tableRow.addView(textview1)
            tableRow.addView(textview2)

// Finally add the created row row into layout
            tableLayoutid.addView(tableRow) // id from Layout_file
        }
    }
}
