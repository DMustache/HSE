import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.review.R

class UsersAdapter(val users: ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstname.text = users[position]
    }

    override fun getItemCount() = 4

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstname: TextView = itemView.findViewById(R.id.firstName)
    }
}