package org.jangtechtown.listviewpractice_20210319.adapters

import android.content.Context
import android.widget.ArrayAdapter
import org.jangtechtown.listviewpractice_20210319.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resID : Int,
    val mList: ArrayList<Student>) : ArrayAdapter<Student> (mContext, resID, mList) {
}