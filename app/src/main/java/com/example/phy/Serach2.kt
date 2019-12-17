package com.example.phy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.*

class Serach2 : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        val search = findViewById<SearchView>(R.id.search) as SearchView

        val list = findViewById<ListView>(R.id.listView) as ListView
        val viewLay = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_layout))
        val imageView = findViewById<ImageView>(R.id.toastImage)

        val kin = arrayOf(
                getString(R.string.kin_1), getString(R.string.kin_2), getString(R.string.kin_3),
                getString(R.string.kin_4), getString(R.string.kin_5), getString(R.string.kin_6),
                getString(R.string.kin_7), getString(R.string.kin_8), getString(R.string.kin_9),
                getString(R.string.kin_10), getString(R.string.kin_11), getString(R.string.kin_12),
                getString(R.string.kin_13), getString(R.string.kin_14), getString(R.string.kin_15),
                getString(R.string.kin_16), getString(R.string.kin_17), getString(R.string.kin_18),
                getString(R.string.kin_19), getString(R.string.kin_20), getString(R.string.kin_21),
                getString(R.string.kin_22), getString(R.string.kin_23), getString(R.string.kin_24),
                getString(R.string.kin_25), getString(R.string.kin_26), getString(R.string.kin_27),
                getString(R.string.kin_28), getString(R.string.kin_29), getString(R.string.kin_30),
                getString(R.string.kin_31), getString(R.string.kin_32),

                getString(R.string.din_1), getString(R.string.din_2), getString(R.string.din_3),
                getString(R.string.din_4), getString(R.string.din_5), getString(R.string.din_6),
                getString(R.string.din_7), getString(R.string.din_7), getString(R.string.din_8),
                getString(R.string.din_10), getString(R.string.din_11), getString(R.string.din_12),
                getString(R.string.din_13), getString(R.string.din_14), getString(R.string.din_15),
                getString(R.string.din_16), getString(R.string.din_17), getString(R.string.din_18),
                getString(R.string.din_19), getString(R.string.din_20), getString(R.string.din_21),
                getString(R.string.din_22), getString(R.string.din_23), getString(R.string.din_24),
                getString(R.string.din_25), getString(R.string.din_26), getString(R.string.din_27),

                getString(R.string.gid_1), getString(R.string.gid_2), getString(R.string.gid_3),
                getString(R.string.gid_4), getString(R.string.gid_5), getString(R.string.gid_6),
                getString(R.string.gid_7), getString(R.string.gid_8), getString(R.string.gid_9),
                getString(R.string.gid_10), getString(R.string.gid_11),

                getString(R.string.zsm_1), getString(R.string.zsm_2), getString(R.string.zsm_3),
                getString(R.string.zsm_4), getString(R.string.zsm_5), getString(R.string.zsm_6),
                getString(R.string.zsm_7), getString(R.string.zsm_8), getString(R.string.zsm_9),
                getString(R.string.zsm_10), getString(R.string.zsm_11), getString(R.string.zsm_12),
                getString(R.string.zsm_13), getString(R.string.zsm_14), getString(R.string.zsm_15),
                getString(R.string.zsm_16), getString(R.string.zsm_17), getString(R.string.zsm_18),
                getString(R.string.zsm_19)
        )


        val countryAdap : ArrayAdapter<String> =
                ArrayAdapter(this, R.layout.list_iteam, kin)

        list.adapter = countryAdap

        list.setOnItemClickListener { parent, view, position, id ->
            val itemValue = list.getItemAtPosition(position) as String
            val custom_toast = Toast.makeText(this,"", Toast.LENGTH_LONG)
            custom_toast.setGravity(Gravity.CENTER,0,0)
            val view = custom_toast.view

            when(itemValue) {
                getString(R.string.kin_1) -> view.setBackgroundResource(R.drawable.kk_1)
                getString(R.string.kin_2) -> view.setBackgroundResource(R.drawable.kk_2)
                getString(R.string.kin_3) -> view.setBackgroundResource(R.drawable.k_3)
                getString(R.string.kin_4) -> view.setBackgroundResource(R.drawable.kk_4)
                getString(R.string.kin_5) -> view.setBackgroundResource(R.drawable.kk_5)
                getString(R.string.kin_6) -> view.setBackgroundResource(R.drawable.kk_6)
                getString(R.string.kin_7) -> view.setBackgroundResource(R.drawable.kk_7)
                getString(R.string.kin_8) -> view.setBackgroundResource(R.drawable.kk_8)
                getString(R.string.kin_9) -> view.setBackgroundResource(R.drawable.kk_9)
                getString(R.string.kin_10) -> view.setBackgroundResource(R.drawable.kk_10)
                getString(R.string.kin_11) -> view.setBackgroundResource(R.drawable.k_11)
                getString(R.string.kin_12) -> view.setBackgroundResource(R.drawable.kk_12)
                getString(R.string.kin_13) -> view.setBackgroundResource(R.drawable.k_13)
                getString(R.string.kin_14) -> view.setBackgroundResource(R.drawable.k_14)
                getString(R.string.kin_15) -> view.setBackgroundResource(R.drawable.kk_15)
                getString(R.string.kin_16) -> view.setBackgroundResource(R.drawable.kk_16)
                getString(R.string.kin_17) -> view.setBackgroundResource(R.drawable.kk_17)
                getString(R.string.kin_18) -> view.setBackgroundResource(R.drawable.kk_18)
                getString(R.string.kin_19) -> view.setBackgroundResource(R.drawable.kk_19)
                getString(R.string.kin_20) -> view.setBackgroundResource(R.drawable.k_20)
                getString(R.string.kin_21) -> view.setBackgroundResource(R.drawable.kk_21)
                getString(R.string.kin_22) -> view.setBackgroundResource(R.drawable.kk_22)
                getString(R.string.kin_23) -> view.setBackgroundResource(R.drawable.kk_23)
                getString(R.string.kin_24) -> view.setBackgroundResource(R.drawable.kk_24)
                getString(R.string.kin_25) -> view.setBackgroundResource(R.drawable.kk_25)
                getString(R.string.kin_26) -> view.setBackgroundResource(R.drawable.kk_26)
                getString(R.string.kin_27) -> view.setBackgroundResource(R.drawable.kk_27)
                getString(R.string.kin_28) -> view.setBackgroundResource(R.drawable.kk_28)
                getString(R.string.kin_29) -> view.setBackgroundResource(R.drawable.kk_29)
                getString(R.string.kin_30) -> view.setBackgroundResource(R.drawable.kk_30)
                getString(R.string.kin_31) -> view.setBackgroundResource(R.drawable.k_31)
                getString(R.string.kin_32) -> view.setBackgroundResource(R.drawable.k_32)

                getString(R.string.din_1) -> view.setBackgroundResource(R.drawable.d_1)
                getString(R.string.din_2) -> view.setBackgroundResource(R.drawable.d_2)
                getString(R.string.din_3) -> view.setBackgroundResource(R.drawable.d_3)
                getString(R.string.din_4) -> view.setBackgroundResource(R.drawable.d_4)
                getString(R.string.din_5) -> view.setBackgroundResource(R.drawable.d_5)
                getString(R.string.din_6) -> view.setBackgroundResource(R.drawable.d_6)
                getString(R.string.din_7) -> view.setBackgroundResource(R.drawable.d_7)
                getString(R.string.din_8) -> view.setBackgroundResource(R.drawable.d_8)
                getString(R.string.din_9) -> view.setBackgroundResource(R.drawable.d_9)
                getString(R.string.din_10) -> view.setBackgroundResource(R.drawable.d_10)
                getString(R.string.din_11) -> view.setBackgroundResource(R.drawable.d_11)
                getString(R.string.din_12) -> view.setBackgroundResource(R.drawable.d_12)
                getString(R.string.din_13) -> view.setBackgroundResource(R.drawable.d_13)
                getString(R.string.din_14) -> view.setBackgroundResource(R.drawable.d_14)
                getString(R.string.din_15) -> view.setBackgroundResource(R.drawable.d_15)
                getString(R.string.din_16) -> view.setBackgroundResource(R.drawable.d_16)
                getString(R.string.din_17) -> view.setBackgroundResource(R.drawable.d_17)
                getString(R.string.din_18) -> view.setBackgroundResource(R.drawable.d_18)
                getString(R.string.din_19) -> view.setBackgroundResource(R.drawable.d_19)
                getString(R.string.din_20) -> view.setBackgroundResource(R.drawable.d_20)
                getString(R.string.din_21) -> view.setBackgroundResource(R.drawable.d_21)
                getString(R.string.din_22) -> view.setBackgroundResource(R.drawable.d_22)
                getString(R.string.din_23) -> view.setBackgroundResource(R.drawable.d_23)
                getString(R.string.din_24) -> view.setBackgroundResource(R.drawable.d_24)
                getString(R.string.din_25) -> view.setBackgroundResource(R.drawable.d_25)
                getString(R.string.din_26) -> view.setBackgroundResource(R.drawable.d_26)

                getString(R.string.gid_1) -> view.setBackgroundResource(R.drawable.g_1)
                getString(R.string.gid_2) -> view.setBackgroundResource(R.drawable.g_2)
                getString(R.string.gid_3) -> view.setBackgroundResource(R.drawable.g_3)
                getString(R.string.gid_4) -> view.setBackgroundResource(R.drawable.g_4)
                getString(R.string.gid_5) -> view.setBackgroundResource(R.drawable.g_5)
                getString(R.string.gid_6) -> view.setBackgroundResource(R.drawable.g_6)
                getString(R.string.gid_7) -> view.setBackgroundResource(R.drawable.g_7)
                getString(R.string.gid_8) -> view.setBackgroundResource(R.drawable.g_8)
                getString(R.string.gid_9) -> view.setBackgroundResource(R.drawable.g_9)

                getString(R.string.zsm_1) -> view.setBackgroundResource(R.drawable.z_1)
                getString(R.string.zsm_2) -> view.setBackgroundResource(R.drawable.z_2)
                getString(R.string.zsm_3) -> view.setBackgroundResource(R.drawable.z_3)
                getString(R.string.zsm_4) -> view.setBackgroundResource(R.drawable.z_4)
                getString(R.string.zsm_5) -> view.setBackgroundResource(R.drawable.z_5)
                getString(R.string.zsm_6) -> view.setBackgroundResource(R.drawable.z_6)
                getString(R.string.zsm_7) -> view.setBackgroundResource(R.drawable.z_7)
                getString(R.string.zsm_8) -> view.setBackgroundResource(R.drawable.z_8)
                getString(R.string.zsm_9) -> view.setBackgroundResource(R.drawable.z_9)
                getString(R.string.zsm_10) -> view.setBackgroundResource(R.drawable.z_10)
                getString(R.string.zsm_11) -> view.setBackgroundResource(R.drawable.z_11)
                getString(R.string.zsm_12) -> view.setBackgroundResource(R.drawable.z_12)
                getString(R.string.zsm_13) -> view.setBackgroundResource(R.drawable.z_13)
                getString(R.string.zsm_14) -> view.setBackgroundResource(R.drawable.z_14)
                getString(R.string.zsm_15) -> view.setBackgroundResource(R.drawable.z_15)
                getString(R.string.zsm_16) -> view.setBackgroundResource(R.drawable.z_16)
                getString(R.string.zsm_17) -> view.setBackgroundResource(R.drawable.z_17)
                getString(R.string.zsm_18) -> view.setBackgroundResource(R.drawable.z_18)
                getString(R.string.zsm_19) -> view.setBackgroundResource(R.drawable.z_19)
        }

            custom_toast.show()
        }

        search.setOnQueryTextListener(object: SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                countryAdap.filter.filter(newText)
                return false
            }


        })
    }
}