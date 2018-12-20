package com.ruland.davidr.holiday.holiday.screen.main

import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AlertDialog
import com.ruland.davidr.holiday.R
import com.ruland.davidr.holiday.holiday.screen.wish.WishActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    private var addB: FloatingActionButton? = null
    private var editB: FloatingActionButton? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setLocale("en")
        addB = findViewById(R.id.addL)
        editB = findViewById(R.id.editB)
        addB?.setOnClickListener {
            val intent = Intent(applicationContext, WishActivity::class.java)
            startActivity(intent)

        }
        editB?.setOnClickListener {
            showDialog()



        }
    }
    private fun showDialog(){
        val dialogBuilder = AlertDialog.Builder(this)


        dialogBuilder.setMessage("Choose language...")
                .setCancelable(false)

                .setPositiveButton("English", DialogInterface.OnClickListener {
                    dialog, id->
                    setLocale("en")
                    finish()
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                })

                .setNegativeButton("Swedish", DialogInterface.OnClickListener {
                    dialog, id ->
                    setLocale("sv")
                    finish()
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)

                })

                .setNeutralButton("Danish", DialogInterface.OnClickListener {
                    dialog, id ->
                    setLocale("da")
                    finish()
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                })


        val alert = dialogBuilder.create()
        alert.setTitle("Holidays wishlist")
        alert.show()
    }





    private fun setLocale(s:String) {
        val locale = Locale(s)
        val r = resources
        val displayMetrics = r.displayMetrics
        val config = r.configuration
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            config.setLocale(locale)
        }
        r.updateConfiguration(config,displayMetrics)

    }
}