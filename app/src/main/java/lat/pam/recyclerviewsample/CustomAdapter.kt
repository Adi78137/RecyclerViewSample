package lat.pam.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (private val mList: List<ItemsViewModel>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int):
            CustomAdapter.ViewHolder {
        // inflates the card view design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder (holder: CustomAdapter.ViewHolder,
                                   position: Int) {
        val ItemsViewModel = mList[position]
        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder (ItemView: View): RecyclerView.ViewHolder (ItemView) {
        // Catatan: Pastikan ID textView sesuai dengan yang ada di card_view_design.xml
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}