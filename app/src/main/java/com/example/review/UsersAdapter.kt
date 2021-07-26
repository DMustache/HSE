package com.example.review

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsersAdapter(val itemsId: ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    companion object {
        const val RECYCLER_USER_INFO = 0
        const val RECYCLER_PROJECT_INFO = 1
        const val RECYCLER_SKILLS_FILTER = 2
        const val RECYCLER_SKILLS = 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        when (viewType) {
            RECYCLER_USER_INFO -> return ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.recycler_user_info, parent, false)
            )
            RECYCLER_PROJECT_INFO -> return ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.recycler_about_project, parent, false)
            )
            RECYCLER_SKILLS_FILTER -> return ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.recycler_skills_filter, parent, false)
            )
            RECYCLER_SKILLS -> return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.recycler_skills, parent, false)
            )
            else -> return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false))
        }
        // val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)

        // return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstname.text = itemsId[position]
    }

    override fun getItemCount() = 4

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstname: TextView = itemView.findViewById(R.id.firstName)
    }
}
